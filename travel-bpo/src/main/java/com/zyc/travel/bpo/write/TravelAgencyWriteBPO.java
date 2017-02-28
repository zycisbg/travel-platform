package com.zyc.travel.bpo.write;

import com.zyc.travel.model.dto.JTravelAgency;

/**
 * Created by zyc on 17/1/18.
 */
public interface TravelAgencyWriteBPO {

    Integer addTravelAgency(JTravelAgency jTravelAgency);

    Integer updateTraveAgency(JTravelAgency jTravelAgency);
}
