package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		// List �������̽��� ������ Ŭ������ : Stack, ArratList, Vector;
		// ArratList �� Vector : �迭�� ����� ����������, ����, ����, �߰��� �����Ӵ�.
		//						 ũ�⸦ �̸� �������� �ʾƵ� �ȴ�.
		//						 ArratList(����ȭ ���� ����), vector (����ȭ ���� = ��������)
		// set ������ ������ ����. �ߺ� �ȵ�
		// list ������ ������ ����, �ߺ� ����
		ArrayList<String> list = new ArrayList<String>();
		// �߰� : add
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		
		// ���� : add
		list.add(1, "�߽ż�");
		System.out.println(list);
		System.out.println();
		
		Vector<String> vector = new Vector<String>();
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.add("��ġ");
		System.out.println(vector);
		
		// ���� : 
		vector.add(2, "����");
		System.out.println(vector);
		
		if(list.contains("�����")) {
			// �˻� : ��ġ�� �˻�
			System.out.println(list.indexOf("�����")+ "��° ��ġ"); 
			// �˻� : �ش� ��ġ�� �����ϴ� ��ü �˻�
			System.out.println(list.get(3));  
			System.out.println(list.get(list.indexOf("�����")));    // list�� �����ϸ� ��������
			
		}else {
			System.out.println("���������ʽ��ϴ�.");
		}
		System.out.println(list.size() + "��Ұ� ������");
		
		// ġȯ : set
		list.set(3, "�̴�ȣ");
		System.out.println(list);
		
		// �߽ż��� ������ �߽ż��� ���������� �����ض�
		if(list.contains("�߽ż�")) {
			list.set(list.indexOf("�߽ż�"), "������");
		}else {
			System.out.println("����.");
		}
		System.out.println();
		// �ϳ��� ������ (for, iterator)
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("===========================================");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s1 = (String) it.next();
			System.out.println(s1);
			
		}
		
		
	}
}














