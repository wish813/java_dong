package com.ict03.class05;

public interface Ex01 {
	// 인터페이스는 : 서비스를 제공하는 목록과 같은 것이다.(메뉴판)
	// 				  상수와 추상메소드들로 이루어졌다.
	//				  생성자가 없다.(객체 생성 못함) => 실제 사용 못함 => 다중상속 가능
	//				  실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//				  상속 받은 클래스를 사용하는 것이다.
	// ** '인터페이스'가 같다라는 말은 대체(호환)이 가능하다라는 뜻이다.
	
	// 인터페이스는 상수와 추상메소드만 가지고 있다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위 멤버필드는 모두 static final이다. (클래스가 인터페이스로 바뀌면 무조건 스테틱 파이널로 바뀐다)
	// 원래는 변수지만 static final이 된순간 모두 static final로 바뀌어 상수가 된다
	
	// 추상메소드가 아니므로 오류발생
	// public void play(){}
	
	// 일반적인 추상메소드 형태
	public abstract void like();
	
	// 인터페이스 안에서는 abstract 예약어를 안붙여도 된다
	public void sound();
}
