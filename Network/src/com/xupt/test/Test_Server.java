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
		System.out.println("�������������󶨶˿ںţ�54321");
		while(true) {
			final Socket socket=server.accept();           //���ܿͻ�������
			new Thread() {
				public void run() {
					try {
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));  //��ȡ������
						PrintStream ps=new PrintStream(socket.getOutputStream());                              //��ȡ�����
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
