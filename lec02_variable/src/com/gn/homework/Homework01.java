package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*- 보건교사 김철수는 언제나 학생들의 건강만 생각하는 학생 바보에요.
		 김철수 선생님을 위해서 학생의 키와 몸무게를 입력하면 체질량 지수(BMI)를 출력하는 시스템을 만들어주세요.
		 체질량 지수를 계산하는 공식은 몸무게(kg) / (키(m) * 키(m)) 입니다.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		double su1 = sc.nextDouble();
		System.out.print("키(m) : ");
		double su2 = sc.nextDouble();
	    System.out.println("BMI지수 : " + (su1/(su2*su2)));
		
		
	}

}
