package com.ict06.thread;

// Runnable �������̽���
public class Ex09 implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+  " : ����������");
			
		}
	}
}
