package com.ict11.test;

import java.util.Random;

public class Ex01 {
		// 1�� ����. �޼ҵ��� ����θ� ���
	public static void main(String[] args) {
		// 2�� ���� . �⺻ �ڷ��� 8����
		//boolean, char, byte, short, int, long, float, double
		// 3�� ����. int intVar = 129;
		int intVar = 129;
		byte byteVar = (byte) intVar;
		
		// 4�� ����. 
		// a++ : ���� ���� a�� ������ �ִ� ���� ����� �� ���߿� a���� 1����
		// ++a : ���� ���� a�� ������ �ִ� ���� 1�� ���� �� �� ������ ���
		
		// ����5. 
		double s1 = 36.6666;
		double k1 = (int)(s1*10)/10.0;
		System.out.println(k1);
		
		// ����� Ư�� Ȱ���ϱ�
		// ����1 Ŭ������ ������� �̷�� ���°� 3���� ���ÿ�
		// ����ʵ�(������ ���), �⼭�޼ҵ�, ������
		
		// ����2] => ������
		
		// ����3] => �����ε�
		
		// ����4] => �������̵�
		
		// ����5] 
		// �߻�Ŭ���� : �߻�޼ҵ带 �ϳ� �̻� ������ �ִ� Ŭ����
		//				�߻�޼ҵ�� body�� ���� �޼ҵ�, ��üȭ ���� ���� �޼ҵ�
		
		// �������̽� : ����� �߻�޼ҵ�� �̷���� Ŭ����
		//				������ ����, ��ü ���� ����
		
		// ���̺귯�� Ȱ���ϱ�
		// ����1] ����
		Random random = new Random();
		int su1 = random.nextInt(10)+1;
		int su2 = (int)(random.nextDouble()*10)+1;
		System.out.println(su1);
		System.out.println(su2);
		
		// ����2]
		// ���״� : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��ü Ÿ��
		// �÷��� : ��ü�� ��Ƽ� �����ϴ� �������̽��� �����Ѱ�
		//			��ü�� ��Ƽ� �����ϴ� �ڷᱸ���� ���Ѵ�.
		
		// ����3]
		// Thread => start(). run() �Ѵ� �ִ�.
		// Runnable => run() �� �ִ�
		
		
		
		
	}
}















