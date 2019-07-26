package cn.xupt.list;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *程序启动后，可以从键盘录入多个整数值，知道输入quit时退出，把所有输入的整数倒序排列打印。 
 */
public class test02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		TreeSet <Integer> ts=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num =i2.compareTo(i1);
				return num ==0?1:num;
			}
		});
		while(true) {
			String line=sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			Integer i=Integer.parseInt(line);
			ts.add(i);
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
