package com.xupt.textThread;

public class Demo05 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName()+"....aaaaaaaa");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName()+"....aaaaaaaa");
				}
			}
		}.start();
	}
	public static void demo01() throws InterruptedException {
		for(int i=20;i>0;i--) {
			Thread.sleep(1000);
			System.out.println("µ¹¼ÆÊ±µÚ"+i+"Ãë");
		}
	}
}

