package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String result = start.format(dtf);
		System.out.println("기준 : "+result);
		
		
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String answer = sc.nextLine();
		if(answer.equals("Y")||answer.equals("y")) {
			LocalTime end = LocalTime.now();
			long daysBetween = ChronoUnit.MILLIS.between(end,start);
			System.out.println("경과(초)  : "+ (-daysBetween/1000));
		}else if(answer.equals("N")||answer.equals("n")) {
			System.out.println("종료합니다.");
			break;
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
		
		
		}

	}

}
