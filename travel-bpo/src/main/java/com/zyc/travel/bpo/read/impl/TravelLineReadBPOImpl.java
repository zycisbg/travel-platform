package com.zyc.travel.bpo.read.impl;

import com.zyc.travel.bpo.read.TravelLineReadBPO;
import com.zyc.travel.common.page.Page;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.model.dto.JTravelLineExample;
import com.zyc.travel.model.mapper.JTravelLineMapper;

import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public class TravelLineReadBPOImpl implements TravelLineReadBPO{

    private JTravelLineMapper myJTravelLineMapper;

    @Override
    public List<JTravelLine> getListByParam(JTravelLine jTravelLine, Integer start, Integer limit) {
        JTravelLineExample example = new JTravelLineExample();
        JTravelLineExample.Criteria criteria = example.createCriteria();

        if(jTravelLine.getTravelId()!=null){
            criteria.andTravelIdEqualTo(jTravelLine.getTravelId());
        }
        if(jTravelLine.getTravelName()!=null){
            criteria.andTravelNameLike(jTravelLine.getTravelName()+"%");
        }
        if(jTravelLine.getTitle()!=null){
            criteria.andTitleLike(jTravelLine.getTitle()+"%");
        }
        if(jTravelLine.getTravelDayCount()!=null){
            criteria.andTravelDayCountEqualTo(jTravelLine.getTravelDayCount());
        }
        if(jTravelLine.getTransportation()!=null){
            criteria.andTransportationLike(jTravelLine.getTransportation()+"%");
        }
        if(jTravelLine.getGoDateBegin()!=null || jTravelLine.getGoDateEnd()!=null){
            criteria.andGoDateBetween(jTravelLine.getGoDateBegin(),jTravelLine.getGoDateEnd());
        }
        if(jTravelLine.getLineArea()!=null){
            criteria.andLineAreaEqualTo(jTravelLine.getLineArea());
        }
        if(jTravelLine.getLineTips()!=null){
            criteria.andLineTipsEqualTo(jTravelLine.getLineTips());
        }
        if(jTravelLine.getStatus()!=null){
            criteria.andStatusEqualTo(jTravelLine.getStatus());
        }
        if(start!=null && limit!=null){
            Page page = new Page();
            page.setBegin(start);
            page.setEnd(limit);
            example.setPage(page);
        }
        return myJTravelLineMapper.selectByExample(example);
    }

    @Override
    public JTravelLine getLineById(Integer id) {
        return myJTravelLineMapper.getById(id);
    }

    public JTravelLineMapper getMyJTravelLineMapper() {
        return myJTravelLineMapper;
    }

    public void setMyJTravelLineMapper(JTravelLineMapper myJTravelLineMapper) {
        this.myJTravelLineMapper = myJTravelLineMapper;
    }
}
