package com.ict06.thread;

// ���� : �� ���� �����带 �����Ͽ� ù��° �������� ����� 1-100���� ����ϰ�
//		  �ι�° �������� ����� 101-200���� ��� �϶� (synchronized ���)
public class Ex15 implements Runnable{
	int s = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ ":" + (++s));
		}
	}
}
