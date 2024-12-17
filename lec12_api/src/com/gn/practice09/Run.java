package com.gn.practice09;

import java.util.Calendar;

public class Run {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1-1, 1);
		Calendar today = Calendar.getInstance();
	
		long diff = today.getTimeInMillis()-cal.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
		System.out.println(diff+ "일");
		
		
	}

}
