package com.gn.practice06.controller;

import java.util.*;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {

	public static void main(String[] args) {
		Set<Food>list = new HashSet<Food>();
		list.add(new Food("샐러드",14000));
		list.add(new Food("치킨",23000));
		list.add(new Food("치킨",50000));
		
		list.remove(new Food("치킨",50000));
		System.out.println("5만원 치킨 취소 : " +list);
		list.clear();
		System.out.println("전체 주문 취소 : " + list);
		
	}

}
