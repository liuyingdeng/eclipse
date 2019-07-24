package cn.xupt.testReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.xupt.test.bean.User;

/**
 * ͨ������API��̬������������������������
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		try {
			Class<User> clazz=(Class<User>)Class.forName(path);
			
			//ͨ������API���ù��췽�����������
			User u=clazz.newInstance();//������User���޲ι�������
			System.out.println(u);
			Constructor<User> c=clazz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2=c.newInstance(1001,1,"����һ");
			System.out.println(u2.getUname());
			
			//ͨ�����������ͨ������
			User u3=clazz.newInstance();
			Method methods=clazz.getDeclaredMethod("setUname",String.class);
			methods.invoke(u3,"���Ƕ�");
			System.out.println(u3.getUname());
			
			//ͨ������API�������ԡ�
			User u4=clazz.newInstance();
			Field field=clazz.getDeclaredField("uname");
			field.setAccessible(true);
			field.set(u4,"������");
			System.out.println(u4.getUname());//ͨ������ֱ�Ӷ�ȡ����ֵ��
			System.out.println(field.get(u4));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
