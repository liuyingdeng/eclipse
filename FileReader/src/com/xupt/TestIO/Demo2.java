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
	 * ����һ��������ȡ����¼����ļ�·��������װ��File���ء�
	 * 1������ֵ����File
	 * 2���޲����б�
	 */
	public static File getFile() {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ļ�·����");
		while (true) {
			String line=sc.nextLine();  //���ܼ���¼���·��
			File file=new File(line);   //��װ��File���󣬲���������ж�
			if(!file.exists()) {
				System.out.println("������һ�����ڵ��ļ�·����");
			}else if(file.isDirectory()) {
				System.out.println("����������ļ���·�����������ļ�·����");
			}else
				return file;
		}
	}
}
