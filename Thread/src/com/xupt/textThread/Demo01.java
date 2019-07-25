package com.xupt.textThread;

public class Demo01 {
	public static void main(String[] args) {
		MyThread mt=new MyThread();              //4、创建Thread的子类对象
		mt.start();                              //5、开启线程
	}
}
class MyThread extends Thread{                   //1、继承父类Thread
	public void run() {                          //2、重写Run方法
		for (int i=0;i<1000;i++) {               
			System.out.println("aaaaaaaa");      //3、将需要执行的代码写在Run方法中
		}
	}
}