package com.gn.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 주소 입력 : ");
		String mail = sc.nextLine();
		mail = mail.trim();
		String last = mail.substring(mail.indexOf("@")+1);
		String first = mail.substring(0,mail.indexOf("@")).toUpperCase();
		if(last.equals("goodee.co.kr")) {
			System.out.println("아이디 : " + first);
		}else {
			System.out.println("유효하지 않은 이메일입니다.");
		}

	}

}
//- 사용자로부터 이메일 주소를 입력 받으세요.
//- 입력받은 이메일에 앞뒤 공백을 제거합니다.
//- 이메일이 @goodee.co.kr로 끝나는지 확인합니다.
//- 만일 @뒤에 글자가 위와 다를 경우 “유효하지 않은 이메일입니다.”를 출력합니다.
//- 유효한 이메일이라면, 아이디(@앞부분)을 추출하면 대문자로 변환한 뒤 출력하세요.