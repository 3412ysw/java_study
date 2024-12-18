package com.gn.homework03;

import java.util.Scanner;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mailMenu() {
		while(true) {
			System.out.println(" ===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println(" 메뉴 번호 입력 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : joinMember(); break;
			case 2 : mc.login(null, null); 
			         memberMenu(); break;
			case 3 :sameName(); break;
			case 9 :  ;
			default : joinMember(); break;
			}
			
			
			
		}
		
	}
	
	public void memberMenu() {}
	
	public void joinMember() {}
	
	public void login() {}
	
	public void changePassword() {}
	
	public void changeName() {}
	
	public void sameName() {}
	
	
	
	
	
	
	
	
}
