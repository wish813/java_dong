package com.ict06.thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07, Ex08, Ex09�� Runnable�� ��� �޾ұ� ������
		// start()�� ����.
		// t1.start();
		
		// ������ run()�� ���� Ŭ���� �� Ÿ���� �����ؾ� �Ѵ�.
		// Thread thread1 = new Thread();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// �ȵ���̵� ���� ���� ����ϴ� ��� (�͸� ���� Ŭ����)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName()+  " : ����������");
				}
			}
		}).start();
	}
}
