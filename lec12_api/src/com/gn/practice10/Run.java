package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
//		일주일 뒤 날짜 
//		Calendar today = Calendar.getInstance();
//		today.add(Calendar.DATE, 7);
//		Date date = today.getTime();
//		SimpleDateFormat sdf = 
//	    new SimpleDateFormat("MM월 dd일 E요일");
//		System.out.println(sdf.format(date));
		
		Calendar today = Calendar.getInstance();
		today.add(Calendar.MONTH, 1);
		Date date = today.getTime();
		SimpleDateFormat sdf = 
	    new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		
		
		

	}

}
