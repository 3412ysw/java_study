package com.gn.practice03.moel.vo;

public class Bicycle extends Vehicle{

	@Override
	public void go() {
		System.out.print("다리힘으로");
		super.go();
	}
	
}
