package com.gn.practice07.model.vo;

import java.util.Objects;

public class Equipment {

	private String name;
	private int pricePerDay;
	
	public Equipment() {}
	
	public Equipment(String name,int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Equipment) {
			Equipment e = (Equipment)obj;
			if(e.name.equals(name)&&e.pricePerDay==pricePerDay) {
				result = true;
			}
		}
		return result;
	}
	
	
	public String toString() {
		return "-"+ name + ": " + pricePerDay + "원";
	}
	
}
