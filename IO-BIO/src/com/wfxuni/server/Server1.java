package com.wfxuni.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO同步阻塞模型-服务端
 */
public class Server1 {

    private static int port = 8585;

    private static volatile int num = 0;

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务器开始监听，监听端口: " + port);
            // 开始监听
            while (true) {
                // 阻塞  等待客户端连接
                final Socket socket = serverSocket.accept();
                // 创建多个线程接收多个客户端的请求
                new Thread() {
                    @Override
                    public void run() {
                        System.out.println("当前已连接客户端数量: " + ++num);
                        try {
                            InputStream in = socket.getInputStream();
                            int len = -1;
                            byte[] buff = new byte[1024];
                            // 阻塞  等待客户端发送数据  直到客户端断开连接(客户端的流关闭)才退出循环
                            while ((len = in.read(buff)) != -1) {
                                String str = new String(buff, 0, len);
                                System.out.println("读取到客户端的输入字符: \n" + str);
                            }
                            //System.out.println("当前客户端已关闭连接...");
                            System.out.println("当前已连接客户端数量: " + --num);
                            in.close();
                            socket.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
