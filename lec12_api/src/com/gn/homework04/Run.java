package com.gn.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String end = "";
		for(int i = 0 ; ; i++){
			System.out.print("문자열 : ");
			String answer = sc.nextLine();
			if(answer.equals("N")||answer.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("최종 문자열 : " + end);
				break;
			}else {
		        end += answer;
				
			}
			
		}
		
		
		
		

	}

}
