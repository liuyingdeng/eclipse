package com.xupt.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *  ArrayList<Integer>��һ��������������������һ���ַ������ݣ����ʵ���أ�
 *	���Ͳ����� ����ֻ�ڱ�������Ч,�������ڻᱻ������
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
