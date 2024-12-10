package com.gn.Study.model.vo;

public class User {

	public void checkAge(int age) {
		if(age < 15) {
			throw new IllegalArgumentException(" 15세 이상이여야합니다.");
		}
		System.out.println("나이가 확인되었습니다.");
	}
	
	
	public void nameLenght(String name) throws NullPointerException{
		System.out.println(name.length() +"개");
		
		int a = 2;
		int b = 5;
		if(a>b) {
			int min = b;
		} else {
			int min = a;
		}
	}
	
	
	
	
	
	
	
	
}
