package com.ict06.thread;

public class Ex18_producer implements Runnable{
	// 클래스를 자료형으로 사용
	private Ex17_Car car;
	
	// 생성자에서 받은 인자는 무조건 전역변수로 만들자
	public Ex18_producer(Ex17_Car car) {
		// 전역변수와 지역변수의 이름이 같을때 전역변수 앞에 this를 붙이자.
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 30; i++) {
			// 자동차 생산
			carName = car.getCar();
			// 생산된 자동차를창고에 넣자
			car.push(carName);
			
			try {
				Thread.sleep(((int)(Math.random()*300)));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
