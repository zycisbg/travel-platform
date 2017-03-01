package com.zyc.travel.bpo.read.impl;

import com.zyc.travel.bpo.read.TAContactsReadBPO;
import com.zyc.travel.common.page.Page;
import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.model.dto.JTravelAgencyContactsExample;
import com.zyc.travel.model.mapper.JTravelAgencyContactsMapper;

import java.util.List;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsReadBPOImpl implements TAContactsReadBPO{
    private JTravelAgencyContactsMapper myJTravelAgencyContactsMapper;

    @Override
    public JTravelAgencyContacts getById(Integer id) {
        return myJTravelAgencyContactsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JTravelAgencyContacts> getListByParam(JTravelAgencyContacts params, Integer start, Integer limit) {
        JTravelAgencyContactsExample example = new JTravelAgencyContactsExample();
        JTravelAgencyContactsExample.Criteria criteria = example.createCriteria();

        if(params.getTravelId()!=null){
            criteria.andTravelIdEqualTo(params.getTravelId());
        }
        if(params.getContactsName()!=null){
            criteria.andContactsNameLike(params.getContactsName()+"%");
        }
        if(params.getStatus()!=null){
            criteria.andStatusEqualTo(params.getStatus());
        }
        if(params.getContactsPhone()!=null){
            criteria.andContactsPhoneEqualTo(params.getContactsPhone());
        }
        if(params.getContactsWeixin()!=null){
            criteria.andContactsWeixinEqualTo(params.getContactsWeixin());
        }
        if(params.getContactsQq()!=null){
            criteria.andContactsQqEqualTo(params.getContactsQq());
        }

        if(start!=null && limit!=null){
            Page page = new Page();
            page.setBegin(start);
            page.setEnd(limit);
            example.setPage(page);
        }

        return myJTravelAgencyContactsMapper.selectByExample(example);
    }

    public JTravelAgencyContactsMapper getMyJTravelAgencyContactsMapper() {
        return myJTravelAgencyContactsMapper;
    }

    public void setMyJTravelAgencyContactsMapper(JTravelAgencyContactsMapper myJTravelAgencyContactsMapper) {
        this.myJTravelAgencyContactsMapper = myJTravelAgencyContactsMapper;
    }
}
