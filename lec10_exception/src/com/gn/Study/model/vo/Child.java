package com.gn.Study.model.vo;

public class Child extends Parent{
	@Override
	public void method() 
		//throws IllegalArgumentException
		//throws Exception
		throws NullPointerException{
		System.out.println("Child");
	}
}
