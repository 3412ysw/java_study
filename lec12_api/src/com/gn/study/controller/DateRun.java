package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		//Calendar
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		
		int year = cal1.get(Calendar.YEAR);
		int mon = cal1.get(Calendar.MONTH)+1;
		System.out.println(year + "년" + mon + "월");
		
		
		//날짜 예쁘게 출력하깅
		Calendar cal2 = Calendar.getInstance();
		int year2 = cal2.get(Calendar.YEAR);
		int mon2 = cal2.get(Calendar.MONTH)+1;
		int date2 = cal2.get(Calendar.DATE);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		String str2 = "";
		switch(day2) {
			case 1 : str2 = "일"; break;
			case 2 : str2 = "월"; break;
			case 3 : str2 = "화"; break;
		}
		System.out.println(year2 + "년 " + mon2 + "월 " + date2 + "일 " + str2);
		
		// 날짜 변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE, 25);
		christmas.set(2024,12-1, 25);
		System.out.println(christmas);
		
		// 날짜 변경(2) : add
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, -7);
		System.out.println(cal3);
		
		// 문자열을 날짜 정보로 변환하기
		String toDay = "2024-05-14";
		String[] temp = toDay.split("-");
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(Integer.parseInt(temp[0]),
				Integer.parseInt(temp[1]),
				Integer.parseInt(temp[2]));
		cal4.add(Calendar.MONTH, -1);
		
		System.out.println(cal4);
		
		// 두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024, 10-1, 16);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()-cal5.getTimeInMillis();
		// 1초 == 1000ms
		diff = diff/1000;
		//24시간 *60분*60초
		diff = diff/(24*60*60);
		System.out.println(diff);
		
		//최댓값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : "+ last);
		
		// Date 써보기
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH:mm:ss");
		String printDate = sdf.format(d);
		System.out.println(printDate);
		//System.out.println(sdf.format(d));
		
		//Calendar와 함께 사용 getTime()
		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1); -> 내년으로 바꾼거임
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a kk:mm");
		// 오늘 날짜 예쁘게 출력하기 (2)
		sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 a kk:mm");
		System.out.println(sdf2.format(date));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
