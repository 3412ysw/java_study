package com.gn.study;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		String word = sc.nextLine();
		System.out.print("머리(cm) : ");
		int su = sc.nextInt();
		if (word.equals("F")) {
			if (su <= 7) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else if (word.equals("M")){
		    if (su <= 3) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
		
	}
}
