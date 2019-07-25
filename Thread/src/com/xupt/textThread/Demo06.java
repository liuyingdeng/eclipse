package com.xupt.textThread;

public class Demo06 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println(getName()+"....aaaaaaa");
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println(getName()+"....bb");
				}
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
