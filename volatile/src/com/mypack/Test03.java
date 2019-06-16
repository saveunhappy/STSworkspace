package com.mypack;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test03 {
	public static void main(String[] args) {
		//创建线程池
		ExecutorService pool = Executors.newFixedThreadPool(10);
		ThreadDemo1 t = new ThreadDemo1();
		//为线程池中的线程分配任务
		for (int i = 0; i < 10; i++) {
			pool.submit(t);
		}
		//关闭线程池
		pool.shutdown();
	}
}
class ThreadDemo1 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		return sum;
	}
	
}
