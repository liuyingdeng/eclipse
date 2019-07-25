package com.xupt.textThread;

public class Demo04 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println(getName()+"....aaaaaaaaa");
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"....bb");
			}
		}).start();
		
		Thread.currentThread().setName("我是主线程!");
		System.out.println(Thread.currentThread().getName());
	}

}
