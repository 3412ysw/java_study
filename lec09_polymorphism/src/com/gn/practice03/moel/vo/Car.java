package com.gn.practice03.moel.vo;

public class Car extends Vehicle{

	@Override
	public void go() {
		System.out.print("모터힘으로");
		super.go();
	}
	
}
