package com.ict06.thread;

public class Ex20_TestMain {
	public static void main(String[] args) {
		Ex17_Car car = new Ex17_Car();
		// 공통자원 == 임계영역 => 동기화처리
		Ex18_producer producer = new Ex18_producer(car);
		Ex19_Customor customor = new Ex19_Customor(car);
		
		new Thread(producer).start();
		new Thread(customor).start();
		
		
	}
}
