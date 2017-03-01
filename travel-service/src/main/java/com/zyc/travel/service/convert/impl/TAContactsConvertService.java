package com.zyc.travel.service.convert.impl;

import com.zyc.travel.client.util.StatusEnum;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.service.convert.CommonalityConvertService;
import org.springframework.beans.BeanUtils;

/**
 * Created by zyc on 17/3/1.
 */
public class TAContactsConvertService implements CommonalityConvertService<TravelAgencyContactsVO,JTravelAgencyContacts> {

    @Override
    public JTravelAgencyContacts fromPO(TravelAgencyContactsVO vo) {
        if(null==vo){
            return new JTravelAgencyContacts();
        }

        JTravelAgencyContacts po = new JTravelAgencyContacts();

        BeanUtils.copyProperties(vo,po);

        if(null!=vo.getStatus())

            po.setStatus(vo.getStatus().getCode());


        return po;
    }

    @Override
    public TravelAgencyContactsVO fromVO(JTravelAgencyContacts po) {
        if(null==po){
            return new TravelAgencyContactsVO();
        }
        TravelAgencyContactsVO vo = new TravelAgencyContactsVO();

        BeanUtils.copyProperties(po,vo);

        if(null!=po.getStatus())
            vo.setStatus(StatusEnum.valueOf(po.getStatus()));

        return vo;
    }
}
