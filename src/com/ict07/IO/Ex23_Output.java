package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 직렬화 : ObjectOutputStream : writeObject() 를 사용해야지 직렬화가 된다
public class Ex23_Output {
	public static void main(String[] args) {
	// 직렬화 : 특정클래스(VO)를 객체로 만들어 특정위치에 .ser로 만들어서 저장한다.
	// 			객체들이 가지고 있는 내용들이 직렬화 되어 있다.(사람은 정보를 제대로 볼수 없다.)	
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체직렬화를 하기 위한 객체를 만듬
			Ex23_VO vo = new Ex23_VO("둘리", 28, 67.3, true);
		
			
			// 객체 직렬화
			oos.writeObject(vo);;
			oos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
