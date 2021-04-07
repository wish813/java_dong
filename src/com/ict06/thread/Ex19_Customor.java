package com.ict06.thread;

public class Ex19_Customor implements Runnable{
	
	private Ex17_Car car;
	private Throwable e;
	public Ex19_Customor(Ex17_Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 30; i++) {
			// 자동차를 사자
			carName = car.pop();
			try {
				Thread.sleep(((int)(Math.random()*200)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
