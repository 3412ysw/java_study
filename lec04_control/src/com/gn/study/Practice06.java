package com.gn.study;

public class Practice06 {

	public static void main(String[] args) {

	int sum = 0;
	for(int i = 1 ;; i++) {
		sum+=i;
		System.out.println(sum);
		if(sum>100) {
			System.out.println("초과된 합" + sum);
			break;
			
		}
	}
		
		
	}

}
