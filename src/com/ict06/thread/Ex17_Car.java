package com.ict06.thread;


import java.util.ArrayList;
import java.util.List;

public class Ex17_Car {
		// �÷��� : 
	private List<String> carList = null;
	
	public Ex17_Car() {
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
		case 0 : carName = "SM5"; break;
		case 1 : carName = "SM6"; break;
		case 2 : carName = "SM7"; break;
		}
		return carName;
	}
	
	public synchronized String pop(){
		String carName = null;
		// ��� ������
		if(carList.size()==0) {
			System.out.println("���� ���׿�. ������ ������ ��ٷ� �ּ���");
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//��� ���� ���� carList���� ���� ���߿� �� ���� �Ǹ�(����)
		carName = carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�. �Ǹ��� ����"+ carName+"\n");
		return carName;
	}
	// �ڵ����� carList�� �ֱ�
	// â�� �ڵ��� 5�밡 �Ǹ� �Һ��ڵ鿡�� �ǸŸ� �����Ѵ�.
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("�ڵ����� ���� â�� ���� : " + car);
		// ��� 0�϶� ����Ų �����带 �غ���·� �����Ų��.
		if(carList.size() == 5) {
			notify();
		}
	}
	
	
}






















