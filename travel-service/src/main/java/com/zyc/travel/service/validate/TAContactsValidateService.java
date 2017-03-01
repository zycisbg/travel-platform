package com.zyc.travel.service.validate;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.common.exception.TravelException;

/**
 * Created by zyc on 17/3/1.
 */
public interface TAContactsValidateService {
    //基础验证
    ResultVO foundationValidate(TravelAgencyContactsVO travelAgencyContactsVO) throws TravelException;
}
