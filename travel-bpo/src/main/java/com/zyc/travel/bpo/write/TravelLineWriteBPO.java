package com.zyc.travel.bpo.write;

import com.zyc.travel.model.dto.JTravelLine;

import java.util.Date;
import java.util.List;

/**
 * Created by zyc on 17/3/2.
 */
public interface TravelLineWriteBPO {

    /**
     * 添加一条旅游线路
     * 返回影响条数
     * @param jTravelLine
     * @return
     */
    Integer addTravelLine(JTravelLine jTravelLine);

    /**
     * 添加多条旅游线路。
     * 返回多条旅行线路的id集合
     * 失败返回null
     * @param jTravelLine
     * @param dateList
     * @return
     */
    List<Integer> addTravelLines(JTravelLine jTravelLine,List<Date> dateList);

    /**
     * 更新旅游线路
     * @param jTravelLine
     * @return
     */
    Integer updateTravelLine(JTravelLine jTravelLine);

}
