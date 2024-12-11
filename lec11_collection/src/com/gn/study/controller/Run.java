package com.gn.study.controller;

import com.gn.study.model.vo.Container;

public class Run {

	public static void main(String[] args) {
		
		//Boxing
		Integer iNum = 100;
		// UnBoxing
		int num = iNum;
		// parse 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+ num2);
		
		str2 = "1.34";
		System.out.println(str2 + str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3 +num3);
		
		//NumberFormatException
		try {
		String[]arr = new String[3];
		arr[0]= "일";
		int arrnum= Integer.parseInt(arr[0]);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열 ");
	
		//ClassCastException
		try {
		Object o = 9;
		String ostr = (String)o;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");
		
		//제네릭
		Container<Integer> con = new Container<Integer> ();
		con.setItem(50);
		
		Container<String> tain = new Container<String> ();
		tain.setItem("안녕하세요.");
		
		
		
		
		
	}

}
