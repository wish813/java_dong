package com.ict06.thread;

// Runnable 인터페이스는
public class Ex08 implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+ " : aaaaa");
			
		}
	}
}
