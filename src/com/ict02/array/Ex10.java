package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 번호, 국어, 영어, 수학점수를 입력받아서
		// 번호, 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 : ");
			int no = scan.nextInt();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();
			
			int sum = kor + eng+ math;
			int avg = sum / 3;
			
			String hak = "";
			
			int[] person = new int[7];
			
			if (avg >=90) {
				hak= "A학점";
			} else if (avg>=80) {
				hak= "B학점";
			} else if (avg>=70) {
				hak= "C학점";
			} else {
				hak= "F학점";
			}{

			}{

			}
			int[] person = new int[5];
			person[0]= no;
			person[1]= sum;
			person[2]= avg;
			person[3]= hak;
			person[4]= rank;
			
			arr[1] = person;
			
		}
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) continue; {
					if (arr[i][4] < arr[j][1]) {
						arr[i][4]++;
					}
				}
			}
		}
		
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j==3) {
					System.out.print((char)arr[i][j]+"  ");
				} else {
					System.out.print(arr[i][j]+"  ");
				}
			}
		}
		System.out.println();
		
		
		
	}
}









