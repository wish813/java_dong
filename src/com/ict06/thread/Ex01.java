package com.ict06.thread;

public class Ex01 {
	public static void main(String[] args) {
		// Thread ������
		// - thread() : �⺻������
		// - thread(Runnable target) : Runnable�������̽��� ���ڷ� �޾Ƽ� ó��
		//  						   �͸� ����Ŭ������ ����Ҽ� �ִ�.
		// - thread(Runnable target, String name) : �̶� name�� �������̸� ������ �� �ִ�.
		//											Runnable target�������̽��� ���ڷ� �޾Ƽ� ó��
		// - thread(String name) : �̶� name�� �������̸� ������ �� �ִ�.
		
		// �ֿ�޼ҵ�
		// - join() : ���� ������� join() �޼ҵ带 ȣ���� �����尡 ����������
		//			  �����·� �����ִٰ� join()�� ȣ���� �����尡 ������ �ٽ� �����Ѵ�.
		// 			  ��, join()�� ȣ���� �����尡 ������ ���� ������ �� ����.
		// - start() : start()�� �����ϸ� run()�� ȣ���Ѵ�.(���� start()�� ������ start()�� ����.)
		// - run()   : start()�� ȣ���ؼ� run()�� ����Ǹ� �̶� ������ ó���� �ߴٰ� �Ѵ�.
		// - sleep(long millis) : 1000�� 1�ʸ� �ǹ��ϰ�, ��� �����·� ���� �ִ� ���¸� ����
		// - yield() : ���� ���� ������ �� �켱������ ���� �ٸ� �����忡�� ������� �ѱ��.
		// - getName() : ������ �̸� ���ϱ�
		// - setName(String Name) : ������ �̸� ����
		// - (�����¶�)curruntThread() : ���� ����Ǵ� ������ ��ü�� �����Ѵ�.(static)
		
		// �տ��� ���� ��� ó���� main�����尡 ȥ�ڼ� �� ó���ߴ�.
		// �̷��� ���� �̱� ������ ��� �Ѵ�
		// �����带 ��ó���ϴ� �ϲ��̶�� ��������
		
		// JVM�� main�޼ҵ带 ȣ���ϸ� ������ main�����尡 ��ó���� �Ѵ�.
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());
		
		int result= test.sub(8, 5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);
	}
}
