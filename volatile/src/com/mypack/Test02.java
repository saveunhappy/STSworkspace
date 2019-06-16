package com.mypack;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 *创建执行线程的方式：实现Callable接口,相较于实现Runnable接口，方法可以有返回值，并且可以抛出异常
 *执行Callable方式，需要FutureTask实现类的支持，用于接受运算结果,FutureTask 是Future接口的实现类
 */
public class Test02 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadDemo td = new ThreadDemo();
		
		FutureTask<Integer> task = new FutureTask<>(td);
		new Thread(task).start();
		Integer integer = task.get();
		System.out.println(integer);
//		Lock lock = new ReentrantLock();
	}
}

class ThreadDemo implements Callable<Integer>{

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
