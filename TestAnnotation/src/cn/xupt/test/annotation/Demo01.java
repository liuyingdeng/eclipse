package cn.xupt.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo01 {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("cn.xupt.test.annotation.SxtStudent");
			//获得类的所有有效注解
			Annotation[] annontations=c.getAnnotations();
			for(Annotation a:annontations) {
				System.out.println(a);				
			}
			//获得类的指定注解
			SxtTable st=(SxtTable)c.getAnnotation(SxtTable.class);
			System.out.println(st.value());
			//获得类的属性注解
			Field f=c.getDeclaredField("studentName");
			SxtField s=f.getAnnotation(SxtField.class);
			System.out.println(s.columnName()+"--"+s.type()+"--"+s.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
