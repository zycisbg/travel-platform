package com.zyc.travel.service.validate.impl;

import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineDetailVO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.service.validate.TravelLineDetailValidateService;
import com.zyc.travel.service.validate.TravelLineExtValidateService;
import com.zyc.travel.service.validate.TravelLineValidateService;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineValidateServiceImpl implements TravelLineValidateService {

    private TravelLineDetailValidateService myTravelLineDetailValidateService;

    private TravelLineExtValidateService myTravelLineExtValidateService;

    @Override
    public ResultVO foundationValidate(TravelLineVO travelLineVO) throws TravelException {

        if(travelLineVO.getTravelId()==null){

            throw new TravelException(ErrorInfoEnum.TRAVEL_ID_IS_NOT_NULL);
        }

        if(travelLineVO.getDateList()==null || travelLineVO.getDateList().size()==0){
            throw new TravelException(ErrorInfoEnum.GO_DATE_IS_NOT_NULL);
        }

        //验证详细信息
        if(travelLineVO.getTravelLineExtVO()!=null){
            myTravelLineExtValidateService.foundationValidate(travelLineVO.getTravelLineExtVO());
        }else{
            throw new TravelException(ErrorInfoEnum.TRAVEL_LINE_EXT_IS_NOT_NULL);
        }

        //验证每日详情
        if(travelLineVO.getTravelLineDetailVOList()!=null && travelLineVO.getTravelLineDetailVOList().size()!=0){
            for(TravelLineDetailVO vo : travelLineVO.getTravelLineDetailVOList()){
                myTravelLineDetailValidateService.foundationValidate(vo);
            }
        }else{
            throw new TravelException(ErrorInfoEnum.TRAVEL_LINE_DETAIL_IS_NOT_NULL);
        }

        return new ResultVO();
    }

    public TravelLineDetailValidateService getMyTravelLineDetailValidateService() {
        return myTravelLineDetailValidateService;
    }

    public void setMyTravelLineDetailValidateService(TravelLineDetailValidateService myTravelLineDetailValidateService) {
        this.myTravelLineDetailValidateService = myTravelLineDetailValidateService;
    }

    public TravelLineExtValidateService getMyTravelLineExtValidateService() {
        return myTravelLineExtValidateService;
    }

    public void setMyTravelLineExtValidateService(TravelLineExtValidateService myTravelLineExtValidateService) {
        this.myTravelLineExtValidateService = myTravelLineExtValidateService;
    }
}
