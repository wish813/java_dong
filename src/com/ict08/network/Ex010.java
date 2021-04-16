package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("복사장소와 파일명 : " );
	String pathname1 =  scan.next();
	System.out.println("붙이기 장소와 파일명 : " );
	String pathname2 =  scan.next();
	File file1 = new File(pathname1);
	File file2 = new File(pathname2);
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	try {
		fr = new FileReader(file1);
		br = new BufferedReader(fr);
		
		fw = new FileWriter(file2);
		bw = new BufferedWriter(fw);
		
		int k= 0;
		while ((k=br.read()) !=-1 ) {
				bw.write(k);
			}
		
		bw.flush();
		
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		try {
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
	}
	}

