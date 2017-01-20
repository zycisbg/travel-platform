package com.zyc.travel.service.write;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyVO;

/**
 * Created by zyc on 17/1/18.
 */
public interface TravelAgencyWriteService {

    /**
     * 添加旅行社
     * @param travelAgencyVO
     * @return
     */
    ResultVO saveTravelAgency(TravelAgencyVO travelAgencyVO);
}
