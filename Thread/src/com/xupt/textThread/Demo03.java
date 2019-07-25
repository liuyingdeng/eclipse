package com.xupt.textThread;

public class Demo03 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i=0;i<1000;i++) {
					System.out.println("aaaaaaa");
				}
			}
		}.start();
		
		new Thread(new Runnable () {
			public void run() {
				for (int i=0;i<1000;i++) {
					System.out.println("aaaaaaa");
				}
			}
		}).start();
		
	}
}
