package com.gn.homework02;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
//		- Run에서 Practice 메소드를 실행
//	    - 아래 4개의 문자열을 요소로 가지고 있는 ArrayList 구성
//	    - 반복문을 통해 ArrayList 요소를 매개변수로 takeState 메소드 호출
		Practice p = new Practice();
		
		List<String> arr = new ArrayList<String>();
		arr.add("서울특별시 금천구 구로디지털2로 95");
		arr.add("서울특별시 서대문구 연희로 248");
		arr.add("울산광역시 남구 돋질로 233");
		arr.add("경상북도 구미시 송정대로 55");
		
		for (int i=0; i<4 ;i++) {
			p.takeState(arr.get(i));
		}
		
	}

}
