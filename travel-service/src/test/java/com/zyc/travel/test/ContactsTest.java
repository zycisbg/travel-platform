package com.zyc.travel.test;


import com.zyc.travel.client.vo.TravelAgencyContactsVO;
import com.zyc.travel.service.read.TAContactsReadService;
import com.zyc.travel.service.write.TAContactsWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml","classpath:applicationContext-redis.xml"})
public class ContactsTest {

    @Resource
    private TAContactsWriteService myTAContactsWriteService;

    @Resource
    private TAContactsReadService myTAContactsReadService;


    @Test
    public void testWrite(){
        TravelAgencyContactsVO vo = new TravelAgencyContactsVO();
        vo.setContactsName("laosi");
        vo.setContactsPhone("18631067888");
        vo.setContactsPosition("经理");
        vo.setContactsQq("415041525");
        vo.setContactsWeixin("13833092222");
        vo.setTravelId(72906);
        vo.setId(2);
        //myTAContactsWriteService.saveContacts(vo);
        myTAContactsWriteService.updateContacts(vo);
    }
    @Test
    public void testRead(){
        //myTAContactsReadService.getById(2);
        TravelAgencyContactsVO vo = new TravelAgencyContactsVO();
        vo.setContactsName("laos");
        myTAContactsReadService.queryList(vo,0,10);
    }
}

