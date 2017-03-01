package com.zyc.travel.bpo.read;

import com.zyc.travel.model.dto.JTravelAgencyContacts;

import java.util.List;

/**
 * Created by zyc on 17/3/1.
 */
public interface TAContactsReadBPO {
    /**
     * 根据id获取联系人
     * @return
     */
    JTravelAgencyContacts getById(Integer id);

    List<JTravelAgencyContacts> getListByParam(JTravelAgencyContacts params, Integer start, Integer limit);
}
