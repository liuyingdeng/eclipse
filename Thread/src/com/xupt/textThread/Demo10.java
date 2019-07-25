package com.xupt.textThread;

import java.lang.ref.WeakReference;
/**
 * ÈõÒıÓÃ¾ÙÀı
 * @author Administrator
 *
 */

public class Demo10 {

	public static void main(String[] args) throws InterruptedException{
		WeakReference r = new WeakReference(new String ("I am here"));
		WeakReference sr = new WeakReference("I am here");
		System.out.println("before gc r = "+r.get()+", sr = "+sr.get());
		System.gc();
		Thread.sleep(1000);
		System.out.print("after gc r = "+r.get()+",sr = "+sr.get());
	}

}
