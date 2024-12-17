package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		Calendar open = Calendar.getInstance();
		open.set(2025, 1-1, 24);
		Calendar today = Calendar.getInstance();
		Date date = today.getTime();
		SimpleDateFormat sdf = 
		     new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : "+ sdf.format(date));
		long diff =open.getTimeInMillis()-today.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
		System.out.println("카페 오픈일까지 남은 날 : " + diff +"일");
		
		int mon = open.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+mon);
		
		int day = open.get(Calendar.DAY_OF_WEEK);
		String dday ="";
		switch(day){
			case 6 : dday = "금"; break;
		}
		System.out.println("카페 오픈일의 요일 :"+dday);
		
		
		
		
		
		

	}

}
