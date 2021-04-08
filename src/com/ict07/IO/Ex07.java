package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
public class Ex07 {
	public static void main(String[] args) {
		// 1. FileInputStream : ������ ������� 1byte�� �����͸� �б⸦ �� �� �ִ� ��Ʈ��
		// - ������ : FileInputStream(File file), FileInputStream(String name)
		//   File file, String name => Ư������ + �����̸�
		// - �ֿ� �޼ҵ�
		//   read() : ��ȯ���� int => ����� ����(�ƽ�Ű �ڵ�)�� ����
		//							  char�� ���� ����ȯ �ؾ� ���ڰ� �ȴ�.
		//							  �� �̻� ���� ���� ���� �� -1 �� ���´�.
		//							  �� ����� ���ڴ� ���� �� ����.
		//   read(byte[] b) : int => �迭�� ���� ���ڿ� ������
		//							 �迭ũ�� ��ŭ ���ڸ� ���� �� �ִ�.
		//							 (byte[] b�� ���� ���ڵ��� �迭 ũ�⸸ŭ ����ȴ�.)
		
		//   close : open�� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally���� ó��
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(file);
			
			// �ѱ��� �о���� : read() => ����(�ƽ�Ű�ڵ�) -> ����ȯ
			// int k = fis.read();
			// System.out.println(k+":"+(char)(k));
			
			// �ѱ��ھ� ��� �б� : �׸�, �Ҹ�, ������ ������ ������ �ش� ����� ���
			// �� ������� ���ڵ��� ���� �� ����.
			/*
			int k = 0;
			while (true) {
				k = fis.read();
				if(k == -1) break;{
					System.out.println(k+":"+(char)k);
				}
			}
			 catch (IOException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
		     try {
		    	fis.close(); 
		     }
			}
			
		} catch (FileNotFoundException e) {
		} e.printStackTrace();
		
		
	}
}
}
*/









