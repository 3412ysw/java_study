package com.gn.homework08;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자: ");
		double num1 = sc.nextDouble();
		System.out.print("10의 제곱 수 : ");
		int num2 = sc.nextInt();
		
		double after = 
		Math.round(num1*Math.pow(10,num2))/Math.pow(10,num2);
		
		System.out.println("반올림된 결과: "+after);
		

	}

}
