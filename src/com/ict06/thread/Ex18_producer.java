package com.ict06.thread;

public class Ex18_producer implements Runnable{
	// Ŭ������ �ڷ������� ���
	private Ex17_Car car;
	
	// �����ڿ��� ���� ���ڴ� ������ ���������� ������
	public Ex18_producer(Ex17_Car car) {
		// ���������� ���������� �̸��� ������ �������� �տ� this�� ������.
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 30; i++) {
			// �ڵ��� ����
			carName = car.getCar();
			// ����� �ڵ�����â�� ����
			car.push(carName);
			
			try {
				Thread.sleep(((int)(Math.random()*300)));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
