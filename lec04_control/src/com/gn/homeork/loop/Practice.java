package com.gn.homeork.loop;

import java.util.Scanner;

public class Practice {
	
	public void Practice01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int nums = sc.nextInt();
		int total = 0;
		while(true){
			if(1<=nums&&nums<=50) {
				for(int i = 1; i <= nums; i++) {
					if(i%2 ==1) {
						continue;
					}
					total += i;
				}
				System.out.println("합계 : " + total);
				break;
			}else {
				System.out.println("1~50 사이의 정수를 입력하세요. ");
				System.out.print("정수 : ");
				nums = sc.nextInt();
			}
			
		}
		
	}
	
	public void Practice02(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int su = sc.nextInt();
		
		while(true) {
			//System.out.print("숫자 : ");
			//int su = sc.nextInt();
		if(su < 0) {
			System.out.println("양수만 입력해주세요.");
			System.out.print("숫자 : ");
			su = sc.nextInt();
		}else if (su > 9) {
			System.out.println("9이하의 숫자를 입력해주세요.");
			System.out.print("숫자 : ");
			su = sc.nextInt();
		} else if(su==0){
			break;
		} else {
			for(int i = su; i < 10; i++) {
				System.out.println("=== "+ su +"단 ===");
				for(int j = 1; j < 10; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}System.out.print("숫자 : ");
			 su = sc.nextInt();
			
		}
		
	    }sc.close();
	}


	public void Practice03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.nextLine();
		String anser = "탈출";
		
		while(true) {
		for(int i=0;;i++) {
			if(text.equals(anser)) {
			break;
			}else {
				System.out.println(text);
				System.out.print("입력 : ");
				text = sc.nextLine();
			}
		}
		}
	}
	
	public void practice04(){
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 실행합니다!");
		do {
		System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
		String text = sc.nextLine();
		}
	}
	
	
	public void practice06() {
		for(int i= 4; i > 0 ; i--) {
			System.out.print(" ");
			for(int j = 1; j < 10; j++) {
				System.out.print("*");
			}
		}
		
	}
	
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while(true) {
			if(num>0) {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;
			}else {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			}
		}
		
		
		
	}
	
	
	
}
