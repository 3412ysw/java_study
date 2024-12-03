package com.gn.homework01.controller;

import com.gn.homework01.model.vo.*;

public class Run {

	public static void main(String[] args) {
	
		 Employee E1 = new Employee();
		 E1.name = "김철수";
		 E1.team = "교육운영팀";
		 System.out.println(E1.name);
		 System.out.println(E1.team);
		 
		 Employee E2 = new Employee();
		 E2.name = "이영희";
		 E2.team = "경영지원팀";
		 System.out.println(E2.name);
		 System.out.println(E2.team);
		 
	}
	
	
}
