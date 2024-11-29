package com.gn.homeork.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 선택하세요");	
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.println("6. 합격인가? 불합격인가?");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		Practice practice = new Practice();
		switch(menu) {
			case 4 : practice.Practice04();
				break;
			case 5 : practice.Practice05();
			break;
		
		}	
	    sc.close();
    }
}

