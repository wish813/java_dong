package com.ict06.thread;

// 스레드는 start() => run() 이동해야 스레드 처리가 됨
//			start() => start() 스레드 아님
//			run() => run() 스레드아님

// 스레드 실행은 Thread 클래스를 상속, Runnable 인터페이스 상속
// 스레드 클래스는 start(), run() 모두 가지고 있다.
// Runnable 인터페이스는 run()만 가지고 있다.(start()는 없음)
// 우선순위는 같은이름을 우선으로 둔다

public class Ex03 extends Thread{
	public void go() {
		for (int i = 1; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	/*
	@Override
	public void start() {
		for (int i = 11; i <20; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	*/
	@Override
	public void run() {
		for (int i = 1; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
