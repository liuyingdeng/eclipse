package com.xupt.textThread;

public class Demo07 {
	public static void main(String[] args) {
		 final Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(getName()+"....aaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					if(i==1) {
						try {
							t1.join(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					    System.out.println(getName()+"....bb");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
