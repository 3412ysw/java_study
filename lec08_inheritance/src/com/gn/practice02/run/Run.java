package com.gn.practice02.run;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {

	public static void main(String[] args) {
	
		Appliance a = new Appliance();
		a.turnOn();
		
		WashingMachine w = new WashingMachine();
		w.turnOn();
		
		Refrigerator r = new Refrigerator();
		r.turnOn();
	
	}

}
