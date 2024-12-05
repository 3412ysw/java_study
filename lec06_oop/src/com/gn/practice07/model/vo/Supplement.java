package com.gn.practice07.model.vo;

public class Supplement {
	
	private String name;
	private int dosage;
	private int price;
	
	public Supplement() {}
	
	
	public Supplement(String name,int dosage,int price) {
		this.name = name;
		this.dosage = dosage;
		this.price = price;
		}
	
	
	
	public void information() {
		System.out.println("이름 : " + name + ", 복용량 : " + dosage +", 가격 : " + price+ "원");
	}
	
//	public String getName() {
//		return name;
//	}
//	public String getDosage() {
//		return dosage;
//	}
//	public String getPrice() {
//		return price;
//	}
//	
	
	
	

}
