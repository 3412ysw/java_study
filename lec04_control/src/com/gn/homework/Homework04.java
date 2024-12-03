package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		System.out.println("=== 합격인가? 불합격인가? ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수 : ");
		int grade1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int grade2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int grade3 = sc.nextInt();
		System.out.print("프로그래밍언어활용 : ");
		int grade4 = sc.nextInt();
		System.out.print("정보시스템구축관리 : ");
		int grade5 = sc.nextInt();
		
		int avg = (grade1+grade2+grade3+grade4+grade5)/5;
		
		String fail_subject = "";
		
		if(grade1 >= 40 && grade2 >= 40 && grade3 >= 40 && grade4 >= 40 && grade5 >= 40) {
			if(avg >= 60) {
				System.out.println("합격을 축하합니다.");
			} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		} else {
			if(grade1<40) {
				fail_subject += "소프트웨어설계 과목 ";
			}
			if(grade2<40) {
				fail_subject += "소프트웨어개발 과목 ";
			}
			if(grade3<40) {
				fail_subject += "데이터베이스구축 과목 ";
			}
			if(grade4<40) {
				fail_subject += "프로그래밍언어활용 과목 "; 
				// fail_subject = fail_subject + "프로그래밍언어활용 과목 "; 
			}
			if(grade5<40) {
				fail_subject += "정보시스템구축관리 과목 ";
			}
			System.out.println(fail_subject + "과락으로 불합격입니다.");
		}
	    
		
		
		
		
		
	}

}
