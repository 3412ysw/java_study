package com.gn.study;

public class Loopstmt {

	public static void main(String[] args) {
		//1. for문
		// 1 ~ 10까지 숫자 모두 출력
				// 초기식 -> 출발점(1)
				// 조건식 -> 도착점 (10)
				// 증감식 -> step(몇걸음씩)
				//for (초기식; 조건식; 증감식){}
				
		for(int i = 1 ; i <= 10 ; i++) {
					//System.out.println(i);
			   }
			   
		// 2. 초기식 생략
		int a = 1;
		for(; a <= 5; a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		
		for(int i = 1;; i++) {
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}
		
		
		int sum = 0;
		sum += 1;
		sum += 2;
		
	}

}
