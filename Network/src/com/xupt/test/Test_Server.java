package com.xupt.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(54321);
		System.out.println("服务器启动，绑定端口号：54321");
		while(true) {
			final Socket socket=server.accept();           //接受客户端请求
			new Thread() {
				public void run() {
					try {
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));  //获取输入流
						PrintStream ps=new PrintStream(socket.getOutputStream());                              //获取输出流
						String line =br.readLine();
						line=new StringBuilder(line).reverse().toString();
						ps.println(line);
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
