package com.gn.study;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/* 1) 문제
		철수는 오늘 학교에서
		산술 연산자 +, -, *, /, %에 대해서 배웠습니다.
		두 개의 정수를 키보드로 입력 받고,
		다섯가지 산술 연산을 하여
		결과를 출력해주는 계산기를 만들어주세요.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int su1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int su2 = sc.nextInt();
		
		System.out.println("덧셈 : " + (su1 + su2));
		System.out.println("뺄셈 : " +( su1 - su2));
		System.out.println("곱셈 : " + (su1 * su2));
		System.out.println("몫 : " + (su1 / su2));
		System.out.println("나머지 : " + (su1 % su2));
		
	}

}
