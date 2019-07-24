	package cn.xupt.testReflection;
/**
 * 测试java.lang,class对象的获取方式
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		try {
			Class clazz=Class.forName(path);
			//对象是表示或封装一些数据。一个类被加载后，JVM会创建一个对应类的Class对象，类的整个结构信息会被放在对应的Class对象中。
			//这个Class对象就像一面镜子，通过这个镜子我们可以看到并获得这个类的信息。
			System.out.println(clazz.hashCode());
			Class clazz2=Class.forName(path);//一个类对应的只有一个Class对象
			System.out.println(clazz2.hashCode());
			
			Class strClazz=String.class;
			Class strClazz2=path.getClass();
			System.out.println(strClazz==strClazz2);
			
			Class intclass=int.class;
			int[] arr01=new int[10];
			int[][] arr02=new int[30][2];
			int[] arr03=new int[30];
			double[] arr04=new double[10];
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());
			System.out.println(arr03.getClass().hashCode());
			System.out.println(arr04.getClass().hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
