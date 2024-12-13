package com.gn.study.model.vo;

import java.util.Objects;

public class Snack {

	private String flavor;
	private int Calory;
	
	public Snack() {}
	
	public Snack(String flavor,int Calory) {
		this.flavor = flavor;
		this.Calory = Calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return Calory;
	}

	public void setCalory(int calory) {
		Calory = calory;
	}

	@Override
	public String toString() {
		return " [맛 =" + flavor + ", 칼로리 =" + Calory + "]";
	}
		
	
	@Override
	public int hashCode() {
		return Objects.hash(flavor,Calory);
	}
	
	@Override
	
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Snack) {
			Snack other = (Snack)obj;
			if(other.flavor.equals(this.flavor)&&other.Calory==this.Calory) {
				return true ;
			}
		}
		return false;
	}
}
