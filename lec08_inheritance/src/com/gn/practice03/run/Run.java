package com.gn.practice03.run;
import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Point;
import com.gn.practice03.model.vo.Ractangle;

public class Run {

	public static void main(String[] args) {
		Point p = new Point();
		Circle c = new Circle();
		Ractangle r = new Ractangle();
		
		Circle[] arr1 = new Circle[2];
		arr1[0] = new Circle (1,2,3);
		arr1[1] = new Circle (3,3,4);
		
			
		Ractangle[] arr2 = new Ractangle[2];
		arr2[0] = new Ractangle (-1,-2,5,2);
		arr2[1] = new Ractangle (-2,5,2,8);
		
		System.out.println("=== circle === ");
		for(Circle su : arr1) {
			su.draw();
		}
		
		System.out.println("=== rectangle ===");
		for(Ractangle su : arr2) {
			su.draw();
		}
		
		
		//su를 circle이라고 생각

	}

}
