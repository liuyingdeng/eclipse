package com.xupt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xupt.bean.Person;

public class Demo5_Method {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.xupt.bean.Person");                 //��ȡ���class�ļ�
		Constructor c=clazz.getConstructor(String.class,int.class);        //��ȡ�вι���
		Person p=(Person) c.newInstance("����",23);                         //�����вι��촴������
		
		Method m=clazz.getMethod("sleep");                                 //��ȡ�ղη���
		m.invoke(p);                                                       //����Method�����ķ���
		
		Method m1=clazz.getMethod("sleep", int.class);                     //��ȡ�вη���
		m1.invoke(p, 10);                                                  //����Method�����ķ���
	}
	
}
