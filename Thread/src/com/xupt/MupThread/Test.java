package com.xupt.MupThread;

import java.util.concurrent.atomic.AtomicBoolean;

public class Test {
	public static void main(String[] args) {
		AtomicBoolean isnumber = new AtomicBoolean(true) ;
		Thread thread1 = new Thread(new PrintNumber(isnumber));
		Thread thread2 = new Thread(new PrintChar(isnumber)) ;
		thread1.start();
		thread2.start();
	}

}
