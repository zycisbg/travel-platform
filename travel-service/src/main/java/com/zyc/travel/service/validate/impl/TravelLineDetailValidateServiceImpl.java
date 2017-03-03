package com.zyc.travel.service.validate.impl;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineDetailVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.service.validate.TravelLineDetailValidateService;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineDetailValidateServiceImpl implements TravelLineDetailValidateService {

    @Override
    public ResultVO foundationValidate(TravelLineDetailVO travelLineDetailVO) throws TravelException {
//        if(travelLineDetailVO.getLineId()==null){
//            throw new TravelException(ErrorInfoEnum.LINE_ID_IS_NOT_NULL);
//        }

        return new ResultVO();
    }
}
