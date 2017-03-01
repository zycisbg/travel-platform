package com.zyc.travel.service.read;

import com.zyc.travel.client.vo.TravelAgencyContactsVO;

import java.util.List;

/**
 * Created by zyc on 17/3/1.
 */
public interface TAContactsReadService {
    /**
     * 根据id获取联系人
     * @param id
     * @return
     */
    TravelAgencyContactsVO getById(Integer id);

    /**
     * 获取联系人分页信息
     * start/limit 不传查全部
     * @param travelAgencyContactsVO
     * @param start
     * @param limit
     * @return
     */
    List<TravelAgencyContactsVO> queryList(TravelAgencyContactsVO travelAgencyContactsVO,Integer start,Integer limit);

}
