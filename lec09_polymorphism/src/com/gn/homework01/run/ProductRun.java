package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		
		Food f = new Food("치킨",20000,3);
		Book b = new Book("자바의 정석",15000);
	
		System.out.println(f.getName()+"의 최종 가격 : " + (f.getPrice()- f.calculatePrice()));
		System.out.println(b.getName()+"의 최종 가격 : " + b.calculatePrice());
	}

}
