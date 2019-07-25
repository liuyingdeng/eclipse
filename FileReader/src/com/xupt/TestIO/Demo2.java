package com.xupt.TestIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		File file=getFile();
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("file"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b=bis.read())  !=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	/**
	 * 定义一个方法获取键盘录入的文件路径，并封装成File返回。
	 * 1，返回值类型File
	 * 2，无参数列表
	 */
	public static File getFile() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个文件路径：");
		while (true) {
			String line=sc.nextLine();  //接受键盘录入的路径
			File file=new File(line);   //封装成File对象，并对其进行判断
			if(!file.exists()) {
				System.out.println("请输入一个存在的文件路径！");
			}else if(file.isDirectory()) {
				System.out.println("您输入的是文件夹路径，请输入文件路径：");
			}else
				return file;
		}
	}
}
