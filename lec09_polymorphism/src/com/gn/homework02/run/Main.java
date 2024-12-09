package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Main {

	public static void main(String[] args) {
		Menu[] menu = new Menu [5];
		menu[0] = new Dish("토마토 파스타",15000,"잘");
		menu[1] = new Drink("밀크쉐이크",8000,"잘");
		menu[2] = new Dish("오일 파스타",15000,"잘");
		menu[3] = new Drink("메론소다",8000,"잘");
		menu[4] = new Dish("토마토 파스타",15000,"잘");

		for(Menu m:menu) {
			m.cook();
		}
	}

}
