package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// FIle Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		String pathname_1 = "c:\\study\\utill";  // �ü���� window �϶�
		String pathname_2 = "c:/study/utill";    // �ü���� Linux, Unix �϶�
		
		// �ü���� ������� ����ϴ� ���
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		
		// ��¥���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm");
		
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3, k);
			//System.out.println(file2);
			// ��ǻ�Ϳ� ������ �� �ִ� ������ ���丮�� ���� �ۿ� ����.
			if(file2.isDirectory()) {
				System.out.println("���丮 : " + file2 + "\nũ�� : ũ�Ⱑ �������� ����\n"+
												"������ ��¥ : " + sdf.format(file2.lastModified()));
			}else {
				System.out.println("���� : " + file2+
									"\nũ�� : " + (int)(file2.length()/1024)+"KB \n"+
									"������ ��¥ : "+ sdf.format(file.lastModified()));
			}
		}
	}
}



// ���� ��¥ ���ϱ�
// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm");






