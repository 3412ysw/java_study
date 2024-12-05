package com.gn.homework06.model.vo;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
		
	}
	
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return (width*2)+(height*2);
	}
	
	public int calculateArea() {
		return width*height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형의 정보 ====");
		System.out.println("1. 사각형의 둘레\n"++"cm");
		System.out.println("2. 사각형의 넓이\n"++"cm");
		
	}
	

}
