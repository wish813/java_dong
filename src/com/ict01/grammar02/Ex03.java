package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
	// 정수형 : 소수점이 없는 숫자
	// 정수형 : byte < short < int < long
	// 정수형의 기본은 int 이다.
	// 주의사항 : byte, short 를 연산하면 결과는 무조건 int 이상

	// byte : -128 ~ 127 사이의 숫자만 사용 가능
	byte s1 = -127 ;
	System.out.println(s1) ;

	s1 = -128;
	System.out.println(s1) ;

	// byte 범위가 벗어나서 오류발생
	// s1 = -129;
	System.out.println(s1) ;

	// short : -32,768 ~ 32,767 범위 안에 존재하는 정수를 저장
	// 오류발생 : 결과값이 저장된다.(결과를 먼저 구해야 된다.)
	// short s2 = 32760 +100 ;
	// System.out.println(s2);

	// int와 long 은 범위를 외울 필요없다.
	// 앞으로 일반적인 정수는 int 이다.
	// 아주 큰 정수를 사용할고자 할때는 long을 사용하면 된다.
	// long 에는 숫자 뒤에 L 또는 l 을 붙인다.(생략가능)
	int s3 = 117 ;

	long s4 = 117L ;
	long s5 = 117l ;
	long s6 = 117 ;

	// 실수 : 소수점이 존재하는 수
	// 무조건 정수보다는 크다.
	// 실수의 기본형은 dobule 이다.
	// float는 숫자 뒤에 F 또는 f를 붙인다.(생략불가)
	// char < 정수(int, long) < float < double ; 

	float s7 = 3.14f ;
	System.out.println(s7);
	
	double s8 = 3.14;
	System.out.println(s8);
	 
	double s9 = 117 ;
	System.out.println(s9);

	}
}






