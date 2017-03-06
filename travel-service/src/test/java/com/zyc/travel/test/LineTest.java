package com.zyc.travel.test;


import com.zyc.travel.client.util.LineStatusEnum;
import com.zyc.travel.client.util.LineTipsEnum;
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
        travelLineVO.setBusinessPrice(new BigDecimal(220));
        travelLineVO.setTravelDayCount(3);
        travelLineVO.setTransportation("飞机");
        travelLineVO.setSurplusCount(30);
        travelLineVO.setAdvanceDayCount(5);
        travelLineVO.setLineArea("beijing");
        travelLineVO.setLineTips(LineTipsEnum.COMMON);
        travelLineVO.setStatus(LineStatusEnum.OUT_OF_DATE);

        travelLineVO.setTravelId(1);
        travelLineVO.setGoDate(new Date());
//        travelLineVO.setId(5);

        TravelLineDetailVO travelLineDetailVO1 = new TravelLineDetailVO();
        travelLineDetailVO1.setDayCount(1);
        travelLineDetailVO1.setDetail("餐饮 早餐：自理   中餐：自理   晚餐：自理\n" +
                  "\n" +
                  "住宿普吉当地特色5* 酒店或同级五星\n" +
                  "\n" +
                  "参考航班 KA905 0800/1140转KA268 1515/1750\n" +
                  "\n" +
                  "泰国的普吉岛是最让人喜爱的度假海岛。这里有你所需要的一切度假元素" +
                  "：畅快的海风，湛蓝的大海，摇曳的椰树，花枝招展的姑娘们，热情的当地居民，通宵的购物街，" +
                  "high到爆的酒吧，饕餮的海鲜以及各种人文景观和自然风景。或许你也有这种感觉，生活在钢筋水泥和工作的重压之中，" +
                  "心心念念的就是穿着舒服的花衬衫，喝着冰椰汁，躺在能看到大海的躺椅上，没有人认识你，话能随便说，" +
                  "事情能随便做。这，大概就是普吉岛经久不衰的原因吧。\n" +
                  "抵达后专业司机导游接机，入住酒店休息。\n" +
                  "备注：由于登记入住需要时间，请各位游客耐心等待。我们会根据路线尽快帮各位办好入住手续；酒店内小费风俗为：每天20泰铢，一般纸币置于床头即可。\n");
        travelLineDetailVO1.setTitle("北京--青岛（潍坊中转）");
        //travelLineDetailVO1.setId(3);


        TravelLineDetailVO travelLineDetailVO2 = new TravelLineDetailVO();
        travelLineDetailVO2.setDayCount(2);
        travelLineDetailVO2.setDetail("餐饮 早餐：自理   中餐：自理   晚餐：自理\n" +
                  "\n" +
                  "住宿普吉当地特色5* 酒店或同级五星\n" +
                  "\n" +
                  "参考航班 KA905 0800/1140转KA268 1515/1750\n" +
                  "\n" +
                  "泰国的普吉岛是最让人喜爱的度假海岛。这里有你所需要的一切度假元素" +
                  "：畅快的海风，湛蓝的大海，摇曳的椰树，花枝招展的姑娘们，热情的当地居民，通宵的购物街，" +
                  "high到爆的酒吧，饕餮的海鲜以及各种人文景观和自然风景。或许你也有这种感觉，生活在钢筋水泥和工作的重压之中，" +
                  "心心念念的就是穿着舒服的花衬衫，喝着冰椰汁，躺在能看到大海的躺椅上，没有人认识你，话能随便说，" +
                  "事情能随便做。这，大概就是普吉岛经久不衰的原因吧。\n" +
                  "抵达后专业司机导游接机，入住酒店休息。\n" +
                  "备注：由于登记入住需要时间，请各位游客耐心等待。我们会根据路线尽快帮各位办好入住手续；酒店内小费风俗为：每天20泰铢，一般纸币置于床头即可。\n");
        travelLineDetailVO2.setTitle("日照--青岛（潍坊中转）");

        TravelLineExtVO travelLineExtVO = new TravelLineExtVO();
        travelLineExtVO.setCustomerLimit("笨笨不收");
        travelLineExtVO.setShoppingDetail("买买买");

        List<TravelLineDetailVO> travelLineDetailVOList = new ArrayList<>();

        travelLineDetailVOList.add(travelLineDetailVO1);
        travelLineDetailVOList.add(travelLineDetailVO2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse("2017-4-1 19:20:00");
        Date date2 = sdf.parse("2017-4-7 19:20:00");
        Date date3 = sdf.parse("2017-4-11 19:20:00");


        List dateList = new ArrayList();

        //dateList.add(new Date());
        //dateList.add(date1);
        //dateList.add(date2);
        dateList.add(date3);


        travelLineVO.setTravelLineDetailVOList(travelLineDetailVOList);
        travelLineVO.setTravelLineExtVO(travelLineExtVO);
        travelLineVO.setDateList(dateList);

        myTravelLineWriteService.addTravelLine(travelLineVO);


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
        TravelLineVO byId = myTravelLineReadService.getById(29);
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
