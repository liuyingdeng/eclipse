package com.xupt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.xupt.bean.Person;

public class Demo4_Field {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.xupt.bean.Person");                 //根据路径获取类的加载文件
		Constructor c=clazz.getConstructor(String.class,int.class);        //获取有参构造
		Person p=(Person)c.newInstance("张三",23);                           //利用有参构造创建对象
		System.out.println(p);
		
		//Field f=clazz.getField("name");                         //获取姓名字段
		//f.set(p, "李四");                                                                                                             //修改姓名字段
		
		Field f=clazz.getDeclaredField("name");                    //暴力获取姓名字段
		f.setAccessible(true);                                     //去除权限
		f.set(p, "李四");                                            //修改姓名字段
		System.out.println(p);
	}
}
