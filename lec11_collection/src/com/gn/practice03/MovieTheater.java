package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {

	public static void main(String[] args) {
		
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B2");
		seats.add("B1");
		System.out.println("초기 좌석 목록: "+ seats);
		
		seats.add(2,"A3");
		System.out.println("좌석 추가 후: "+seats);
		
		// 예약좌석 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 :");
		String seat1 = sc.nextLine();
		
		//예약 좌석 인덱스 번호 찾기
	    int su = seats.indexOf(seat1);
		
		if(su== -1) {
			System.out.println(seat1+"은(는) 존재하지 않는 좌석입니다.");
		}else {
			//예약 변경
			seats.set(su,seat1+"(예약)");
			}
		System.out.println("좌석 예약 후 : "+seats);
		
		//삭제 좌석 받기
		System.out.print("삭제 좌석 : ");
		String seat2 = sc.nextLine();
		
		//삭제 좌석 인덱스 번호 찾기
		int su2 = seats.indexOf(seat2);
		
		if(seats.contains(seat2)) {
			//좌석 삭제
			seats.remove(su2);
		}else {
			System.out.println(seat2+ "좌석은 목록에 없습니다.");
		}
		System.out.println("좌석 삭제 후 : "+seats);
		
		//좌석 오름차순 정렬
		Collections.sort(seats);
		System.out.println("좌석 정렬 후"+seats);
		
		
		
	}

}
