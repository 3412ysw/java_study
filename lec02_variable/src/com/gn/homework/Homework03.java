package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
	    char num = word.charAt(0);
	    char num1 = word.charAt(1);
	    char num2 = word.charAt(2);
	    
	    System.out.println("첫번째 문자 : " + num);
	    System.out.println("두번째 문자 : " + num1);
	    System.out.println("세번째 문자 : " + num2);
		
	    char su = sc.nextLine().charAt(0);
		
		
	}

}
