package com.gn.study.constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
//	public Car(String b, String c, int y) {
//		brand = b;
//		color = c;
//		year = y; 직관적 ㄴㄴ 
//	}
	
	// 기본 생성자랑 매개변수 둘 다 사용하려면 
	// 꼭 기본 생성자 선언 public Car() {}
	public Car() {
		this("미정","미정",2024);
	}
	
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}	
	
}
