package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
/*Ex10 coffe = new Ex10();
		coffe.setName("아메리카노");
		coffe.setPrice(1500);
		
		Ex10 coffe2 = new Ex10();
		coffe2.setName("카페모카");
		coffe2.setPrice(1800);
		
		Ex10 coffe3 = new Ex10();
		coffe3.setName("카푸치노");
		coffe3.setPrice(2000);
		
		Ex10 coffe4 = new Ex10();
		coffe4.setName("카페라떼");
		coffe4.setPrice(2300);
		
		Ex10[] arr = {coffe, coffe2, coffe3, coffe4,};*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원수 : ");
		int su = scan.nextInt();
		
		//상품명과 가격(Ex10)을 가지는 배열
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1. 아메리카노 (2500)");
			System.out.println("2. 카페모카 (3000)");
			System.out.println("3. 카페라떼 (3500)");
			System.out.println("4. 자몽쥬스 (3000)");
			System.out.println("선택해주세요 >>> ");
			int menu = scan.nextInt();
			Ex10 product = new Ex10();
			if(menu==1) {
				product.setName("아메리카노");
				product.setPrice(2500);
			}else if(menu==2) {
				product.setName("카페모카");
				product.setPrice(3000);
			}else if(menu==3) {
				product.setName("카페라떼");
				product.setPrice(3500);
			}else if(menu==4) {
				product.setName("자몽쥬스");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		//전체금액
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum+offer[i].getPrice();
		}
		System.out.println("총 액 : " + sum);
		System.out.println("입 금 액 : ");
		int input = scan.nextInt();
		System.out.println("잔 돈 : " + (input - sum));
	}
}

















