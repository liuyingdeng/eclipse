package com.xupt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.xupt.bean.Person;

public class Demo4_Field {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.xupt.bean.Person");                 //����·����ȡ��ļ����ļ�
		Constructor c=clazz.getConstructor(String.class,int.class);        //��ȡ�вι���
		Person p=(Person)c.newInstance("����",23);                           //�����вι��촴������
		System.out.println(p);
		
		//Field f=clazz.getField("name");                         //��ȡ�����ֶ�
		//f.set(p, "����");                                                                                                             //�޸������ֶ�
		
		Field f=clazz.getDeclaredField("name");                    //������ȡ�����ֶ�
		f.setAccessible(true);                                     //ȥ��Ȩ��
		f.set(p, "����");                                            //�޸������ֶ�
		System.out.println(p);
	}
}
