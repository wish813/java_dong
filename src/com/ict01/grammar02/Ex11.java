package com.ict01.grammar02;
class Ex11{
	public static void main(String[] args){
	// 비교연산자 : 변수나 상수의 값을 비교할때 사용
	//                 결과는 항상 boolean 이다. 논리값
	//                 boolean 형은 조건식에 사용된다.
	//                 자료형이 String인 경우에는 사용하지 말자
	int s1 = 90;
	int s2 = 80 ; 
	boolean res = s1 >= s2 ;
	System.out.println("결과:"+res);

	char s3 = 'c';
	char s4 = 'a';
	res = s3 >= s4;
	System.out.println("결과 : "+ res);

	// char 와 int 비교
	res = 'a' >=97;
	System.out.println("결과 : "+res);

	// int와 double 비교
	res = 97 >= 97.0;
	System.out.println("결과 : "+ res);
	
	res = 97 >= 97.0000001;
	System.out.println("결과 : " + res);

	String str1  = "대한민국";
	String str2 = "대한민국";

	// ==이표시는 결과는 나오지만 사용하지 마세요. 결과값이 나오는게아닌 저장공간이 같다는뜻
	// String은 비교하는 메서드가 별도로 존재한다.

	}
}




