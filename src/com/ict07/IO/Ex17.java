package com.ict07.IO;

import java.io.File;
import java.io.FileReader;

public class Ex17 {
	public static void main(String[] args) {
		// FileInputStream : 1byte ó��, read():int(�ƽ�Ű) => char����ȯ, ��ҹ���, ���ڸ� ����
		//					 read(byte[] b), String �̿�
		// FileReader      : read():int(�����ڵ�) => char����ȯ, �� ���蹮�� ó�� ����
		// 				   : read(char[] b), String �̿�
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// �ѱ��� �ϱ�
			//int k = fr.read();
			//System.out.println(k+":"+(char)+(k));
			
			// ��ü �б�
			/*
			int k = 0;
			while ((k = fr.read())!=-1) {
				System.out.println((char)+(k));
			}
			*/
			// char[] �̿�
			// char[] c = new char[(int)file.length()];
			// fr.read(c);
			// for (char k : c) {
				//System.out.println(k);
			// }
			
			// String
			char[] c = new char[(int)file.length()];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
			
		} catch (Exception e) {
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
	
}



















