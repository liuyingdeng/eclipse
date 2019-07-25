package com.xupt.textThread;

public class Demo02 {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		t.start();
	}
}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("aaaaaaa");
		}
		
	}
	
}