package com.zyc.travel.test;

import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by zyc on 17/3/7.
 */
public class Client {


    @Test
    public void test() throws Exception{
        Socket socket = new Socket("localhost",8888);

        OutputStream outputStream = socket.getOutputStream();

        PrintWriter pw = new PrintWriter(outputStream);

        pw.write("HelloWorld");


        pw.flush();
        socket.shutdownOutput();
        pw.close();
        outputStream.close();
        socket.close();
    }
}
