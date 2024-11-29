package com.gn.homeork;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		System.out.println("=== 놀이동산 입장료 계산하기===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		//String word =
		if(age > 65 ) {
			System.out.println("무료");
		}else if (age > 18 ) {
			System.out.println("30000원");
		}else if (age > 12) {
			System.out.println("20000원");
		}else if (age > 2) {
			System.out.println("10000원");
		}else {
			System.out.println("무료");
		}
	}

	
}
