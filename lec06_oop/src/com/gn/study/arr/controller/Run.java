package com.gn.study.arr.controller;

import com.gn.study.arr.model.vo.Academy;

public class Run {

	public static void main(String[] args) {
		// 1.객체 배열 선언 
		Academy[] arr1;
		
		// 2.객체 배열의 생성
		//(1) 선언 후 생성
		arr1 = new Academy[2];
		//(2) 선언과 동시 생성
		Academy[] arr2 = new Academy[4];
		
		// 3. 객체 배열의 초기화 
		// (1) 인덱스
		Academy a1 = new Academy("가남학원","01011111111");
		arr1[0] = a1; 
		arr1[1] = new Academy("나남학원","01022222222");
		//(2) 선언과 동시에 초기화
		int[] intArr = {1,2,3,4};
		Academy[] arr3 = {new Academy ("다담","01033333333"),
				new Academy ("ㄹ람","0104")};
		
		// 4. 출력
		System.out.println(arr1); //배열
		System.out.println(arr1[1]); // 객체
		System.out.println(arr1[1].getName());
	
		// for문
	    for(int i = 0; i < arr3.length; i++) {
	    	System.out.println(arr3[i].getName());
	    }
	    
	    for(Academy ac:arr3) {
	    	System.out.println(ac.getPhone());
	    }
		
		
		
		
		
		
		
	}
		
		
		
	

}
