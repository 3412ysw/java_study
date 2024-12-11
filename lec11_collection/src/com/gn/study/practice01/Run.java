package com.gn.study.practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String answer1 = sc.nextLine();
		System.out.print("숫자 입력: ");
		String answer2 = sc.nextLine();
		
		p.printSum(answer1,answer2);

	}

}
