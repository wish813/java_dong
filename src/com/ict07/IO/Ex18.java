package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader : �ӵ������ ���ؼ� ���, ���� �� �д� �޼ҵ尡 �����Ѵ�.
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// �ѱ��� �ϱ�
			// int k = br.read();
			// System.out.println((char)+(k));
			
			// ��ü �б�
			/*
			int k = 0;
			while ((k = br.read())!=-1) {
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
			/*
			char[] c = new char[(int)file.length()];
			br.read(c);
			String msg = new String(c);
			System.out.println(msg);
			*/
			
			// ���� �б�
			// String msg = br.readLine();
			//System.out.println(msg);
			
			// ��� �б�
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
	
}



















