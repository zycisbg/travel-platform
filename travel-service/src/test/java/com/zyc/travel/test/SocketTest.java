package com.zyc.travel.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created by zyc on 17/3/7.
 */
public class SocketTest {

    /**
     * InetAddress
     * @throws UnknownHostException
     */
    @Test
    public void test() throws UnknownHostException {
        //获取本机信息
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("---"+localHost.getHostName()+"---"+localHost.getHostAddress());
        byte[] address = localHost.getAddress();
        for (byte bytes: address){
            System.out.println(bytes);
        }

        //根据名称获取信息
        InetAddress.getAllByName("localhost");
    }


    /**
     * URL：统一资源定位符
     */
    @Test
    public void testURL(){
        try {

            URL url = new URL("http://www.baidu.com");
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");

            BufferedReader b = new BufferedReader(inputStreamReader);

            String s = b.readLine();
            while (s!=null){
                System.out.println(s);
                s = b.readLine();
            }
            b.close();
            inputStreamReader.close();
            inputStream.close();
        }catch (Exception e){

        }
    }
}
