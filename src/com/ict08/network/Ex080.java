package com.ict08.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Ex080 {
	public static void main(String[] args) {
		String pathname1 = "C:"+File.separator+"study"+ File.separator+"util"+File.separator+"java_1.png";
	File read_file = new File(pathname1);
	
	String pathname2 = "C:"+File.separator+"study"+ File.separator+"util"+File.separator+"res"+File.separator+"java_1.png";
	File write_file = new File(pathname2);
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	try {
		fis = new FileInputStream(read_file);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream(write_file);
		bos = new BufferedOutputStream(fos);
		
		int k = 0;
		while ((k = bis.read())!=-1) {
			bos.write(k);
		}
		bos.flush();
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		try {
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
	
	}
}
