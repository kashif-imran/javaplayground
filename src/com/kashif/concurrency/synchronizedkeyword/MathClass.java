package com.kashif.concurrency.synchronizedkeyword;

public class MathClass {
	void printNumbers(int n) throws InterruptedException {
		synchronized (this) {
			for (int i = 1; i <= n; i++) {
				System.out.println(Thread.currentThread().getName() + " :: " + i);
				Thread.sleep(500);
			}
		}
	}
	
	 synchronized void printNumbers2(int n) throws InterruptedException
	    {
	        for (int i = 1; i <= n; i++)
	        {
	            System.out.println(Thread.currentThread().getName() + " :: "+  i);
	            Thread.sleep(500);
	        }
	    }
}
