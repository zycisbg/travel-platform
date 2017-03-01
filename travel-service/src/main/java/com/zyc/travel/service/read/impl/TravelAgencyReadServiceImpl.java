package com.zyc.travel.service.read.impl;

import com.zyc.travel.bpo.read.TravelAgencyReadBPO;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.service.convert.impl.TravelAgencyConvertService;
import com.zyc.travel.service.read.TravelAgencyReadService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyc on 17/3/1.
 */
public class TravelAgencyReadServiceImpl implements TravelAgencyReadService{

    private TravelAgencyReadBPO myTravelAgencyReadBPO;

    private TravelAgencyConvertService myTravelAgencyConvertService = new TravelAgencyConvertService();
    @Override
    public TravelAgencyVO getById(Integer id) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("查询旅行社开始，id:"+id);
        if(id==null){
            return null;
        }
        TravelAgencyVO returnValue = new TravelAgencyVO();
        try{
            returnValue = myTravelAgencyConvertService.fromVO(myTravelAgencyReadBPO.getById(id));
        }catch (Exception e){
            Log.APP.info("查询旅行社异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("查询旅行社完成，returnValue:"+returnValue);
            Log.APP.info("查询旅行社详情完成,longtime:" + (System.currentTimeMillis() - beginDate));
            return returnValue;
        }
    }

    @Override
    public List<TravelAgencyVO> queryList(TravelAgencyVO param, int start, int limit) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("分页查询旅行社开始，param:"+param);
        List<TravelAgencyVO> returnValue = new ArrayList<>();

        try {
            List<JTravelAgency> JtravelAgencyList = myTravelAgencyReadBPO.getListByParam(myTravelAgencyConvertService.fromPO(param),start,limit);
            if(JtravelAgencyList.size()==0 || JtravelAgencyList==null){
                return null;
            }
            for(JTravelAgency item : JtravelAgencyList){
                returnValue.add(myTravelAgencyConvertService.fromVO(item));
            }
        }catch (Exception e){
            Log.APP.info("分页查询旅行社异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("分页查询旅行社结束，列表:"+returnValue);
            Log.APP.info("查询旅行社列表完成,longtime:" + (System.currentTimeMillis() - beginDate));

            return returnValue;
        }
    }

    public TravelAgencyReadBPO getMyTravelAgencyReadBPO() {
        return myTravelAgencyReadBPO;
    }

    public void setMyTravelAgencyReadBPO(TravelAgencyReadBPO myTravelAgencyReadBPO) {
        this.myTravelAgencyReadBPO = myTravelAgencyReadBPO;
    }
}
