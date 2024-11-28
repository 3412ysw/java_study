package com.gn.study;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		//String str1 = name;
		//String str3 = new String("Chulsu");
		//boolean bool = str1.equals(str3);
		boolean bool = "Chulsu".equals(name);
		System.out.println("영어 이름이 일치하나요?"+ bool );
		boolean num1 = age >= 20;
		System.out.println("20대 인가요?"+ num1);
		boolean andBool =  "Chulsu".equals(name) && age >= 20;
		System.out.println("영어 이름이 일치하면서 동시에 20대 인가요?" + andBool);
		
		//철수가 여권을 만들려고 합니다.
		// 영어 이름이 : Chulsu 
		// 20대 이신가요?
		//1. 철수의 영어 이름과 나이 정보를 입력 받습니다.
		//2. 3가지 논리 형 데이터 출력
		// 출력 예시  (1) 영어 이름이 일치하나요? 트루 /
		// (2) 20대 이신가요?
		//(3) 영어 이름이일치하면서 동시에 20대이신가요
		
 	}

}
