package com.zyc.travel.service.validate.impl;

import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.service.validate.TAContactsValidateService;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsValidateServiceImpl implements TAContactsValidateService{
    @Override
    public ResultVO foundationValidate(TravelAgencyContactsVO travelAgencyContactsVO) throws TravelException {

        if(travelAgencyContactsVO.getTravelId()==null){
            throw new TravelException(ErrorInfoEnum.TRAVEL_ID_IS_NOT_NULL);
        }

        return new ResultVO();
    }
}
