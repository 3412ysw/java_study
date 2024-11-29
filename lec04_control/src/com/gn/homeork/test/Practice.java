package com.gn.homeork.test;

import java.util.Scanner;

//기능메소드
public class Practice {
	//1번 기능: 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
		
	}
	//2번 기능: 두 개의 숫자를 입력 받아서 합 출력
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num1 = sc.nextInt();
		System.out.print("숫자: ");
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		sc.close();
	}
	
	
	
}
