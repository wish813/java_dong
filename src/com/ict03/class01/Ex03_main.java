package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		//Ex03 클래스를 객체로 만들자
		// 메서드는 호출해야만 반응 / 반환형이 있냐 없냐에 따라 반응이다름 / 
		Ex03 test = new Ex03();  // 앞은 클래스 뒤는 생성자 - 기본생성자 형식 / 인자가 없음
		
		// plus01은 void이므로 받을 데이터 없다.
		System.out.println(1);
		test.plus01();
		System.out.println(3);
		System.out.println(test.result);
		
		// sub01은 반황형이 int 이므로
		// 저장 변수도 int로 만들자
		int sub = test.sub01();
		System.out.println(sub);
	}
}
