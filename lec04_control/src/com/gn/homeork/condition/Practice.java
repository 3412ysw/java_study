package com.gn.homeork.condition;

import java.util.Scanner;

public class Practice {

	public void Practice01(){
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		int age = sc.nextInt();
		}
	
	
	public void Practice04(){
		System.out.println("=== 철수네 공장 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		String text = "";
		switch(code) {
		case 400 : text = "잘못된 요청입니다.";
			break;
		case 404 : text = "요청하신 서비스를 찾을 수 없습니다.";
			break;
		case 500  : text = "처리 방법을 알 수 없는 문제가 발생했습니다.";
			break;
		case 503  : text = "일시적인 서버 오류가 발생하였습니다.";
			break;
		default : text = "잘못된 요청입니다";
			break;
			}
		System.out.println(text);
		}
	
	public void Practice05(){
		System.out.println("=== 헬스장 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int num = sc.nextInt();
		
		if(num<=0){
	    	   System.out.println("양수만 입력해주세요.");
	       }
		else if (num < 6) {
		    if(num==1) {
		    	System.out.println("스쿼트 운동 시간입니다.");
		    }else if(num==2) {
		        System.out.println("데드리프트 운동 시간입니다.");
		    }else if(num==3) {
		    	System.out.println("벤치 프레스 운동 시간입니다.");
		    }else if(num==4) {
		    	System.out.println("풀업 운동 시간입니다.");
		    }else if(num==5) {
		    	System.out.println("오늘도 수고하셨습니다.");
		     }
	     }else if(num > 6) {
		     System.out.println("목록에 있는 숫자만 입력해주세요.");
	     }
	}
	
	
	
	
	
	
	
	
	
}
