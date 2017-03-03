package com.zyc.travel.service.validate.impl;

import com.zyc.travel.client.vo.ErrorInfoEnum;
import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineExtVO;
import com.zyc.travel.common.exception.TravelException;
import com.zyc.travel.service.validate.TravelLineExtValidateService;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineExtValidateServiceImpl implements TravelLineExtValidateService {

    @Override
    public ResultVO foundationValidate(TravelLineExtVO travelLineExtVO) throws TravelException {
        if(travelLineExtVO.getShoppingDetail()==null){

            throw new TravelException(ErrorInfoEnum.SHOPPING_DETAIL_IS_NOT_NULL);
        }

        return new ResultVO();
    }
}
