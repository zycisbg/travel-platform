package com.zyc.travel.service.validate;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.exception.TravelException;

/**
 * Created by zyc on 17/1/19.
 */
public interface TravelAgencyValidateService {

    ResultVO foundationValidate(TravelAgencyVO travelAgencyVO) throws TravelException;
}
