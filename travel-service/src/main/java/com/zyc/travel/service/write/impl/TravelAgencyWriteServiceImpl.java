package com.zyc.travel.service.write.impl;

import com.zyc.travel.bpo.write.TravelAgencyWriteBPO;
import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.common.handler.DataBaseProxyHandler;
import com.zyc.travel.common.handler.ProxyInterface;
import com.zyc.travel.common.util.JsonUtils;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.service.convert.impl.TravelAgencyConvertService;
import com.zyc.travel.service.keys.RedisKeys;
import com.zyc.travel.service.validate.TravelAgencyValidateService;
import com.zyc.travel.service.validate.impl.TravelAgencyValidateServiceImpl;
import com.zyc.travel.service.write.TravelAgencyWriteService;
import redis.clients.jedis.Jedis;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelAgencyWriteServiceImpl implements TravelAgencyWriteService{

    private TravelAgencyWriteBPO myTravelAgencyWriteBPO;

    private RedisUtil myRedisUtil;

    private TravelAgencyValidateService myTravelAgencyValidateService = new TravelAgencyValidateServiceImpl();

    private TravelAgencyConvertService myTravelAgencyConvertService = new TravelAgencyConvertService();

    @Override
    public ResultVO saveTravelAgency(TravelAgencyVO travelAgencyVO) {
        ResultVO returnValue = new ResultVO();
        long beginDate = System.currentTimeMillis();

        try {
            Log.APP.info("添加旅行社开始 ");
            //验证
            returnValue = myTravelAgencyValidateService.foundationValidate(travelAgencyVO);
            JTravelAgency jTravelAgency = myTravelAgencyConvertService.fromPO(travelAgencyVO);
            Integer id = new DataBaseProxyHandler<TravelAgencyWriteBPO>(myRedisUtil).proxy(myTravelAgencyWriteBPO, new ProxyInterface() {
                @Override
                public Object doBegin(Object o, Object[] param) {
                    return null;
                }

                @Override
                public Object doEnd(Object returnObj, Object o,Object[] param) {
                    try {
                        Log.APP.info("redis开始保存数据，id"+returnObj);
                        RedisUtil redisUtil = (RedisUtil) o;
                        Integer id = (Integer) returnObj;
                        Jedis jedis = redisUtil.getJedis();
                        if(id!=null && id>0){
                            jedis.set(RedisKeys.TRAVEL_INFO.getKey()+id, JsonUtils.toJSON((JTravelAgency)param[0]));
                        }
                    }catch (Exception e){
                        Log.APP.info("Redis添加旅行社异常，信息： "+e.getMessage());
                        return null;
                    }

                    return null;
                }
            }).addTravelAgency(jTravelAgency);
            Log.APP.info("mysql保存完毕，id:"+id);
            if(id<=0)
                throw new TravelException(ErrorInfoEnum.SYS_ERROR);

        }catch (TravelException te){
            Log.APP.info("添加旅行社异常 ,异常信息:"+te.getErrorInfo());
            returnValue = new ResultVO(te.getErrorEnum());
        }catch (Exception e){
            e.printStackTrace();
            Log.APP.info("添加旅行社失败,失败原因:["+e.getMessage()+"]");
        }finally {
            Log.APP.info("添加旅行社完成,longtime:"+(System.currentTimeMillis()-beginDate));
            return returnValue;
        }
    }

    public TravelAgencyWriteBPO getMyTravelAgencyWriteBPO() {
        return myTravelAgencyWriteBPO;
    }

    public void setMyTravelAgencyWriteBPO(TravelAgencyWriteBPO myTravelAgencyWriteBPO) {
        this.myTravelAgencyWriteBPO = myTravelAgencyWriteBPO;
    }

    public RedisUtil getMyRedisUtil() {
        return myRedisUtil;
    }

    public void setMyRedisUtil(RedisUtil myRedisUtil) {
        this.myRedisUtil = myRedisUtil;
    }
}
