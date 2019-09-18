package com.kashif.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		ExecutorService executorService = 
				  new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,   
				  new LinkedBlockingQueue<Runnable>());
		
		ExecutorService executorServiceFactory = 
				Executors.newSingleThreadExecutor(); // factory method for ssame result as executorService
	}
}
