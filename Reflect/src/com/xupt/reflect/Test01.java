package com.xupt.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

/*
	 *  已知一个类，定义如下： 
		 * package cn.itcast.heima;
		 * 		public class DemoClass {
					public void run() {
						System.out.println("welcome to heima!");
					}
				}
		 * (1) 写一个Properties格式的配置文件，配置类的完整名称。 
		 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
	 */
public class Test01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("xxx.properties"));
		Class clazz=Class.forName(br.readLine());
		
		DemoClass dc=(DemoClass) clazz.newInstance();    //创建对象
		
		dc.run();
	}	
}
