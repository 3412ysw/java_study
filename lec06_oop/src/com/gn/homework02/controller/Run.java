package com.gn.homework02.controller;

import com.gn.homework02.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Person p1 = new Person();
        p1.number = "01012345678" ;
        p1.height = 190.5;
		p1.weight = 100.2;
		System.out.println(p1.number);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
		
		Person p2 = new Person();
        p2.number = "01012345678" ;
        p2.height = 175.4;
		p2.weight = 65.6;
		System.out.println(p2.number);
		System.out.println(p2.height);
		System.out.println(p2.weight);
		
	}

}
