package com.xupt.reflect;

import com.xupt.bean.Person;

public class Demo01_Reflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz01=Class.forName("com.xupt.bean.Person");
		Class clazz02=Person.class;
		
		Person p=new Person();
		Class clazz03=p.getClass();
		
		System.out.println(clazz01==clazz02);
		System.out.println(clazz02==clazz03);
	}
}
