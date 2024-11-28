package com.gn.study;

import java.util.Scanner;

public class Practice06_1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 : ");
			int su1 = sc.nextInt();
			System.out.print("두번째 : ");
			int su2 = sc.nextInt(); 
			System.out.print("세번째 : ");
			int su3 = sc.nextInt();
			int max = su1 > su2 ? (su1>su3? su1 : su3) : (su2 > su3 ? su2:su3);
			System.out.println("세 수 중에서 가장 큰 수는?" + max);
		
		
	}

}