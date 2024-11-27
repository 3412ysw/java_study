package com.gn.homework;

import java.util.Scanner;


public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double su1 = sc.nextDouble();
		System.out.print("영어 : ");
		double su2 = sc.nextDouble();
		System.out.print("수학 : ");
		double su3 = sc.nextDouble();
		System.out.println("총점 : " + (int)(su1+su2+su3));
		System.out.println("평균 : " + (int)((su1+su2+su3)/3));
	}

}
