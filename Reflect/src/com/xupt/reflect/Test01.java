package com.xupt.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

/*
	 *  ��֪һ���࣬�������£� 
		 * package cn.itcast.heima;
		 * 		public class DemoClass {
					public void run() {
						System.out.println("welcome to heima!");
					}
				}
		 * (1) дһ��Properties��ʽ�������ļ�����������������ơ� 
		 * (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������
	 */
public class Test01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("xxx.properties"));
		Class clazz=Class.forName(br.readLine());
		
		DemoClass dc=(DemoClass) clazz.newInstance();    //��������
		
		dc.run();
	}	
}
