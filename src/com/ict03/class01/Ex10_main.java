package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
/*Ex10 coffe = new Ex10();
		coffe.setName("�Ƹ޸�ī��");
		coffe.setPrice(1500);
		
		Ex10 coffe2 = new Ex10();
		coffe2.setName("ī���ī");
		coffe2.setPrice(1800);
		
		Ex10 coffe3 = new Ex10();
		coffe3.setName("īǪġ��");
		coffe3.setPrice(2000);
		
		Ex10 coffe4 = new Ex10();
		coffe4.setName("ī���");
		coffe4.setPrice(2300);
		
		Ex10[] arr = {coffe, coffe2, coffe3, coffe4,};*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ο��� : ");
		int su = scan.nextInt();
		
		//��ǰ��� ����(Ex10)�� ������ �迭
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1. �Ƹ޸�ī�� (2500)");
			System.out.println("2. ī���ī (3000)");
			System.out.println("3. ī��� (3500)");
			System.out.println("4. �ڸ��꽺 (3000)");
			System.out.println("�������ּ��� >>> ");
			int menu = scan.nextInt();
			Ex10 product = new Ex10();
			if(menu==1) {
				product.setName("�Ƹ޸�ī��");
				product.setPrice(2500);
			}else if(menu==2) {
				product.setName("ī���ī");
				product.setPrice(3000);
			}else if(menu==3) {
				product.setName("ī���");
				product.setPrice(3500);
			}else if(menu==4) {
				product.setName("�ڸ��꽺");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		//��ü�ݾ�
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum+offer[i].getPrice();
		}
		System.out.println("�� �� : " + sum);
		System.out.println("�� �� �� : ");
		int input = scan.nextInt();
		System.out.println("�� �� : " + (input - sum));
	}
}

















