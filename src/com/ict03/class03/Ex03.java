package com.ict03.class03;

// Ex02�� Ex03�� ��Ӱ���
public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34 ;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	public void study() {
		// ��ü �������� �θ�Ŭ������ ����� ����Ѱ�
		System.out.println("������� : " + addr );
		
		System.out.println("name : " + this.name);    // ���θ�
		System.out.println("anme : " + super.name);  // ������
		// ��Ӱ���� private�� ����Ҽ� ����.
		// System.out.println("�츮�� �ֿϵ��� : " + dog );
	}
		// �������̵� : �θ�޼ҵ带 �Ѹ���� �״�� ����ϸ鼭
		//  (������)	���븸 �����ϴ°�
		@Override
		public void eat() {
		 System.out.println("������ ��ħ�Ļ縦 �Ѵ�");
	 }
		// �������̵��� �Ҽ� �����ϴ� ����� : final
		// 
	
	
	
}
