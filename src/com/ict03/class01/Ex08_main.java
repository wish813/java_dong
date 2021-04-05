package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffe = new Ex08();   // new 로 하나의 객체 생성(인스턴스라고도부름, 인스턴스=객체)
		coffe.setName("커피음료");
		coffe.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);
		
		// 배열에 넣자
		// 자료형[] 이름 = new 자료형[갯수]
		/*
		Ex08[] arr = new Ex08[4];
		arr [0] = coffe;
		arr [1] = ion;
		arr [2] = cola;
		arr [3] = juice;
		*/
		Ex08[] arr = {coffe, ion, cola, juice};
		
		// arr[] 배열이 가지고 있는 이름과 가격을 출력하자
		/*
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+", " + arr[i].getPrice());
		}
		*/
		
		// 동전 투입
		Scanner scan = new Scanner(System.in);
		System.out.print("동전 투입");
		int input = scan.nextInt();
		if (input < 1500) {
			System.out.println("금액 부족");
		} else {
			System.out.println("1. 커피\t 2.이온\t 3.탄산\t 4.과일\t");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		
		// 1500 미만이면 금액 부족
		// 1500 이상이면 구입 가능
		System.out.println();
		System.out.print("번호로 선택하세요 >>   ");
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
		// 숙제) 잔돈이 남았을 때 다시 물어볼수 있도록 while문 사용
		System.out.println("잔돈 : " + output);
	}
}














