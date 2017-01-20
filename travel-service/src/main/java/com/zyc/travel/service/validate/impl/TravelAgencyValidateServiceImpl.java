package com.zyc.travel.service.validate.impl;

import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.service.validate.TravelAgencyValidateService;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelAgencyValidateServiceImpl implements TravelAgencyValidateService{

    @Override
    public ResultVO foundationValidate(TravelAgencyVO travelAgencyVO) throws TravelException {

        if(travelAgencyVO.getTravelName()==null){
            throw new TravelException(ErrorInfoEnum.TRAVEL_NAME_IS_NOT_NULL);
        }

        return new ResultVO();
    }
}
