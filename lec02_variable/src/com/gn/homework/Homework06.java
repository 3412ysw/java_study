package com.gn.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한자리 숫자를 입력하세요 : ");
		char su = sc.nextLine().charAt(0);
		System.out.print("입력한 숫자의 제곱은 "+ (su*su) +"입니다.");
	}

}
