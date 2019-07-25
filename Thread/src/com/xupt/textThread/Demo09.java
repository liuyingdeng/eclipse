package com.xupt.textThread;

public class Demo09 {

}
class Printer {
	private int flag=1;
	public void print01() throws InterruptedException {
		synchronized(this) {
			if(flag!=1) {
				this.wait();
			}
		}
	}
}
