package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
//import com.gn.homework03.model.vo.Engine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {

	public static void main(String[] args) {
		Car c1 = new Car(new GasolineEngine());
		Car c2 = new Car(new ElectricEngine());
		
		c1.startEngine();
		c2.startEngine();
		
//		Engine g = new GasolineEngine();
//		Car c = new Car(g); 
//		Engine g = new ElectricEngine();
//		Car c = new Car(g);
		
	}

}
