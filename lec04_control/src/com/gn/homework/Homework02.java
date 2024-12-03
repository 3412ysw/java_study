package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int tem = sc.nextInt();
		if (month==1||month==2||month==12) {
			if(tem <= -15) {
				System.out.println("한파 경보");
			}else if(tem <= -12) {
				System.out.println("한파 주의보");
			}
		} else if (month==3||month==4||month==5) {
			
		} else if (month==6||month==7||month==8) {
			if(tem >= 35) {
				System.out.println("폭염 경보");
			}else if (tem >= 33) {
				System.out.println("폭염 주의보");
			}
		} else if (month==9||month==10||month==11) {
        }else {
        	System.out.println("해당하는 계절이 없습니다.");
        }
	
	}
}
