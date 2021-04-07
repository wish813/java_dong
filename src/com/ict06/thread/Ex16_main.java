package com.ict06.thread;

public class Ex16_main {
	public static void main(String[] args) {
		Ex16 s1 = new Ex16();
		new Thread(s1, "dog").start();
		new Thread(s1, "cat").start();
	}
}
