package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String word = sc.nextLine();
		
		System.out.println(word.equals("간다") ? "앵무새 : 온다" : "앵무새 : 간다");
		
		
	}

}
