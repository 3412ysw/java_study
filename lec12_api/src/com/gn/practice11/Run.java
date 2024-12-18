package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf1 =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : "+ today.format(dtf1));
		
		LocalDate dday = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf2 =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String result2 = dday.format(dtf2);
		
		System.out.println("영화 개봉까지 남은 날 :" 
		       + ChronoUnit.DAYS.between(today,dday)+"일");
		
		// DateTimeFormatter E요일 써도 ㄱㅊ을듯 
		int num = dday.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(num));
	    System.out.println("개봉일 : "+result2);
	}
	
	
	public static String getKoreanDayOfWeek(int day) {
		String str = "";
		if(day==3) {
			str = "수요일";
		}
		
		return str; 
		
		
	}

}
