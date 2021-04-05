package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� catch�� : try���� ���� �߻��� ���� ������ ���ܰ� �߻��� ��� ���
		// ���� ���� : Exception�� ����Ҷ� �ݵ�� �Ʒ��� catch������ ����Ѵ�
		
		Scanner scan = new Scanner(System.in);
		/*
		try {
			int var = 27;
			System.out.println("���� �Է� : ");
			int su = scan.nextInt();
			System.out.println("���� : " + (var/su));
			
			
		} catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���");
		} catch (ArithmeticException e) {
			System.out.println("0 ���δ� ���ڸ� ���� �� �����ϴ�.");
		}
		*/
		try {
			int var = 27;
			System.out.println("���� �Է� : ");
			int su = scan.nextInt();
			System.out.println("���� : " + (var/su));
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���" + e);
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
		
	}
}
	