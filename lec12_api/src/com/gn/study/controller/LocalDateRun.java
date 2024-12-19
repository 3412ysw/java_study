package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateRun {

	public static void main(String[] args) {
		
		// 1. LocalDate 
		System.out.println("=======LocalDate=======");
		//(1) 현재 날짜 구하기
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		//(2) 특정 날짜 설정
		LocalDate date2 = LocalDate.of(2024, 12, 25);
		System.out.println(date2);
		//(3) 필드 조회
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfWeek());
		//1: 월~7:일
		System.out.println(date1.getDayOfWeek().getValue());
		//(4) 필드증가
		LocalDate date3 = date1.plusWeeks(3);
		System.out.println(date3);
		//(5) 필드 감소
		LocalDate date4 = date1.minusDays(3);
		System.out.println(date4);
		
		
		// 2. LocalTime
		System.out.println("=======LocalTime=======");
		// (1) 현재 시간
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		//(2) 특정 시간 지정
		LocalTime time2 = LocalTime.of(12,50,5);
		System.out.println(time2);
		//(3) 필드 조회
		System.out.println(time1.getMinute());
		// (4) 필드 증가
		LocalTime time3 = time1.plusHours(7);
		System.out.println(time3);
		// (5) 필드 감소
		LocalTime time4 = time1.minusMinutes(20);
		System.out.println(time4);
		
		
		// 3. LocalDateTime
		System.out.println("=======LocalDateTime=======");
		// (1) 현재 날짜와 시간
		LocalDateTime dateTime1 =LocalDateTime.now();
		System.out.println(dateTime1);
		// (2) 특정 날짜와 시간
		LocalDateTime dateTime2 = LocalDateTime.of(2025,1,1,6,30,45);
		System.out.println(dateTime2);
		
		// 4.DateTimeFormatter
		System.out.println("========DateTimeFormatter=========");
		//(1) 날짜와 시간 -> 문자열
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf1 = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String result1 = now1.format(dtf1);
		System.out.println(result1);
		//(2) 문자열 -> 날짜와 시간
		String str2 = "2024-12-24 13:50:26";
		DateTimeFormatter dtf2 = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime3 = LocalDateTime.parse(str2,dtf2);
		System.out.println(dateTime3);
		
		
		// 5. ChronoUnit -> 날짜 또는 시간 차이 계산
		System.out.println("=========ChronoUnit========");
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate endDate = LocalDate.of(2024, 12, 31);
		
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(daysBetween);
		
		
		
		
		
		
		
	}

}