package com.xupt.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test_Client {
	public static void main(String[] args) throws UnknownHostException, IOException  {
		Scanner sc =new Scanner(System.in);
		Socket socket=new Socket("10.244.3.166",54321);
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));  //获取输入流
		PrintStream ps=new PrintStream(socket.getOutputStream());                              //获取输出流
		ps.println(sc.nextLine());                    //将字符串写到服务器上
		System.out.println(br.readLine());            //获取服务器的字符串并输出
		socket.close();
	}
}
