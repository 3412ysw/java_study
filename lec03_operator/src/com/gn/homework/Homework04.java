package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int su1 = sc.nextInt();
		System.out.print("수학 : ");
		int su2 = sc.nextInt();
		System.out.print("영어 : ");
		int su3 = sc.nextInt();
		int num0 = ((su1 + su2 + su3)/3);
		System.out.println("합계 : " + (su1 + su2 + su3));
		System.out.println("평균 : " + num0);
		boolean num1 = num0 >60;
		boolean num2 = num0 >90;
		System.out.println(num1 && num2 ? "휴대폰을 바꿀 수 있습니다.": "휴대폰을 바꿀 수 없습니다.");
		
		
	}

}
