package com.xupt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xupt.bean.Person;

public class Demo5_Method {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.xupt.bean.Person");                 //获取类的class文件
		Constructor c=clazz.getConstructor(String.class,int.class);        //获取有参构造
		Person p=(Person) c.newInstance("张三",23);                         //利用有参构造创建对象
		
		Method m=clazz.getMethod("sleep");                                 //获取空参方法
		m.invoke(p);                                                       //调用Method类代表的方法
		
		Method m1=clazz.getMethod("sleep", int.class);                     //获取有参方法
		m1.invoke(p, 10);                                                  //调用Method类代表的方法
	}
	
}
