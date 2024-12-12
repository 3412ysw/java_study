package com.gn.homework02;

import java.util.Objects;

import com.gn.practice08.model.vo.Person;

public class Lottery {

	private String name;
	private String phone;
	
	public Lottery() {}
	
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	@Override
//	public String toStirng() {
//		return name;
//		}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Lottery) {
			Lottery l = (Lottery)obj;
			if(l.name.equals(name)&&l.phone.equals(name)) {
				result = true;
			}
		}
		return result;
	}
	
//	public int compareTo(Lottery l) {
//		return this.compareTo();
//	}
	
	
	
}
