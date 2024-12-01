package com.gn.homeork.loop;

import java.util.Scanner;

public class Practice {
	
	public void Practice02(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int su1 = sc.nextInt();
				
			if(su1 < 0 ) {
			System.out.println("양수만 입력해주세요.");
			}else if(su1 > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
			}else if(su1 < 1) {
				System.out.println();
			}else if(su1 < 10) {
			    for(;su1 < 10; su1 ++) {
			    	System.out.println("=== "+ su1 + "단 ===" ); 
			    	for(int su2 = 1; su2<10; su2++) {
			    		System.out.println(su1+ "*"+ su2+ "=" + (su1*su2));
			    	}
			    }
			}
			}


	public void Practice03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.nextLine();
		for(;;) {
			if(text.equals(text)) {
			break;
		}
		}
	}
	
	
	public void practice06() {
		for(int i= 1; i < 5; i++) {
			System.out.print(" ");
			for(int j = 1; j < 10; j++) {
				System.out.println("*");
			}
		}
		
	}
	
	
	
}
