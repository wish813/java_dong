package com.ict06.thread;

// Runnable 인터페이스는
public class Ex09 implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+  " : 가가가가가");
			
		}
	}
}
