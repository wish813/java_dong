package com.ict06.thread;

// ������� start() => run() �̵��ؾ� ������ ó���� ��
//			start() => start() ������ �ƴ�
//			run() => run() ������ƴ�

// ������ ������ Thread Ŭ������ ���, Runnable �������̽� ���
// ������ Ŭ������ start(), run() ��� ������ �ִ�.
// Runnable �������̽��� run()�� ������ �ִ�.(start()�� ����)
// �켱������ �����̸��� �켱���� �д�

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
