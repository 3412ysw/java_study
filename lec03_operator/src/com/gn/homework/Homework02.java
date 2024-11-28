package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int num = sc.nextInt();
		System.out.println((num%2)> 0 ?"구슬의 개수는 홀수입니다. " : "구슬의 개수는 짝수입니다." );
	
	}

}
