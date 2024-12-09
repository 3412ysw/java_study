package com.gn.homework01.model.vo;

public class Food extends Product{

	private int expirationDay;
	
	public Food () {}
	
	public Food (String name, int price, int expirationDay) {
		super(name, price);
		this.expirationDay = expirationDay;
	}
	
	public int getExpirationDays() {
		return expirationDay;
	}
	
	public int calculateDiscountRate() {
		if(getExpirationDays()<=1) {
			return 80;
		}else if(getExpirationDays()<=5) {
			return 50;
		}else if(getExpirationDays()<=10) {
			return 20;
		}else {
			return 0;
		}
	}
	
	@Override
	public int calculatePrice() {
		 int su = calculateDiscountRate();
		 return super.getPrice()*(100-su)/100;
		 
	}
	
}
