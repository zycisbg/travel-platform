package com.zyc.travel.service.write.impl;

import com.mchange.v2.ser.SerializableUtils;
import com.zyc.travel.bpo.write.TravelLineWriteBPO;
import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.common.handler.DataBaseProxyHandler;
import com.zyc.travel.common.handler.ProxyInterface;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.service.convert.impl.TravelLineConvertService;
import com.zyc.travel.service.keys.RedisKeys;
import com.zyc.travel.service.validate.TravelLineValidateService;
import com.zyc.travel.service.write.TravelLineWriteService;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by zyc on 17/3/3.
 */
public class TravelLineWriteServiceImpl implements TravelLineWriteService{

    private TravelLineWriteBPO myTravelLineWriteBPO;

    private RedisUtil myRedisUtil;

    private TravelLineValidateService myTravelLineValidateService;

    private TravelLineConvertService travelLineConvertService = new TravelLineConvertService();

    @Override
    public ResultVO addTravelLine(TravelLineVO travelLineVO) {

        ResultVO returnValue = new ResultVO();
        int result;
        long beginDate = System.currentTimeMillis();
        try{
            Log.APP.info("添加线路开始 ");

            //验证
            returnValue = myTravelLineValidateService.foundationValidate(travelLineVO);
            //转换
            JTravelLine jTravelLine = travelLineConvertService.fromPO(travelLineVO);
            //添加
            if(travelLineVO.getDateList().size()==1){

                Log.APP.info("添加一条线路开始,travelLineVO:"+travelLineVO);

                if(travelLineVO.getDateList()!=null && travelLineVO.getDateList().size()==1){
                    jTravelLine.setGoDate(travelLineVO.getDateList().get(0));
                }

                //result = myTravelLineWriteBPO.addTravelLine(jTravelLine,jTravelLine.getjTravelLineDetailList(),jTravelLine.getjTravelLineExt());

                result = new DataBaseProxyHandler<TravelLineWriteBPO>(myRedisUtil).proxy(myTravelLineWriteBPO, new ProxyInterface() {
                    @Override
                    public Object doBegin(Object o, Object[] param) {
                        return null;
                    }

                    @Override
                    public Object doEnd(Object returnObj, Object o, Object[] param) {
                        try {
                            JTravelLine temp = (JTravelLine)param[0];
                            Log.APP.info("redis开始保存数据，id:"+temp.getId());
                            RedisUtil redisUtil = (RedisUtil) o;
                            Integer result = (Integer) returnObj;
                            Jedis jedis = redisUtil.getJedis();

                            if(result!=null && result>0){
                                jedis.set((RedisKeys.TRAVEL_LINE.getKey()+temp.getId()).getBytes(), SerializableUtils.toByteArray(param[0]));
                                Log.APP.info("redis保存一条线路完毕");
                            }

                        }catch (Exception e){
                            Log.APP.info("Redis添加旅行线路异常，信息： "+e.getMessage());
                            return null;
                        }

                        return null;
                    }
                }).addTravelLine(jTravelLine);

                Log.APP.info("添加一条线路结束");
                if(result<1){
                    throw new TravelException(ErrorInfoEnum.SYS_ERROR);
                }

            }else{
                Log.APP.info("添加多条线路开始,size:"+travelLineVO.getDateList().size()+"..travelLineVO:"+travelLineVO);
                List<Integer> idList= new DataBaseProxyHandler<TravelLineWriteBPO>(myRedisUtil).proxy(myTravelLineWriteBPO, new ProxyInterface() {
                    @Override
                    public Object doBegin(Object o, Object[] param) {
                        return null;
                    }

                    @Override
                    public Object doEnd(Object returnObj, Object o, Object[] param) {
                        try {
                            JTravelLine temp = (JTravelLine)param[0];
                            List<Integer> idList = (List<Integer>) returnObj;

                            Log.APP.info("redis开始保存数据，保存ids："+idList);
                            RedisUtil redisUtil = (RedisUtil) o;
                            Jedis jedis = redisUtil.getJedis();

                            if(idList!=null && idList.size()!=0){
                                for(Integer id :idList){
                                    temp.setId(id);
                                    jedis.set((RedisKeys.TRAVEL_LINE.getKey()+temp.getId()).getBytes(), SerializableUtils.toByteArray(temp));
                                }
                                Log.APP.info("redis保存多条线路完毕");
                            }

                        }catch (Exception e){
                            Log.APP.info("Redis添加旅行线路异常，信息： "+e.getMessage());
                            return null;
                        }

                        return null;
                    }
                }).addTravelLines(jTravelLine,travelLineVO.getDateList());
                Log.APP.info("添加多条线路结束");
                if(idList==null){
                    throw new TravelException(ErrorInfoEnum.SYS_ERROR);
                }
            }

        }catch (TravelException te){
            Log.APP.info("添加旅行线路业务异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            Log.APP.info("添加旅行线路系统异常 ,异常信息:"+e.getMessage());
            returnValue.setErrorCode(ErrorInfoEnum.SYS_ERROR.getCode());
            returnValue.setErrorInfo(ErrorInfoEnum.SYS_ERROR.getInfo());
        }finally {
            Log.APP.info("添加旅行线路完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }
    }

    @Override
    public ResultVO updateTravelLine(TravelLineVO travelLineVO) {
        ResultVO returnValue = new ResultVO();
        int result;
        long beginDate = System.currentTimeMillis();
        try{
            Log.APP.info("更新线路开始 ");

            //验证
            returnValue = myTravelLineValidateService.foundationValidate(travelLineVO);
            //转换
            JTravelLine jTravelLine = travelLineConvertService.fromPO(travelLineVO);

            Log.APP.info("更新一条线路开始,travelLineVO:"+travelLineVO);

            result = new DataBaseProxyHandler<TravelLineWriteBPO>(myRedisUtil).proxy(myTravelLineWriteBPO, new ProxyInterface() {
                @Override
                public Object doBegin(Object o, Object[] param) {
                    return null;
                }

                @Override
                public Object doEnd(Object returnObj, Object o, Object[] param) {
                    try {
                        JTravelLine temp = (JTravelLine)param[0];
                        Log.APP.info("redis开始更新数据，id:"+temp.getId());
                        RedisUtil redisUtil = (RedisUtil) o;
                        Integer result = (Integer) returnObj;
                        Jedis jedis = redisUtil.getJedis();

                        if(result!=null && result>0){
                            jedis.set((RedisKeys.TRAVEL_LINE.getKey()+temp.getId()).getBytes(), SerializableUtils.toByteArray(param[0]));

                            Log.APP.info("redis更新线路完毕");
                        }

                    }catch (Exception e){
                        Log.APP.info("Redis更新旅行线路异常，信息： "+e.getMessage());
                        return null;
                    }

                    return null;
                }
            }).updateTravelLine(jTravelLine);

            Log.APP.info("更新一条线路结束");
            if(result<1){
                throw new TravelException(ErrorInfoEnum.SYS_ERROR);
            }

        }catch (TravelException te){
            Log.APP.info("更新旅行线路业务异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            Log.APP.info("更新旅行线路系统异常 ,异常信息:"+e.getMessage());
            returnValue.setErrorCode(ErrorInfoEnum.SYS_ERROR.getCode());
            returnValue.setErrorInfo(ErrorInfoEnum.SYS_ERROR.getInfo());
        }finally {
            Log.APP.info("更新旅行线路完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }

    }

    public TravelLineWriteBPO getMyTravelLineWriteBPO() {
        return myTravelLineWriteBPO;
    }

    public void setMyTravelLineWriteBPO(TravelLineWriteBPO myTravelLineWriteBPO) {
        this.myTravelLineWriteBPO = myTravelLineWriteBPO;
    }

    public RedisUtil getMyRedisUtil() {
        return myRedisUtil;
    }

    public void setMyRedisUtil(RedisUtil myRedisUtil) {
        this.myRedisUtil = myRedisUtil;
    }

    public TravelLineValidateService getMyTravelLineValidateService() {
        return myTravelLineValidateService;
    }

    public void setMyTravelLineValidateService(TravelLineValidateService myTravelLineValidateService) {
        this.myTravelLineValidateService = myTravelLineValidateService;
    }
}
