package com.zyc.travel.bpo.write.impl;

import com.zyc.travel.bpo.write.TravelAgencyWriteBPO;
import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.model.mapper.JTravelAgencyMapper;

import java.util.Date;

/**
 * Created by zyc on 17/1/18.
 */
public class TravelAgencyWriteBPOImpl implements TravelAgencyWriteBPO {
    private JTravelAgencyMapper myJTravelAgencyMapper;

    @Override
    public Integer addTravelAgency(JTravelAgency jTravelAgency) {
        jTravelAgency.setCreateDate(new Date());
        jTravelAgency.setUpdateDate(new Date());
        return myJTravelAgencyMapper.insertSelective(jTravelAgency);
    }

    @Override
    public Integer updateTraveAgency(JTravelAgency jTravelAgency) {
        jTravelAgency.setUpdateDate(new Date());
        return myJTravelAgencyMapper.updateByPrimaryKeySelective(jTravelAgency);
    }

    public JTravelAgencyMapper getMyJTravelAgencyMapper() {
        return myJTravelAgencyMapper;
    }

    public void setMyJTravelAgencyMapper(JTravelAgencyMapper myJTravelAgencyMapper) {
        this.myJTravelAgencyMapper = myJTravelAgencyMapper;
    }
}
