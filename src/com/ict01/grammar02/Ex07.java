package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	// �̸��� ȫ�浿�� ����� ����:90, ����:80, ����:90�̴�.
	// ������ ����� ���ؼ� �̸�, ����, ����� �������
	// (��, ����� �Ҽ��� ù°�ڸ����� ���Ѵ�.)
		
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

	String name = "ȫ�浿";
	int kor = 90;
	int eng = 80;
	int math = 90;

	//���� ������ �̿��ؼ� ���ϴ� ���� ���� : ����
	int sum = kor+eng+math;
	double avg = sum*3.0 ;
	double avg2 = (int)(avg*10)/10.0;
	
	//���ϴ� ���� ��� 
	System.out.println("�̸�:"+name);
	System.out.println("����:"+sum);
	System.out.println("���:"+avg2);
 	
	
	}
}