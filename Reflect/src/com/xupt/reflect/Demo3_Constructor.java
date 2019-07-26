package com.xupt.reflect;

import java.lang.reflect.Constructor;

import com.xupt.bean.Person;

public class Demo3_Constructor {
	public static void  main(String[] args) throws Exception {
		Class clazz=Class.forName("com.xupt.bean.Person");
		//Person p=(Person) clazz.newInstance();              //通过无参构造来创建对象
		//System.out.println(p);
		
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person) c.newInstance("张三",23);            //获取有参构造创建对象
		System.out.println(p);
		
	}
}
