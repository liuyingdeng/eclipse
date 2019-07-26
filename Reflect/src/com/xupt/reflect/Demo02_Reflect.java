package com.xupt.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo02_Reflect {
	public static void main(String[] args) throws Exception {
		Juicer j=new  Juicer();
		BufferedReader br=new BufferedReader(new FileReader("config.properties")); 
		Class clazz =Class.forName(br.readLine());
		
		Fruits f=(Fruits) clazz.newInstance();
		j.run(f);
		
	}
	
	
	interface Fruits {
		public void squeeze();
	}
	
	class Apple implements Fruits {
		public void squeeze() {
			System.out.println("ե��һ��ƻ��֭��");
		} 
	}
	
	class Orange implements Fruits{
		public void squeeze() {
			System.out.println("ե��һ������֭��");
		}
	}
	
	static class Juicer {
		public void run(Fruits f) {
			f.squeeze();
		}
		
	}
}
