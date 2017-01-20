package com.zyc.travel.service.convert.impl;

import com.zyc.travel.client.util.TravelStatusEnum;
import com.zyc.travel.client.util.TravelTypeEnum;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.model.dto.JTravelAgency;
import com.zyc.travel.service.convert.CommonalityConvertService;
import org.springframework.beans.BeanUtils;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelAgencyConvertService implements CommonalityConvertService<TravelAgencyVO,JTravelAgency>{

    @Override
    public JTravelAgency fromPO(TravelAgencyVO vo) {
        if(null==vo){
            return new JTravelAgency();
        }
        JTravelAgency po = new JTravelAgency();

        BeanUtils.copyProperties(vo,po);

        if(null!=vo.getTravelStatus())

            po.setTravelStatus(vo.getTravelStatus().getCode());

        if(null!=vo.getTravelType())

            po.setTravelType(vo.getTravelType().getCode());

        return po;
    }

    @Override
    public TravelAgencyVO fromVO(JTravelAgency po) {
        if(null==po){
            return new TravelAgencyVO();
        }
        TravelAgencyVO vo = new TravelAgencyVO();

        BeanUtils.copyProperties(po,vo);

        if(null!=po.getTravelStatus())
            vo.setTravelStatus(TravelStatusEnum.valueOf(po.getTravelStatus()));

        if(null!=po.getTravelType())
            vo.setTravelType(TravelTypeEnum.valueOf(po.getTravelType()));

        return vo;
    }
}
