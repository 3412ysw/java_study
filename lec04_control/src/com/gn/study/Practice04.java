package com.gn.study;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조명의 밝기를 입력하세요 (0~3) : ");
		int num = sc.nextInt();
		String text = "";
		switch(num) {
			case 0: text = "조명을 끕니다."; break;
			case 1: text = "어두운 조명입니다."; break;
			case 2: text = "밝은 조명입니다."; break;
			case 3: text = "매우 밝은 조명입니다."; break;
			default : text = "올바른 입력이 아닙니다."; break;
		}
		System.out.println("현재 조명의 밝기 : " + text);
	}

}
