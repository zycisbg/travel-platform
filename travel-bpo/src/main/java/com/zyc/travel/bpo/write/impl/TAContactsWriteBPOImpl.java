package com.zyc.travel.bpo.write.impl;

import com.zyc.travel.bpo.write.TAContactsWriteBPO;
import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.model.mapper.JTravelAgencyContactsMapper;

import java.util.Date;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsWriteBPOImpl implements TAContactsWriteBPO{
    private JTravelAgencyContactsMapper myJTravelAgencyContactsMapper;


    @Override
    public Integer addContacts(JTravelAgencyContacts jTravelAgencyContacts) {
        jTravelAgencyContacts.setCreateDate(new Date());
        jTravelAgencyContacts.setUpdateDate(new Date());
        return myJTravelAgencyContactsMapper.insertSelective(jTravelAgencyContacts);
    }


    @Override
    public Integer updateContacts(JTravelAgencyContacts jTravelAgencyContacts) {
        jTravelAgencyContacts.setUpdateDate(new Date());
        return myJTravelAgencyContactsMapper.updateByPrimaryKeySelective(jTravelAgencyContacts);
    }

    public JTravelAgencyContactsMapper getMyJTravelAgencyContactsMapper() {
        return myJTravelAgencyContactsMapper;
    }

    public void setMyJTravelAgencyContactsMapper(JTravelAgencyContactsMapper myJTravelAgencyContactsMapper) {
        this.myJTravelAgencyContactsMapper = myJTravelAgencyContactsMapper;
    }
}
