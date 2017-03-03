package com.zyc.travel.service.write;

import com.zyc.travel.client.vo.ResultVO;
import com.zyc.travel.client.vo.TravelLineVO;

/**
 * Created by zyc on 17/3/2.
 */
public interface TravelLineWriteService {

    /**
     * 添加一条或者多条线路
     * @param travelLineVO
     * @return
     */
    ResultVO addTravelLine(TravelLineVO travelLineVO);

    /**
     * 更新线路
     * @param travelLineVO
     * @return
     */
    ResultVO updateTravelLine(TravelLineVO travelLineVO);
}
