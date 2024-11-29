package com.gn.study;

public class Practice08 {

	public static void main(String[] args) {
		
		int test = 0;
		for(int i = 2 ; i <10; i++) {
			if (test ==45) {
				System.out.println("계산 결과가 45입니다.");
				break;
			}
			System.out.println("=== " + i+ "단 ===");
			for(int j = 1; j <10; j++) {
				test = i*j;
				System.out.println(i+"*"+ j+"="+(test));
				
		    }
		}
		
		
		
	}

}
