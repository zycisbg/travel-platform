package com.zyc.travel.service.convert.impl;

import com.zyc.travel.client.util.LineStatusEnum;
import com.zyc.travel.client.util.LineTipsEnum;
import com.zyc.travel.client.vo.TravelLineDetailVO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.model.dto.JTravelLineDetail;
import com.zyc.travel.service.convert.CommonalityConvertService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyc on 17/1/19.
 */
public class TravelLineConvertService implements CommonalityConvertService<TravelLineVO,JTravelLine>{

    private TravelLineDetailConvertService myTravelLineDetailConvertService = new TravelLineDetailConvertService();

    private TravelLineExtConvertService myTravelLineExtConvertService = new TravelLineExtConvertService();
    /**
     * @param vo
     * @return
     */
    @Override
    public JTravelLine fromPO(TravelLineVO vo) {
        if(null==vo){
            return new JTravelLine();
        }

        JTravelLine po = new JTravelLine();

        BeanUtils.copyProperties(vo,po);

        if(null!=vo.getStatus())

            po.setStatus(vo.getStatus().getCode());

        if(null!=vo.getLineTips())

            po.setLineTips(vo.getLineTips().getCode());

        if(null!=vo.getTravelLineDetailVOList() && vo.getTravelLineDetailVOList().size()!=0){
            List<JTravelLineDetail> jTravelLineDetailList = new ArrayList<>();
            for(TravelLineDetailVO temp:vo.getTravelLineDetailVOList()){
                jTravelLineDetailList.add(myTravelLineDetailConvertService.fromPO(temp));
            }
            po.setjTravelLineDetailList(jTravelLineDetailList);
        }

        if(null != vo.getTravelLineExtVO()){
            po.setjTravelLineExt(myTravelLineExtConvertService.fromPO(vo.getTravelLineExtVO()));
        }
        return po;
    }

    @Override
    public TravelLineVO fromVO(JTravelLine po) {
        if(null==po){
            return new TravelLineVO();
        }
        TravelLineVO vo = new TravelLineVO();

        BeanUtils.copyProperties(po,vo);

        if(null!=po.getStatus())
            vo.setStatus(LineStatusEnum.valueOf(po.getStatus()));

        if(null!=po.getLineTips())
            vo.setLineTips(LineTipsEnum.valueOf(po.getLineTips()));

        if(null!=po.getjTravelLineDetailList() && po.getjTravelLineDetailList().size()!=0){
            List<TravelLineDetailVO> travelLineDetailVOList = new ArrayList<>();
            for(JTravelLineDetail temp :po.getjTravelLineDetailList()){
                travelLineDetailVOList.add(myTravelLineDetailConvertService.fromVO(temp));
            }
            vo.setTravelLineDetailVOList(travelLineDetailVOList);
        }

        if(null!=po.getjTravelLineExt()){
            vo.setTravelLineExtVO(myTravelLineExtConvertService.fromVO(po.getjTravelLineExt()));
        }
        return vo;
    }
}
