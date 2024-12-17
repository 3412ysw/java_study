package com.gn.homework02;

public class Practice {

	public String takeState(String str) {
//		- Practice 클래스에 메소드 추가
//	    - 기능
		
		
		String[] arr = str.split(" ");
		String word = arr[1];
		if(word.charAt(word.length()-1)=='구') {
			System.out.println(arr[1]);
		}else {
			System.out.println("null");
		}
		
				
//	        1. 매개변수로 전달받은 문자열을 잘라서 문자열 배열로 만들기
//	        2. 문자열 배열에 포함된 단어의 가장 마지막 문자가”구”일때만 해당 단어 출력
//	        3. 그렇지 않으면 null 출력
//	    
		return str;
		
	}
	
	
	
}
