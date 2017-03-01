package com.zyc.travel.bpo.read.impl;

import com.zyc.travel.bpo.read.TravelAgencyReadBPO;
import com.zyc.travel.common.page.Page;
import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.model.dto.JTravelAgencyExample;
import com.zyc.travel.model.mapper.JTravelAgencyMapper;

import java.util.List;

/**
 * Created by zyc on 17/1/18.
 * handler service mapper
 */
public class TravelAgencyReadBPOImpl implements TravelAgencyReadBPO {

    private JTravelAgencyMapper myJTravelAgencyMapper;

    @Override
    public JTravelAgency getById(Integer id) {

        return myJTravelAgencyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JTravelAgency> getListByParam(JTravelAgency jTravelAgency, Integer start, Integer limit) {
        JTravelAgencyExample example = new JTravelAgencyExample();
        JTravelAgencyExample.Criteria criteria = example.createCriteria();

        if(jTravelAgency.getTravelType()!=null){
            criteria.andTravelTypeEqualTo(jTravelAgency.getTravelType());
        }
        if(jTravelAgency.getTravelStatus()!=null){
            criteria.andTravelStatusEqualTo(jTravelAgency.getTravelStatus());
        }
        if(jTravelAgency.getTravelArea()!=null){
            criteria.andTravelAreaEqualTo(jTravelAgency.getTravelArea());
        }
        if(jTravelAgency.getTravelName()!=null){
            criteria.andTravelNameLike(jTravelAgency.getTravelName() + "%");
        }
        if(jTravelAgency.getTravelPhone()!=null){
            criteria.andTravelPhoneEqualTo(jTravelAgency.getTravelPhone());
        }
        if(start!=null && limit!=null){
            Page page = new Page();
            page.setBegin(start);
            page.setEnd(limit);
            example.setPage(page);
        }

        return myJTravelAgencyMapper.selectByExample(example);
    }

    public JTravelAgencyMapper getMyJTravelAgencyMapper() {
        return myJTravelAgencyMapper;
    }

    public void setMyJTravelAgencyMapper(JTravelAgencyMapper myJTravelAgencyMapper) {
        this.myJTravelAgencyMapper = myJTravelAgencyMapper;
    }
}
