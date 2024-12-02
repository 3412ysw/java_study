package com.gn.practice;

public class Practice03 {

	public static void main(String[] args) {
		int [] attend = {1,1,1,1,1,0,1,0,0,1};
		int total = 0;
		for(int i = 0; i <attend.length;i++) {
				total += attend[i];
			}
			System.out.println("출석한 학생 수 : "+ total);
			System.out.println("결석한 학생 수 : "+(attend.length-total));
	}

	

}
