package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream 과 DataInpurStream
		// 기본자료형을 주고 받을 때 사용 (기본 자료형을 읽고 쓰는 메소드가 별도로 존재한다.)
		// FileInputStram 과 FileOutputStream과 다른 점은
		// 이진데이터(0,1)를 입/출력 할때 사용 한다.(타시스템과 입/출력할때 유리)
		// ** 입력순서와 출력순서가 다르면 데이터의 결과가 달라질수 있다.
		// BufferedInputStream 과 BufferedOutputStream을 활용할수 있다.
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict03.txt";
		File file = new File(pathname);
		
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(dos);
			
			// 쓰기 메소드 : writeXXX (XXX는 기본자료형을 말한다.)
			// 메모장의 열기를 해도 읽을 수가 없다.
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			// 읽는 메소드 : readXXX(XXX는 기본자료형을 말한다.)
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
		} catch (Exception e) {
		}finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
				
				
			} catch (Exception e2) {
			}
		}
		
		
	}
	
}
