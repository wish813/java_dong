package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffe = new Ex08();   // new �� �ϳ��� ��ü ����(�ν��Ͻ�����θ�, �ν��Ͻ�=��ü)
		coffe.setName("Ŀ������");
		coffe.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);
		
		// �迭�� ����
		// �ڷ���[] �̸� = new �ڷ���[����]
		/*
		Ex08[] arr = new Ex08[4];
		arr [0] = coffe;
		arr [1] = ion;
		arr [2] = cola;
		arr [3] = juice;
		*/
		Ex08[] arr = {coffe, ion, cola, juice};
		
		// arr[] �迭�� ������ �ִ� �̸��� ������ �������
		/*
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+", " + arr[i].getPrice());
		}
		*/
		
		// ���� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����");
		int input = scan.nextInt();
		if (input < 1500) {
			System.out.println("�ݾ� ����");
		} else {
			System.out.println("1. Ŀ��\t 2.�̿�\t 3.ź��\t 4.����\t");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		
		// 1500 �̸��̸� �ݾ� ����
		// 1500 �̻��̸� ���� ����
		System.out.println();
		System.out.print("��ȣ�� �����ϼ��� >>   ");
		int drink = scan.nextInt();
		int output = 0;
		if(drink == 1) {
			output = input - arr[0].getPrice();
		}else if(drink == 2) {
			output = input - arr[1].getPrice();
		}else if(drink == 3) {
			output = input - arr[2].getPrice();
		}else if(drink == 4) {
			output = input - arr[3].getPrice();
		}
		// ����) �ܵ��� ������ �� �ٽ� ����� �ֵ��� while�� ���
		System.out.println("�ܵ� : " + output);
	}
}














