	package cn.xupt.testReflection;
/**
 * ����java.lang,class����Ļ�ȡ��ʽ
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String path="cn.xupt.test.bean.User";
		try {
			Class clazz=Class.forName(path);
			//�����Ǳ�ʾ���װһЩ���ݡ�һ���౻���غ�JVM�ᴴ��һ����Ӧ���Class������������ṹ��Ϣ�ᱻ���ڶ�Ӧ��Class�����С�
			//���Class�������һ�澵�ӣ�ͨ������������ǿ��Կ����������������Ϣ��
			System.out.println(clazz.hashCode());
			Class clazz2=Class.forName(path);//һ�����Ӧ��ֻ��һ��Class����
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
