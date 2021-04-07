package com.ict06.thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 s1 = new Ex15();
		new Thread(s1, "dog").start();
		new Thread(s1, "cat").start();
		
		// Thread thread_1 = new Thread(s1, tiger);
		
	}
}
