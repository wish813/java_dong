package com.ict03.class06;

enum Type2{
	// ������ ��Ű��
	// 1. �� ����
	WALK("��ŷȭ", 270),
	RUN("����ȭ", 275),
	TRACK("Ʈ��ŷȭ", 265),
	HIK("����ŷȭ", 260);
	
	// ��������
	final private String name;
	final private int size;
	
	// ������
	Type2(String name, int size) {
			this.name = name;
			this.size = size;
	}
	// 4. getter/ setter

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	
	
}

public class Ex03 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+", "+arr[i].getSize());
		}
		System.out.println("============================");
		
		for (Type2 k : arr) {
			System.out.println(k.getName()+", "+k.getSize());
		}
		System.out.println("=============================");

		// ������ for�� // foreach = forin
		// ':' �� �ǹ̰� �迭�� ������ �ִ� ó������ ������ ���ʴ��
		// ���ο��� ����� ������ �����Ű�� ����
		// ��, �迭�� Ư���� ��Ҹ� ó���Ҽ��� ����.
		// for (�ڷ��� ���ο�������Һ��� : �迭) {
		//	
		// }
		
		String[] msg = {"java", "jsp", "spring", "android"};
		for (String k : msg) {
			System.out.println(k);
		}
		
		
	}
}






















