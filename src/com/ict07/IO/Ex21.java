package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		// ����Ʈ - ���� ���� : ü�ι��
				// �Է� : OutputStreamWriter : OutputStream -> Writer
				//		  OutputStream -> OutputStreamWriter -> Writer -> BufferedWriter
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("Welcome");
			bw.newLine();
			bw.write("Java World");
			
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				osw.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
