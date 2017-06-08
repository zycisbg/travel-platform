package com.zyc.travel.test;


import com.zyc.travel.common.util.Log;
import com.zyc.travel.service.read.TAContactsReadService;
import com.zyc.travel.service.write.TAContactsWriteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.*;

/**
 *
 * Created by zyc on 16/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-db.xml", "classpath:applicationContext-bpo.xml", "classpath:applicationContext-service.xml","classpath:applicationContext-redis.xml","classpath:applicationContext-threadpool.xml","classpath:applicationContext-quartz.xml"})
public class ZYCTest {

    @Resource
    private TAContactsWriteService myTAContactsWriteService;

    @Resource
    private TAContactsReadService myTAContactsReadService;

    @Resource
    @Qualifier("threadPool")
    private ThreadPoolTaskExecutor threadPool;

    private volatile Integer num;


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
                for(int i = 0;i<10000;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    total +=i;
                }
                return total;
            }
        });

        int total = 0;
        for(int i = 0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            total +=i;
        }
        System.out.println(total);
        Integer integer = num.get(3, TimeUnit.SECONDS);
        System.out.println("son:"+integer);
    }

    @Test
    public void test() throws InterruptedException {
        for (int i =0 ;i<1000;i++){
            Thread.sleep(10000L);
            System.out.println(i);
        }
    }


    @Test
    public void test2(){
        String str = "HelloWorld";
        System.out.println(str.indexOf("oW"));
    }

    /**
     * 找到返回被查找的数字，没找到返回-1
     * @param num
     * @param nums
     * @return
     */
    public int tree(int num,int[] nums){
        int length = nums.length;
        if(length==0){
            System.out.println("数组为空");
            return num;
        }
        System.out.println("数组不为空，开始排序,原顺序：");
        for(int i = 0;i<length-1;i++){
            System.out.println(nums[i]);
        }
        for(int i=0;i<length-1;i++){

            for(int j=0;j<length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("排序完成，nums:");
        for(int i = 0;i<length-1;i++){
            System.out.println(nums[i]);
        }

        int mid = length/2;
        if(num==nums[mid]){
            return nums[mid];
        }

        int start = 0;
        int end = length-1+start;
        int count=1 ;
        while (end>=start){
            mid = (end-start)/2+start;
            System.out.println("循环第"+ count++ +"次,当前start:"+start+",当前end:"+end+",当前mid："+mid+"当前中间值+"+nums[mid]);
            if(num<nums[mid]){
                end=mid-1;
            }else if(num>nums[mid]){
                start =mid+1;
            }else{
                return nums[mid];
            }
        }

        return -1;
    }

    @Test
    public void test3(){
        int[] nums = {1,2,5,99,26,4,29,54,22,55,33,20,103};
        int num = 103;
        System.out.println(tree(num,nums));
    }

    @Test
    public void test4(){
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());


    }

    @Test
    public void test5(){

        String s = "dwqesdasdas";
        byte[] bytes = s.getBytes();
        Log.APP.info("输出数组："+bytes);
        for(byte b:bytes){
            Log.APP.info("输出字节："+b);
        }
        for(int i=0;i<bytes.length;i++){
            Log.APP.info("for循环输出"+bytes[i]);
        }
    }

    public static boolean isSeem(String str1, String str2) {

        if (str1 != null && str2 != null && str1.length() == str2.length()) {
            byte[] b = str1.getBytes();
            int length = b.length;
            byte temp = 0;
            for (int i = 0; i < length / 2; i++) {
                temp = b[i];
                b[i] = b[length - i - 1];
                b[length - i - 1] = temp;
            }
            String str3 = new String(b);
            return str3.equals(str2);
        }
        return false;
    }
    public boolean isSeem1(String str1, String str2) {

        if (str1 != null && str2 != null && str1.length() == str2.length()) {
            byte[] b1 = str1.getBytes();
            byte[] b2 = str2.getBytes();
            int length = b1.length;
            Arrays.sort(b1);
            Arrays.sort(b2);
            for (int i = 0; i < length; i++) {
                if (b1[i]!=b2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    @Test
    public void test7(){
        String s1 = new String();
        String s2 = new String();
        System.out.println(isSeem1(s1,s2));
    }



    @Test
    public void test8(){
        String s = "qweqwe";
        byte[] bytes = s.getBytes();
        Arrays.sort(bytes);
        for(byte b:bytes){
            System.out.println(b);
        }
    }

    @Test
    public void test9(){
        PubNode currentNode = null;
        PubNode lostRootNode = null;
        PubNode lostCurrentNode = null;

        String array1[] ={"aaa","eee","kkk","lll"};

        for(int i=0 ; i<array1.length;i++){
            currentNode = new PubNode();
            currentNode.nodeName = array1[i];
            if(lostRootNode==null){
                lostRootNode = new PubNode();
                lostCurrentNode = lostRootNode;
            }
            lostCurrentNode.firstChild = currentNode;
            lostCurrentNode = currentNode;
        }
        while (lostRootNode.firstChild!=null){
            System.out.println(lostCurrentNode.nodeName+lostRootNode.firstChild.nodeName);
            lostRootNode = lostRootNode.firstChild;
        }
    }
    class PubNode{
        String nodeName;
        PubNode firstChild;

    }
}
