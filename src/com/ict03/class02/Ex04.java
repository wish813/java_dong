package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalcount = 0;
		int vcnt = 0;
		esc: while (true) {
			totalcount++;
			// ��ǻ��
			int computer = (int) (Math.random() * 3); // 0,1,2
			System.out.println("1.����, 2.����, 3.���� ������ �ּ���.");
			int user = scan.nextInt();
			if (computer == 0) {
				if (user == 1) {
					System.out.println("���");
				} else if (user == 2) {
					vcnt++;
					System.out.println("�̱�");
				} else if (user == 3) {
					System.out.println("��");
				}
			} else if (computer == 1) {
				if (user == 1) {
					System.out.println("��");
				} else if (user == 2) {
					System.out.println("���");
				} else if (user == 3) {
					vcnt++;
					System.out.println("�̱�");
				}
			} else if (computer == 2) {
				if (user == 1) {
					vcnt++;
					System.out.println("�̱�");
				} else if (user == 2) {
					System.out.println("��");
				} else if (user == 3) {
					System.out.println("���");
				}
			}
			while (true) {
				System.out.print("����ұ��?(y/n) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}

			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����ǵ���Ƚ�� : " + totalcount + " �·� : " + ((vcnt * 1.0) / totalcount) * 100 + "%");

	}
}
