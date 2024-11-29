package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		String word = sc.nextLine();
	    char num = word.charAt(7);
	    String gender = (num == '1' || num =='3') ? "남성" : (num == '2' || num =='4') ? "여성" : "잘못된 값";
	    
		System.out.println("입력하신 주민번호는 " + gender + "입니다.");

	}

}
