package com.ict06.thread;

// Runnable �������̽��� run()�� ������ �ִ�
public class Ex07 implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+ " : 11111");
			
		}
	}
}
