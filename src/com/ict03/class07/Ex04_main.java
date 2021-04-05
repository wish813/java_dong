package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
		// static 내부클래스는 객체 생성 가능, static은 그냥호출 가능
		System.out.println(Inner03.i3);
		System.out.println(Inner03.i4);
		
		// static 내부클래스 중에 static이 없는 멤버는
		// 객체 생성후 사용 가능(외부클래스 사용 안함)
		Inner03 t1 = new Inner03();
		System.out.println(t1.name);
		System.out.println(t1.i2);
		
		t1.play();
	}
}
