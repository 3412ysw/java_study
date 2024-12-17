package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.controller.BuilderController;

public class BuilderMenu {

	Scanner sc = new Scanner(System.in);
	BuilderController bc = new BuilderController();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("==============================");
		System.out.println("1. 지정 문자열 사용");
		System.out.println("2. 입력 문자열 사용");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : builderMenu(); break;
			case 2 : inputMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	
	public void builderMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("띄어쓰기 제거 전 : "+str);
		System.out.println("띄어쓰기 제거 후 : " + bc.afterReplace(str));
		System.out.println("대문자로 변환 : "+bc.afterReplace(str).toUpperCase());
		System.out.println("띄어쓰기 제거 후 글자수 : "+bc.afterReplace(str).length());
	}
	
	public void inputMenu() {
		System.out.print("문자열 입력 : ");
		sc.nextLine();
		String answer1 = sc.next();
		System.out.println(bc.firstCap(answer1));
		System.out.print("문자 입력 : ");
		sc.nextLine();
		String answer2 = sc.next();
		char answer = answer2.charAt(0);
		System.out.println(bc.findChar(answer1,answer));
		
	}
	
	
	
	
}
