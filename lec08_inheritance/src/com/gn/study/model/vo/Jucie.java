package com.gn.study.model.vo;

public class Jucie extends Beverage{
	private String fruit;
	
	public Jucie(String name,int volume, String fruit) {
		super (name,volume);
		this.fruit = fruit;
	}
	
	public void juiceInfo() {
		super.printInfo();
		System.out.println("- 과일 : " + fruit );
	}
	

}
