package com.zyc.travel.test;


import com.mchange.v2.ser.SerializableUtils;
import com.zyc.travel.client.util.TravelTypeEnum;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.common.handler.DataBaseProxyHandler;
import com.zyc.travel.common.handler.ProxyInterface;
import com.zyc.travel.common.util.JsonUtils;
import com.zyc.travel.common.util.RedisUtil;
import com.zyc.travel.service.keys.RedisKeys;
import com.zyc.travel.service.read.TravelAgencyReadService;
import com.zyc.travel.service.write.TravelAgencyWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.SerializationUtils;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml","classpath:applicationContext-redis.xml"})
public class TravelServiceTest {

    @Resource
    private TravelAgencyWriteService myTravelAgencyWriteService;

    @Resource
    private TravelAgencyReadService myTravelAgencyReadService;


    @Resource
    private RedisUtil myRedisUtil;
    @Test
    public void testInsert(){
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelName("战国旅行社");
        vo.setTravelType(TravelTypeEnum.valueOf(1));
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");
        vo.setBusinessLicenseUrl("2312312312");
        vo.setTravelAddressDetail("3123123");
        vo.setTravelArea("1233123213");

        myTravelAgencyWriteService.saveTravelAgency2MySqlAndRedis(vo);
    }

    @Test
    public void testProxy() throws Exception{
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelType(TravelTypeEnum.valueOf(1));
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");
        new DataBaseProxyHandler<TravelAgencyWriteService>(myRedisUtil).proxy(myTravelAgencyWriteService, new ProxyInterface() {

            @Override
            public Object doBegin(Object o, Object[] parm) {
                try {
                    RedisUtil redisUtil = (RedisUtil) o;
                    TravelAgencyVO vo = (TravelAgencyVO) parm[0];
                    Jedis jedis = redisUtil.getJedis();
                    String set= jedis.set(RedisKeys.TRAVEL_INFO.getKey().getBytes(), SerializationUtils.serialize(vo));
                    System.out.println(set);
                }catch (Exception e){
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            public Object doEnd(Object returnObj, Object o,Object[] param) {
                try {
                    RedisUtil redisUtil = (RedisUtil) o;
                    Jedis jedis = redisUtil.getJedis();
                    byte[] bytes = jedis.get(RedisKeys.TRAVEL_INFO.getKey().getBytes());
                    Object o1 = SerializableUtils.fromByteArray(bytes);
                    TravelAgencyVO vo = (TravelAgencyVO)o1;
                    System.out.println(vo.getTravelBalance());
                }catch (Exception e){
                    e.printStackTrace();
                    e.getMessage();
                }
                return null;
            }
        }).saveTravelAgency2MySqlAndRedis(vo);
    }

    @Test
    public void testJedis(){
        try {


            TravelAgencyVO vo = new TravelAgencyVO();
            vo.setTravelType(TravelTypeEnum.valueOf(1));
            vo.setTravelBalance(new BigDecimal(2000));
            vo.setTravelPhone("3165424344");
            vo.setCreateDate(new Date());
            vo.setTravelName("大师大师的撒打算的撒个人个人和");
            vo.setTravelRemark("圣诞节弗兰克");
            //Jedis jedis = myRedisUtil.getJedis();
            //
            long currentTimeMillis = System.currentTimeMillis();
            for(int i=0;i<100000;i++){


                //jedis.set("vo"+i, JsonUtils.toJSON(vo));
               // String vo1 = jedis.get("vo"+i);
//                System.out.println(vo1);
                TravelAgencyVO travelAgencyVO = JsonUtils.fromJSON(JsonUtils.toJSON(vo), TravelAgencyVO.class);
            }
            long l = System.currentTimeMillis() - currentTimeMillis;
            System.out.println(l);

            long currentTimeMillis1 = System.currentTimeMillis();
            for(int i=0;i<100000;i++){
               // SerializationUtils.serialize(vo);
               // jedis.set(("vo"+i).getBytes(), SerializationUtils.serialize(vo));
                //byte[] bytes = jedis.get(("vo" + i).getBytes());
                TravelAgencyVO travelAgencyVO = (TravelAgencyVO) SerializationUtils.deserialize(SerializationUtils.serialize(vo));
            }
            long l1 = System.currentTimeMillis() - currentTimeMillis1;
            System.out.println(l1);
        }catch (Exception e){

        }
    }

    @Test
    public void testRedisAndMysql(){
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelType(TravelTypeEnum.valueOf(1));
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");
        vo.setCreateDate(new Date());
        vo.setTravelName("大师大师的撒打算的撒个人个人和");
        vo.setTravelRemark("圣诞节弗兰克");

        Jedis jedis = myRedisUtil.getJedis();

        long currentTimeMillis = System.currentTimeMillis();
        for(int i=0;i<1000;i++){

            myTravelAgencyWriteService.saveTravelAgency(vo);
        }
        long l = System.currentTimeMillis() - currentTimeMillis;
        System.out.println("往mysql存取1000条数据，耗时(毫秒)："+l);

        long currentTimeMillis1 = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            jedis.set("vo"+i, JsonUtils.toJSON(vo));
        }
        long l1 = System.currentTimeMillis() - currentTimeMillis1;
        System.out.println("往redis存取1000条数据，耗时(毫秒)："+l1);

    }

    @Test
    public void test1(){
        int a =1,b=10;
        a=2;
        b=11;
        System.out.println(a+","+b);
        a=b;
        System.out.println(a+","+b);
        a=3;
        System.out.println(a+","+b);

    }

    @Test
    public void test2(){
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelName("小旅行社");
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");
        vo.setCreateDate(new Date());
        vo.setTravelRemark("备注");

            myTravelAgencyWriteService.saveTravelAgency(vo);
    }

    @Test
    public void testUpdate(){
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelType(TravelTypeEnum.valueOf(1));
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");
        vo.setCreateDate(new Date());
        vo.setTravelName("111");
        vo.setTravelRemark("222");
        vo.setId(72891);

        myTravelAgencyWriteService.updateTravelAgency(vo);
    }


    @Test
    public void testGet(){
//        TravelAgencyVO byId = myTravelAgencyReadService.getById(72906);
//        System.out.println(byId);
        List<TravelAgencyVO> travelAgencyVOs = myTravelAgencyReadService.queryList(new TravelAgencyVO(), 0, 10);
        System.out.println(travelAgencyVOs);
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

