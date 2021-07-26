package com.wfxuni.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * BIO同步阻塞模型-客户端
 */
public class Client1 {

    private static int port = 8585;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入客户端编号: ");
        int num = sc.nextInt();

        Socket socket = null;
        try {
            System.out.println("客户端:" + num + "开始连接服务器...");
            socket = new Socket("127.0.0.1", port);
            if (null != socket) {
                System.out.println("客户端:" + num + "连接服务器成功!");
            } else {
                throw new IOException("客户端:" + num + "连接服务器失败!");
            }
            OutputStream out = socket.getOutputStream();
            while (true) {
                System.out.println("客户端:" + num + "请输入要发送字符(输入quit表示结束):");
                String str = sc.next();
                if (str.trim().equalsIgnoreCase("quit")) {
                    break;
                }
                out.write((num + ":" + str).getBytes());
            }
            System.out.println("客户端:" + num + "连接中断");
            out.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
