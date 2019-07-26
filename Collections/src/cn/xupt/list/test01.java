package cn.xupt.list;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import cn.xupt.bean.Student;

/**
	 *  ����¼��5��ѧ����Ϣ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ����������ִܷӵ͵������������̨
	 */
public class test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ѧ���ĳɼ�����ʽΪ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�:");
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1,Student s2) {
				int num=s2.getSum() - s1.getSum();
				return num== 0 ? 1 : num;
			}
		});
		while(ts.size() < 5) {
			String line =sc.nextLine();
			String[] arr =line.split("��");
			int chinese =Integer.parseInt(arr[1]);
			int math =Integer.parseInt(arr[2]);
			int english =Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0],chinese,math,english));
			}
		
		System.out.println("������ѧ����Ϣ��");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}