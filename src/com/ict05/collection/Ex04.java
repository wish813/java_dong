package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		// �ζ� : 1~45 (����, 6�ڸ�, �ߺ��ȵ�)
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random()*45)+1;  // +1�� ���ϸ� 0 ~ 44����������
					boolean b = lotto.add(k);
					if(!b) { // �ߺ� �Ǿ��� �� 
						i--;
					}
		}
		System.out.println(lotto);
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random()*45)+1;  // +1�� ���ϸ� 0 ~ 44����������
					boolean b = lotto2.add(k);
					if(!b) { // �ߺ� �Ǿ��� �� 
						i--;
					}
		}
		System.out.println(lotto2);
	}
}
