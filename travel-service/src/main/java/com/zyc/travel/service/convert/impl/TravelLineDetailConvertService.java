package com.zyc.travel.service.convert.impl;

import com.zyc.travel.client.vo.TravelLineDetailVO;
import com.zyc.travel.model.dto.JTravelLineDetail;
import com.zyc.travel.service.convert.CommonalityConvertService;
import org.springframework.beans.BeanUtils;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelLineDetailConvertService implements CommonalityConvertService<TravelLineDetailVO,JTravelLineDetail>{

    /**
     *
     * @param vo
     * @return
     */
    @Override
    public JTravelLineDetail fromPO(TravelLineDetailVO vo) {
        if(null==vo){
            return new JTravelLineDetail();
        }

        JTravelLineDetail po = new JTravelLineDetail();

        BeanUtils.copyProperties(vo,po);


        return po;
    }

    @Override
    public TravelLineDetailVO fromVO(JTravelLineDetail po) {
        if(null==po){
            return new TravelLineDetailVO();
        }
        TravelLineDetailVO vo = new TravelLineDetailVO();

        BeanUtils.copyProperties(po,vo);


        return vo;
    }
}
