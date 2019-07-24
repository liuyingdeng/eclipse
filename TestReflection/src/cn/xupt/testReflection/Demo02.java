package cn.xupt.testReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Ӧ�÷���API����ȡ�����Ϣ��������֡����ԡ��������������ȣ���
 * @author Administrator
 *
 */

public class Demo02 {
	
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		
		try {
			Class clazz=Class.forName(path);
			
			//��ȡ������֡�
			System.out.println(clazz.getName());//��ȡ����+����
			System.out.println(clazz.getSimpleName());//��ȡ����
			
			//��ȡ���Ե���Ϣ��
			Field[] fields=clazz.getFields();//ֻ�ܻ��public�����ԡ�
			Field[] field=clazz.getDeclaredFields();//���Ի�����е�������Ϣ��
			Field f=clazz.getDeclaredField("uname");
			System.out.println(field.length);
			for(Field temp:field) {
				System.out.println("����"+temp);
			}
			//��ȡ��������Ϣ��
			Method[] methods=clazz.getDeclaredMethods();
			Method m01=clazz.getDeclaredMethod("getUname",null);
			//��������вΣ�����봫�ݷ�����Ӧ��Class����
			Method mo2=clazz.getDeclaredMethod("setUname", String.class);
			for(Method m:methods) {
				System.out.println("����"+m);
			}
			//��ù���������Ϣ��
			Constructor[] constructors=clazz.getDeclaredConstructors();
			Constructor c=clazz.getDeclaredConstructor(int.class,int.class,String.class);
			System.out.println("��ù�������"+c);
			for(Constructor temp:constructors) {
				System.out.println("������"+temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}