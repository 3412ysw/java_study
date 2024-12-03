package com.gn.homeork.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 입력하세요.");
		System.out.println("1. 1~50까지 짝수 합하기");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("4. 게임 재시작");
		System.out.println("5. 양수만 더하기");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.println("8. 문자열의 개수");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		Practice practice = new Practice();
		switch(menu) {
			case 1 : practice.Practice01();
			    break;
			case 2 : practice.Practice02();
			    break;
			case 3 : practice.Practice03();
			    break;
			case 4 : practice.practice04();
				break;
			case 5 : practice.practice05();
				break;	
			case 6 : practice.practice06();
				break;
			case 7 : practice.practice07();
			    break;
			case 8 : practice.practice08();
		    	break;
		}
		sc.close();
		
	
	}

}
