package com.gn.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
//		- 이름에서 첫글자를 추출합니다.
		String namef = name.substring(0,1);
		String namel = name.substring(1);
		String year = birth.substring(3,5);
		String date = birth.substring(6);
		
		System.out.println("암호 : "
		+ namef + year + date + namel);
		
//		- 생년월일에서 연도와 월을 추출합니다.
//		- 이름의 첫글자+연도끝두자리+일+나머지 이름 형식으로 암호를 만들어주세요.
		
		

	}

}
