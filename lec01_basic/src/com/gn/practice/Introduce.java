package com.gn.practice;

public class Introduce {

	public static void main(String[] args) {
	// System.out.print()만 사용
		System.out.print("안녕하세요~\n");
		System.out.print("저는\"김철수\"입니다.\n");
		System.out.print("나이는 20살이고, mbti는 istp입니다.\n");
		
	// System.out.println()만 사용
		System.out.println("안녕하세요~");
		System.out.println("저는 \"김철수\"입니다.");
		System.out.println("나이는 20살이고, mbti는 istp입니다.");
		
	// System.out.printf()만 사용 (김철수, 20, istp)
		System.out.printf("안녕하세요~\n저는 %s입니다.\n나이는 %d 이고, mbti는 %s입니다.","김철수",20,"istp");
		
	}
}
