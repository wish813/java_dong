package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException{
		// �ӵ� ����� ���ؼ� BufferedOutputStream �� ����Ѵ�.
		// ȥ�ڼ��� ����Ҽ� ���� �ݵ��BufferedOutputStream�� �޾Ƽ� ���
		// ������ : BufferedOutputStream(OutputStream out)
		
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname = "C"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// ���������� ������ ����� �ϰ�, ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			
			// ���������� ������ �̾���ϰ�, ������ �����Ѵ�.
			//fos = new FileOutputStream(file, true);
			
			// �ѱ��� ����
			fos.write(65);  // A
			fos.write(97);  // a
			
			// int �̱� ������ char�� ����� �� �ִ�.
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			// �ڹٿ��� �ٺ��� 13(Carriage return =CR = \r) �̴�.
			// �ٸ� ����߿��� (\r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			fos.write(13);
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'b', 'o', 'y', 's', 13, 'g', 'i', 'r', 'l', 's', 13};
			fos.write(b);
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
