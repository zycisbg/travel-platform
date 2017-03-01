package com.zyc.travel.bpo.read;

import com.zyc.travel.model.dto.JTravelAgency;

import java.util.List;

/**
 * Created by zyc on 17/1/18.
 */
public interface TravelAgencyReadBPO {
    /**
     * 根据id获取旅行社PO对象
     * @param id
     * @return
     */
    JTravelAgency getById(Integer id);

    /**
     * 根据参数分页获取旅行社列表页
     * @param jTravelAgency
     * @param start
     * @param limit
     * @return
     */
    List<JTravelAgency> getListByParam(JTravelAgency jTravelAgency,Integer start,Integer limit);
}
