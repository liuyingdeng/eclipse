package cn.xupt.list;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘接收一个字符串，程序对字符进行排序并输出
 */
public class test03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String line=sc.nextLine();
		char[] arr=line.toCharArray();
		TreeSet<Character> ts=new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num=c1.compareTo(c2);
				return num==0 ? 1:num;
			}
		});
		
		for (Character c: arr) {
			ts.add(c);
		}
		
		for (Character c : ts) {
			System.out.println(c);
		}
	}
}
