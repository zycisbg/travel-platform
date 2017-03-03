package com.zyc.travel.service.convert.impl;

import com.zyc.travel.client.vo.TravelLineExtVO;
import com.zyc.travel.model.dto.JTravelLineExt;
import com.zyc.travel.service.convert.CommonalityConvertService;
import org.springframework.beans.BeanUtils;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelLineExtConvertService implements CommonalityConvertService<TravelLineExtVO,JTravelLineExt>{

    /**
     *
     * @param vo
     * @return
     */
    @Override
    public JTravelLineExt fromPO(TravelLineExtVO vo) {
        if(null==vo){
            return new JTravelLineExt();
        }

        JTravelLineExt po = new JTravelLineExt();

        BeanUtils.copyProperties(vo,po);

        return po;
    }

    @Override
    public TravelLineExtVO fromVO(JTravelLineExt po) {
        if(null==po){
            return new TravelLineExtVO();
        }
        TravelLineExtVO vo = new TravelLineExtVO();

        BeanUtils.copyProperties(po,vo);


        return vo;
    }
}
