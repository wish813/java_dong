package com.ict06.thread;


import java.util.ArrayList;
import java.util.List;

public class Ex17_Car {
		// 컬렉션 : 
	private List<String> carList = null;
	
	public Ex17_Car() {
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
		case 0 : carName = "SM5"; break;
		case 1 : carName = "SM6"; break;
		case 2 : carName = "SM7"; break;
		}
		return carName;
	}
	
	public synchronized String pop(){
		String carName = null;
		// 재고가 없으면
		if(carList.size()==0) {
			System.out.println("차가 없네요. 생성할 때까지 기다려 주세요");
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//재고가 있을 때는 carList에서 가장 나중에 들어간 차를 판매(삭제)
		carName = carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다. 판매한 차는"+ carName+"\n");
		return carName;
	}
	// 자동차를 carList에 넣기
	// 창고에 자동차 5대가 되면 소비자들에게 판매를 시작한다.
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("자동차를 만들어서 창고에 보관 : " + car);
		// 재고가 0일때 대기시킨 스레드를 준비상태로 변경시킨다.
		if(carList.size() == 5) {
			notify();
		}
	}
	
	
}






















