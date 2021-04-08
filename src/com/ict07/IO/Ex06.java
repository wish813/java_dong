package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException{
		// 속도 향상을 위해서 BufferedOutputStream 을 사용한다.
		// 혼자서는 사용할수 없고 반드시BufferedOutputStream을 받아서 사용
		// 생성자 : BufferedOutputStream(OutputStream out)
		
		
		// 특정위치의 파일까지 지정
		String pathname = "C"+File.separator+"study"+File.separator
							+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// 기존파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file);
			
			// 기존파일이 있으면 이어쓰기하고, 없으면 생성한다.
			//fos = new FileOutputStream(file, true);
			
			// 한글자 쓰기
			fos.write(65);  // A
			fos.write(97);  // a
			
			// int 이기 때문에 char를 사용할 수 있다.
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			// 자바에서 줄변경 13(Carriage return =CR = \r) 이다.
			// 다른 언어중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있다.)
			fos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
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
