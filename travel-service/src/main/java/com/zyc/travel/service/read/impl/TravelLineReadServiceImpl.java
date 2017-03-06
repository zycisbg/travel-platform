package com.zyc.travel.service.read.impl;

import com.zyc.travel.bpo.read.TravelLineReadBPO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.common.handler.DataBaseProxyHandler;
import com.zyc.travel.common.handler.ProxyInterface;
import com.zyc.travel.common.util.JsonUtils;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.service.convert.impl.TravelLineConvertService;
import com.zyc.travel.service.keys.RedisKeys;
import com.zyc.travel.service.read.TravelLineReadService;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyc on 17/3/3.
 */
public class TravelLineReadServiceImpl implements TravelLineReadService{

    private TravelLineReadBPO myTravelLineReadBPO;

    private RedisUtil myRedisUtil;

    private TravelLineConvertService myTravelLineConvertService = new TravelLineConvertService();

    
    @Override
    public TravelLineVO getById(Integer id) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("查询旅行线路开始，id:"+id);
        if(id==null){
            return null;
        }
        TravelLineVO returnValue = new TravelLineVO();
        try{
            JTravelLine jTravelLine = new DataBaseProxyHandler<TravelLineReadBPO>(myRedisUtil).proxy(myTravelLineReadBPO, new ProxyInterface() {
                @Override
                public Object doBegin(Object o, Object[] param) {
                    Log.APP.info("Redis 开始查询数据 id:"+param[0]);
                    try {
                        RedisUtil redisUtil = (RedisUtil) o;
                        // 标示符 + lineId
                        Jedis jedis = redisUtil.getJedis();
                        String value = jedis.get(RedisKeys.TRAVEL_LINE.getKey() + param[0]);
                        Log.APP.info("Redis 查询结果 value:"+value);
                        if (value != null) {
                            return JsonUtils.fromJSON(value,JTravelLine.class);
                        }
                    } catch (Exception e) {
                        Log.APP.info("Redis 数据异常 信息[" + e.getMessage() + "]");
                        return null;
                    }
                    return null;
                }

                @Override
                public Object doEnd(Object returnObj, Object o, Object[] param) {


                    return null;
                }
            }).getLineById(id);

            returnValue = myTravelLineConvertService.fromVO(jTravelLine);
        }catch (Exception e){
            Log.APP.info("查询旅行线路异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("查询旅行线路完成，returnValue:"+returnValue);
            Log.APP.info("查询旅行线路详情完成,longtime:" + (System.currentTimeMillis() - beginDate));
            return returnValue;
        }
    }

    @Override
    public List<TravelLineVO> queryList(TravelLineVO travelLineVO, Integer start, Integer limit) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("分页查询旅行线路开始，param:"+travelLineVO);
        List<TravelLineVO> returnValue = new ArrayList<>();

        try {
            List<JTravelLine> jTravelLineList = myTravelLineReadBPO.getListByParam(myTravelLineConvertService.fromPO(travelLineVO),start,limit);
            if(jTravelLineList.size()==0 || jTravelLineList==null){
                return null;
            }
            for(JTravelLine item : jTravelLineList){

                returnValue.add(myTravelLineConvertService.fromVO(item));
            }
        }catch (Exception e){
            Log.APP.info("分页查询旅行线路异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("分页查询旅行线路结束，列表:"+returnValue);
            Log.APP.info("查询旅行线路列表完成,longtime:" + (System.currentTimeMillis() - beginDate));

            return returnValue;
        }
    }

    public TravelLineReadBPO getMyTravelLineReadBPO() {
        return myTravelLineReadBPO;
    }

    public void setMyTravelLineReadBPO(TravelLineReadBPO myTravelLineReadBPO) {
        this.myTravelLineReadBPO = myTravelLineReadBPO;
    }

    public RedisUtil getMyRedisUtil() {
        return myRedisUtil;
    }

    public void setMyRedisUtil(RedisUtil myRedisUtil) {
        this.myRedisUtil = myRedisUtil;
    }
}
