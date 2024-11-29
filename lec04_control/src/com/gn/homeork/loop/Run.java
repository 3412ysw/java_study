package com.gn.homeork.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 입력하세요.");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		Practice practice = new practice();
		swhich(menu) {
			case 1 : practice.practice02();
			    break;
			    
		}
		sc.close();
		
	
	}

}
