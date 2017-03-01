package com.zyc.travel.service.read.impl;

import com.zyc.travel.bpo.read.TAContactsReadBPO;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.common.util.Log;
import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.service.convert.impl.TAContactsConvertService;
import com.zyc.travel.service.read.TAContactsReadService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsReadServiceImpl implements TAContactsReadService{

    private TAContactsReadBPO myTAContactsReadBPO;
    private TAContactsConvertService myTAContactsConvertService = new TAContactsConvertService();
    @Override
    public TravelAgencyContactsVO getById(Integer id) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("查询联系人开始，id:"+id);
        if(id==null){
            return null;
        }
        TravelAgencyContactsVO returnValue = new TravelAgencyContactsVO();
        try{
            returnValue = myTAContactsConvertService.fromVO(myTAContactsReadBPO.getById(id));
        }catch (Exception e){
            Log.APP.info("查询联系人异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("查询联系人完成，returnValue:"+returnValue);
            Log.APP.info("查询联系人详情完成,longtime:" + (System.currentTimeMillis() - beginDate));
            return returnValue;
        }
    }

    @Override
    public List<TravelAgencyContactsVO> queryList(TravelAgencyContactsVO param, Integer start, Integer limit) {
        long beginDate = System.currentTimeMillis();
        Log.APP.info("分页查询联系人开始，param:"+param);
        List<TravelAgencyContactsVO> returnValue = new ArrayList<>();

        try {
            List<JTravelAgencyContacts> JTravelAgencyContactsList = myTAContactsReadBPO.getListByParam(myTAContactsConvertService.fromPO(param),start,limit);
            if(JTravelAgencyContactsList.size()==0 || JTravelAgencyContactsList==null){
                return null;
            }
            for(JTravelAgencyContacts item : JTravelAgencyContactsList){
                returnValue.add(myTAContactsConvertService.fromVO(item));
            }
        }catch (Exception e){
            Log.APP.info("分页查询联系人异常，e:"+e.getMessage());
        }finally {
            Log.APP.info("分页查询联系人结束，列表:"+returnValue);
            Log.APP.info("查询联系人列表完成,longtime:" + (System.currentTimeMillis() - beginDate));

            return returnValue;
        }
    }

    public TAContactsReadBPO getMyTAContactsReadBPO() {
        return myTAContactsReadBPO;
    }

    public void setMyTAContactsReadBPO(TAContactsReadBPO myTAContactsReadBPO) {
        this.myTAContactsReadBPO = myTAContactsReadBPO;
    }
}
