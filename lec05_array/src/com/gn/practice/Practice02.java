package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		int[] numbers = {-62,107,-12,89,-35};
		for(int num:numbers) {
			if(num>50) {
				System.out.println(num);
			}
		   }
		 
		Scanner sc = new Scanner(System.in);
		int[] numbers1=new int[5];
		for(int su=0 ; su <numbers1.length; su ++) {
			System.out.print("입력:");
			int su1 = sc.nextInt();
			numbers1[su]= su1;
		}
		
		for(int num1:numbers1) {
			if(num1>50) {
				System.out.println(num1);
			}
		   }
		

		}

}
