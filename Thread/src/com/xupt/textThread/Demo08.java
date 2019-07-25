package com.xupt.textThread;


public class Demo08 {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
	}
}
class Singleton{
	private Singleton() {}
	private static Singleton s=new Singleton();
	public static Singleton getInstance() {
		return s;
	}
}