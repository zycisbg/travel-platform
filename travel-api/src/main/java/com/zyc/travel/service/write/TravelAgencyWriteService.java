package com.zyc.travel.service.write;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;

/**
 * Created by zyc on 17/1/18.
 */
public interface TravelAgencyWriteService {

    ResultVO saveTravelAgency(TravelAgencyVO travelAgencyVO);
}
