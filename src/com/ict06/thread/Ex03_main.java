package com.ict06.thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===================================");
		
		// ������ ó���ϱ� ���ؼ� start() ���� �ϸ�
		// run()�� ���� ������ ������ó���� �ȴ�.
		// �׷��� start()�� �־ start()�� ����.
		// �̰��� ������ ó���� �ƴϴ�.
		// Ex03�� �ִ� start()�� �ּ�ó���ϸ�
		// start() => sun()�� ���� �ȴ�.
		// �̰��� ������ ó���ߴٰ� �Ѵ�.
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===================================");
	}
}
