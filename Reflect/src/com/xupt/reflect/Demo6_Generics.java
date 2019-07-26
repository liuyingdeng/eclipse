package com.xupt.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *  ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
 *	泛型擦除： 泛型只在编译期有效,在运行期会被擦除掉
 */
public class Demo6_Generics {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(111);
		list.add(222);
		
		Class clazz=Class.forName("java.util.ArrayList");
		Method m=clazz.getMethod("add", Object.class);
		m.invoke(list, "love");
		
		System.out.println(list);
	}
}
