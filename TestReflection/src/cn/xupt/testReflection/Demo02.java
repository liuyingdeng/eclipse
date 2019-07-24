package cn.xupt.testReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射API，获取类的信息（类的名字、属性、方法、构造器等）。
 * @author Administrator
 *
 */

public class Demo02 {
	
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		
		try {
			Class clazz=Class.forName(path);
			
			//获取类的名字。
			System.out.println(clazz.getName());//获取包名+类名
			System.out.println(clazz.getSimpleName());//获取类名
			
			//获取属性的信息。
			Field[] fields=clazz.getFields();//只能获得public的属性。
			Field[] field=clazz.getDeclaredFields();//可以获得所有的属性信息。
			Field f=clazz.getDeclaredField("uname");
			System.out.println(field.length);
			for(Field temp:field) {
				System.out.println("属性"+temp);
			}
			//获取方法的信息。
			Method[] methods=clazz.getDeclaredMethods();
			Method m01=clazz.getDeclaredMethod("getUname",null);
			//如果方法有参，则必须传递方法对应的Class对象。
			Method mo2=clazz.getDeclaredMethod("setUname", String.class);
			for(Method m:methods) {
				System.out.println("方法"+m);
			}
			//获得构造器的信息。
			Constructor[] constructors=clazz.getDeclaredConstructors();
			Constructor c=clazz.getDeclaredConstructor(int.class,int.class,String.class);
			System.out.println("获得构造器："+c);
			for(Constructor temp:constructors) {
				System.out.println("构造器"+temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}