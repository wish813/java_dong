package com.ict11.test;

import java.util.Random;

public class Ex01 {
		// 1번 문제. 메소드의 선언부를 기술
	public static void main(String[] args) {
		// 2번 문제 . 기본 자료형 8가지
		//boolean, char, byte, short, int, long, float, double
		// 3번 문제. int intVar = 129;
		int intVar = 129;
		byte byteVar = (byte) intVar;
		
		// 4번 문제. 
		// a++ : 현재 변수 a가 가지고 있는 값을 사용한 후 나중에 a값이 1증가
		// ++a : 현재 변수 a가 가지고 있는 값에 1을 증가 한 후 나머지 계산
		
		// 문제5. 
		double s1 = 36.6666;
		double k1 = (int)(s1*10)/10.0;
		System.out.println(k1);
		
		// 언어의 특성 활용하기
		// 문제1 클래스는 무엇들로 이루어 졌는가 3가지 쓰시오
		// 멤버필드(변수와 상수), 멤서메소드, 생성자
		
		// 문제2] => 생성자
		
		// 문제3] => 오버로딩
		
		// 문제4] => 오버라이딩
		
		// 문제5] 
		// 추상클래스 : 추상메소드를 하나 이상 가지고 있는 클래스
		//				추상메소드란 body가 없는 메소드, 구체화 되지 않은 메소드
		
		// 인터페이스 : 상수와 추상메소드로 이루어진 클래스
		//				생성자 없음, 객체 생성 못함
		
		// 라이브러리 활용하기
		// 문제1] 랜덤
		Random random = new Random();
		int su1 = random.nextInt(10)+1;
		int su2 = (int)(random.nextDouble()*10)+1;
		System.out.println(su1);
		System.out.println(su2);
		
		// 문제2]
		// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체 타입
		// 컬렉션 : 객체를 모아서 관리하는 인터페이스를 구현한것
		//			객체를 모아서 관리하는 자료구조를 말한다.
		
		// 문제3]
		// Thread => start(). run() 둘다 있다.
		// Runnable => run() 만 있다
		
		
		
		
	}
}















