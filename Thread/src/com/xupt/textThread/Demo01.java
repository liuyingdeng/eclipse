package com.xupt.textThread;

public class Demo01 {
	public static void main(String[] args) {
		MyThread mt=new MyThread();              //4������Thread���������
		mt.start();                              //5�������߳�
	}
}
class MyThread extends Thread{                   //1���̳и���Thread
	public void run() {                          //2����дRun����
		for (int i=0;i<1000;i++) {               
			System.out.println("aaaaaaaa");      //3������Ҫִ�еĴ���д��Run������
		}
	}
}