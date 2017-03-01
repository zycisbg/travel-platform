package com.zyc.travel.bpo.write;

import com.zyc.travel.model.dto.JTravelAgencyContacts;

/**
 * Created by zyc on 17/3/1.
 */
public interface TAContactsWriteBPO {

    /**
     * 添加联系人
     * @param jTravelAgencyContacts
     * @return
     */
    Integer addContacts(JTravelAgencyContacts jTravelAgencyContacts);

    /**
     * 更新联系人
     * @param jTravelAgencyContacts
     * @return
     */
    Integer updateContacts(JTravelAgencyContacts jTravelAgencyContacts);
}
