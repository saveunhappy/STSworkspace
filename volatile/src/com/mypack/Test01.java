package com.mypack;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {

	public static void main(String[] args) {
		
		TestVolatile tx = new TestVolatile();
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(tx).start();
		}
		
	}
	
}
class TestVolatile implements Runnable{
	private AtomicInteger num = new AtomicInteger(1);
	//private volatile int num;
	private static  CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	
	static {
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
	}
	@Override
	public void run() {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getNum());
		
		
	
	*/
	}	
		
	public int getNum() {
		return num.incrementAndGet();
	}
	
	
}