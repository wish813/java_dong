package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	// 이름이 홍길동인 사람의 국어:90, 영어:80, 수학:90이다.
	// 총점과 평균을 구해서 이름, 총점, 평균을 출력하자
	// (단, 평균은 소숫점 첫째자리까지 구한다.)
		
	int s1 = 90;
	int s2 = 80;
	int s3 = 90;
	double s4 = (int)(s1+s2+s3);
	double s5 = (s4/3) ;  // 86.6666666666
	int s6 = (int)(s5*10);
	double s7 = s6 / 10.0;
	System.out.println(s4);  // 260
	System.out.println(s5);  // 86
	System.out.println(s6);  // 866
	System.out.println(s7); // 86.6

	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 90;

	//받은 정보를 이용해서 원하는 정보 추출 : 가공
	int sum = kor+eng+math;
	double avg = sum*3.0 ;
	double avg2 = (int)(avg*10)/10.0;
	
	//원하는 정보 출력 
	System.out.println("이름:"+name);
	System.out.println("총점:"+sum);
	System.out.println("평균:"+avg2);
 	
	
	}
}