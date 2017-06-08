package com.zyc.travel.test;

import com.zyc.travel.common.util.Log;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zyc on 17/3/7.
 */
public class Server {

    @Test
    public void test() throws Exception{
        //创建服务端的socket
        ServerSocket serverSocket = new ServerSocket(8888);
        //服务端开始监听
        Log.APP.info("****服务端启动，等待连接****");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        String info = br.readLine();

        while(info!=null){
            System.out.println(info);
            info = br.readLine();
        }

        socket.shutdownInput();
        br.close();
        isr.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
