package com.zyc.travel.test;

import com.zyc.travel.client.util.TravelTypeEnum;
import com.zyc.travel.client.vo.TravelAgencyVO;
import com.zyc.travel.service.write.TravelAgencyWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml"})
public class TravelServiceTest {

    @Resource
    private TravelAgencyWriteService myTravelAgencyWriteService;


    @Test
    public void testInsert(){
        TravelAgencyVO vo = new TravelAgencyVO();
        vo.setTravelType(TravelTypeEnum.valueOf(1));
        vo.setTravelBalance(new BigDecimal(2000));
        vo.setTravelPhone("3165424344");

        myTravelAgencyWriteService.saveTravelAgency(vo);
    }



}
