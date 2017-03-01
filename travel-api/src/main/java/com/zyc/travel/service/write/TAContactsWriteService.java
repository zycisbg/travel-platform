package com.zyc.travel.service.write;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelAgencyContactsVO;

/**
 * Created by zyc on 17/3/1.
 */
public interface TAContactsWriteService {
    /**
     * 添加联系人
     * @param travelAgencyContactsVO
     * @return
     */
    ResultVO saveContacts(TravelAgencyContactsVO travelAgencyContactsVO);

    /**
     * 更新联系人
     * @param travelAgencyContactsVO
     * @return
     */
    ResultVO updateContacts(TravelAgencyContactsVO travelAgencyContactsVO);
}
