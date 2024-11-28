package com.gn.study;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 : ");
		int su2 = sc.nextInt(); 
		System.out.println("두 수 중에서 작은 수는?" + (su1 > su2? su2:su1));
	}

}
