package com.ict03.class05;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 멤버필드 들이 static 이라는 중거
		// 객체 생성없이 클래스 이름으로 접근할수 있다.
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
		
		// 값 변경이 안된다. => final 이라는 증거 / 값 변경이 가능 하면 static이다.
		/*
		System.out.println(Ex01.su1++);
		System.out.println(Ex01.su2++);
		System.out.println(Ex01.su3++);
		System.out.println(Ex01.su4++);
		*/
		
	}
}
