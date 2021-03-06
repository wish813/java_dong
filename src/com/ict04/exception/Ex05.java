package com.ict04.exception;

import java.util.Scanner;

import javax.xml.crypto.NodeSetData;

public class Ex05 {
	// throws (에외 양도, 예외 전가)
	// - 예외가 발생하면 예외 처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
	// - 나중에라도 예외처리(try ~ catch)를 하는 것이 좋다.
	public static void main(String[] args){
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("정수 입력 : ");
			String msg = scan.next();
			test.SetData(msg);
		} catch (Exception e) {
			System.out.println("첫글자는 숫자로 입력하세요");
		}
		System.out.println("정수 입력 : ");
		String msg = scan.next();
		test.SetData(msg);
	}
	public void SetData(String msg) throws NumberFormatException {
		// msg에 글자의 길이가 한개 이상이면 실행
		if(msg.length()>=1) {
			String str = msg.substring(0, 1); // 첫글자만 추출해라
			prnData(str);
		}
	}
	
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i +"=" + (dan * i));
		}
	}
}
