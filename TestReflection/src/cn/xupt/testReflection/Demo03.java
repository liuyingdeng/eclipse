package cn.xupt.testReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.xupt.test.bean.User;

/**
 * 通过反射API动态操作：构造器、方法、属性
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		try {
			Class<User> clazz=(Class<User>)Class.forName(path);
			
			//通过反射API调用构造方法，构造对象。
			User u=clazz.newInstance();//调用了User的无参构造器。
			System.out.println(u);
			Constructor<User> c=clazz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2=c.newInstance(1001,1,"流星一");
			System.out.println(u2.getUname());
			
			//通过反射调用普通方法。
			User u3=clazz.newInstance();
			Method methods=clazz.getDeclaredMethod("setUname",String.class);
			methods.invoke(u3,"流星二");
			System.out.println(u3.getUname());
			
			//通过反射API操作属性。
			User u4=clazz.newInstance();
			Field field=clazz.getDeclaredField("uname");
			field.setAccessible(true);
			field.set(u4,"流星三");
			System.out.println(u4.getUname());//通过发射直接读取属性值。
			System.out.println(field.get(u4));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
