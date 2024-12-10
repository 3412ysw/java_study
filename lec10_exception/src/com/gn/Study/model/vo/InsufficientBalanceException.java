package com.gn.Study.model.vo;


//1. 클래스 선언
//2.Exception 상속
public class InsufficientBalanceException 
extends Exception{
	//3.매개변수 생성자 
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
