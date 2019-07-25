package com.xupt.MupThread;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintNumber implements Runnable{

	private int[] number= {1,2,3,4,5,6,7,8,9,10};
	private AtomicBoolean isnumber ;

	public PrintNumber(AtomicBoolean isnumber) {
		this.isnumber = isnumber ;
	}

	@Override
	public void run() {
		int j=0 ;
		for(int i = 0 ; i < number.length ; i ++) {
			while(!isnumber.get()) {
				Thread.yield();
			}
			j++;
			System.out.print(number[i]+" ");
			if(j==2) {
				isnumber.set(false);
				j=0;
			}
			
		}
		isnumber.set(false);
	}
	

}
