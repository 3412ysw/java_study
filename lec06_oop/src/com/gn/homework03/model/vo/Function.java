package com.gn.homework03.model.vo;

public class Function {

//		- 메소드(1)
//	    - 문자열 두 개를 전달 받음
//	    - 두 문자열을 합치고 리턴
	public String result1(String num1,String num2) {
		return num1+num2;
	}
	
//	- 메소드(2)
//    - 정수 두 개를 전달 받음
//    - 두개의 정수의 곱을 리턴
//    - 단, 첫번째 수가 두번째 수보다 작은 경우
//        - “계산할 수 없습니다.” 출력
//        - 0을 반환
	
	public int result2(int num3,int num4) {
		if(num3<num4) {
			System.out.println("계산할 수 없습니다.");
			return 0 ;
		}else {
			return num3*num4;
		}
	}
	
//	- 메소드(3)
//    - 문자열 두개를 전달 받음
//    - 두개의 값이 같은지 확인
//    - 같으면 true, 다르면 false 리턴
	
	
	public String result3(String num5,String num6) {
		if(num5.equals(num6)) {
			return "true";
		}else {
			return "false";
		}
	
}
	
	
	
}
