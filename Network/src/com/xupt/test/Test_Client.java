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
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));  //��ȡ������
		PrintStream ps=new PrintStream(socket.getOutputStream());                              //��ȡ�����
		ps.println(sc.nextLine());                    //���ַ���д����������
		System.out.println(br.readLine());            //��ȡ���������ַ��������
		socket.close();
	}
}
