package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		//Ex03 Ŭ������ ��ü�� ������
		// �޼���� ȣ���ؾ߸� ���� / ��ȯ���� �ֳ� ���Ŀ� ���� �����̴ٸ� / 
		Ex03 test = new Ex03();  // ���� Ŭ���� �ڴ� ������ - �⺻������ ���� / ���ڰ� ����
		
		// plus01�� void�̹Ƿ� ���� ������ ����.
		System.out.println(1);
		test.plus01();
		System.out.println(3);
		System.out.println(test.result);
		
		// sub01�� ��Ȳ���� int �̹Ƿ�
		// ���� ������ int�� ������
		int sub = test.sub01();
		System.out.println(sub);
	}
}
