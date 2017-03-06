package com.zyc.travel.test;


import com.zyc.travel.service.read.TAContactsReadService;
import com.zyc.travel.service.write.TAContactsWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 *
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml","classpath:applicationContext-redis.xml","classpath:applicationContext-threadpool.xml"})
public class ZYCTest {

    @Resource
    private TAContactsWriteService myTAContactsWriteService;

    @Resource
    private TAContactsReadService myTAContactsReadService;

    @Resource
    @Qualifier("threadPool")
    private ThreadPoolTaskExecutor threadPool;


    @Test
    public void testWrite(){
       List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for(Integer num : list){
            System.out.println(num);
          list.add(4);
        }
    }
    @Test
    public void testRead() throws InterruptedException, ExecutionException, TimeoutException {
        System.out.println("master:-->"+Thread.currentThread().getName());
        Future<Integer> num = threadPool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("son:-->"+Thread.currentThread().getName());
                int total = 0;
                for(int i = 0;i<1000;i++){
                    total +=i;
                }
                return total;
            }
        });
        Integer integer = num.get(3, TimeUnit.SECONDS);
        System.out.println(integer);
    }

}
