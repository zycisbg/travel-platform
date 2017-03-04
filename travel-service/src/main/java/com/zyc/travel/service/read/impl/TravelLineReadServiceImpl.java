package com.zyc.travel.service.read.impl;

import com.zyc.travel.bpo.read.TravelLineReadBPO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.service.convert.impl.TravelLineConvertService;
import com.zyc.travel.service.read.TravelLineReadService;

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
        return null;
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
