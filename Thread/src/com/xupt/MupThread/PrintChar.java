package com.xupt.MupThread;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintChar implements Runnable{

	private char[] CharArray= {'a','b','c','d','e','f','g','h','i','j'};
	private AtomicBoolean isnumber;
	

	public PrintChar(AtomicBoolean isnumber) {
		this.isnumber = isnumber ;
	}

	@Override
	public void run() { 
		for(int i = 0 ; i < CharArray.length ; i ++) {
			while(isnumber.get()) {
				Thread.yield();
			}
			System.out.print(CharArray[i]+" ");
			isnumber.set(true);
		}
		isnumber.set(true);
	}

}
