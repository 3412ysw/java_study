package com.gn.practice05.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 기본 생성자
	public Book() {
		
	}
	// 매개변수 3개인 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	// 매개변수 5개인 생성자
	public Book(String title,String author,String publisher, int price, double discountRate ) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		}
	
	public void information() {
		System.out.println("=== " + title + " ===");
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price + "원");
		System.out.println("할인률 : " + discountRate);
	}
	
}


