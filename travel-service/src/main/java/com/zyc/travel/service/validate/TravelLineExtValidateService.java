package com.zyc.travel.service.validate;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineExtVO;
import com.zyc.travel.common.exception.TravelException;

/**
 * Created by zyc on 17/1/19.
 */
public interface TravelLineExtValidateService {

    //基础验证
    ResultVO foundationValidate(TravelLineExtVO travelLineExtVO) throws TravelException;

}
