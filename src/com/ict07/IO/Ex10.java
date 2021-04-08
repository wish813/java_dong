package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10 {
	public static void main(String[] args) {
		// c:\\study\\util\\test100.txt\\ 파일안에
		// 이름 : 000
		// 나이 : 00
		// 전화번호 : 010-0000-0000를
		// 작성하는 코딩을 하시오
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
