package cn.xupt.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo01 {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("cn.xupt.test.annotation.SxtStudent");
			//������������Чע��
			Annotation[] annontations=c.getAnnotations();
			for(Annotation a:annontations) {
				System.out.println(a);				
			}
			//������ָ��ע��
			SxtTable st=(SxtTable)c.getAnnotation(SxtTable.class);
			System.out.println(st.value());
			//����������ע��
			Field f=c.getDeclaredField("studentName");
			SxtField s=f.getAnnotation(SxtField.class);
			System.out.println(s.columnName()+"--"+s.type()+"--"+s.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
