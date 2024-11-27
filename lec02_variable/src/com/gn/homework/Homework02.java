package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double su1 = sc.nextDouble();
		System.out.print("세로 : ");
		double su2 = sc.nextDouble();
		System.out.println("면적 : " + (su1*su2));
		System.out.println("둘레 : " + ((su1+su2)*2));
	}

}
