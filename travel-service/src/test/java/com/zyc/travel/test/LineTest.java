package com.zyc.travel.test;


import com.zyc.travel.client.util.LineStatusEnum;
import com.zyc.travel.client.vo.TravelLineDetailVO;
import com.zyc.travel.client.vo.TravelLineExtVO;
import com.zyc.travel.client.vo.TravelLineVO;
import com.zyc.travel.common.util.JsonUtils;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.model.dto.JTravelLine;
import com.zyc.travel.service.read.TravelLineReadService;
import com.zyc.travel.service.write.TravelLineWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

/**
 *
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml","classpath:applicationContext-redis.xml"})
public class LineTest {

    @Resource
    private TravelLineWriteService myTravelLineWriteService;

    @Resource
    private TravelLineReadService myTravelLineReadService;

    @Resource
    private RedisUtil myRedisUtil;


    @Test
    public void testWrite() throws Exception{
        TravelLineVO travelLineVO = new TravelLineVO();
        travelLineVO.setTravelName("邯郸旅行社");
        travelLineVO.setStatus(LineStatusEnum.OUT_OF_DATE);
        travelLineVO.setTravelTel("18631067887");
        travelLineVO.setTitle("青岛两日游");
        travelLineVO.setAgencyPrice(new BigDecimal(200));

        travelLineVO.setTravelId(1);
        travelLineVO.setGoDate(new Date());
        travelLineVO.setId(5);

        TravelLineDetailVO travelLineDetailVO1 = new TravelLineDetailVO();
        travelLineDetailVO1.setDayCount(1);
        travelLineDetailVO1.setDetail("上海玩");
        travelLineDetailVO1.setTitle("上海玩标题");
        travelLineDetailVO1.setId(3);
        TravelLineDetailVO travelLineDetailVO2 = new TravelLineDetailVO();
        travelLineDetailVO2.setDayCount(2);
        travelLineDetailVO2.setDetail("北京玩");
        travelLineDetailVO2.setTitle("北京玩标题");
        travelLineDetailVO2.setId(4);

        TravelLineExtVO travelLineExtVO = new TravelLineExtVO();
        travelLineExtVO.setCustomerLimit("笨笨不收");
        travelLineExtVO.setShoppingDetail("买买买");
        travelLineExtVO.setId(5);

        List<TravelLineDetailVO> travelLineDetailVOList = new ArrayList<>();

        travelLineDetailVOList.add(travelLineDetailVO1);
        travelLineDetailVOList.add(travelLineDetailVO2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse("2017-4-1 19:20:00");
        Date date2 = sdf.parse("2017-4-7 19:20:00");
        Date date3 = sdf.parse("2017-4-11 19:20:00");


        List dateList = new ArrayList();

        dateList.add(new Date());
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);


        travelLineVO.setTravelLineDetailVOList(travelLineDetailVOList);
        travelLineVO.setTravelLineExtVO(travelLineExtVO);
        travelLineVO.setDateList(dateList);

        myTravelLineWriteService.updateTravelLine(travelLineVO);


    }
    @Test
    public void testRead(){
        long l = System.currentTimeMillis();
        Jedis jedis = myRedisUtil.getJedis();
        String s = jedis.get("travel_line:5");
        System.out.println(s);
        JTravelLine jTravelLine = JsonUtils.fromJSON(s, JTravelLine.class);
        System.out.println(System.currentTimeMillis()-l);
        System.out.println(jTravelLine);

    }

    @Test
    public void testGetById(){
        TravelLineVO byId = myTravelLineReadService.getById(5);
        System.out.println(byId);
    }

    /**
     * list.add();
     * set list
     * hashmap hashtable
     * concurrtHashmap
     */

    @Test
    public void testGet(){
        TravelLineVO vo = new TravelLineVO();
        List<TravelLineVO> travelLineVOList = myTravelLineReadService.queryList(vo, null, null);
        System.out.println(travelLineVOList.size());
        List list = new ArrayList(20);
    }
}
/**
 *标题  门市价 同行价 行程天数 往返交通 发团日期 剩余座位 提前几天联系 旅行社电话 旅行社名称 线路状态 浏览次数 线路区域 线路标签
    行程信息 交通介绍  定金说明 费用包含 费用不含 自费项目 保险说明 预定说明  出行须知  购物说明 成团说明  航班变动声明 收客限制
 */
