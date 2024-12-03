package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	
	public void practice01(){
		int[] height = {152,180,165,158,171};
		for(int i = 0; i < height.length-1 ; i++) {
			for(int j = i+1; j < height.length; j++) {
				if (height[i] >height[j]) {
					int su = height[i];
					height[i] = height[j];
					height[j] = su;
				}
			}
		}
		int count = 0;
		for(int h : height) {
			System.out.print(h);
			count++;
			if(count == height.length) {
				continue;
			}
			System.out.print(",");
		}	
	}
    
	public void practice02(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		for(int i = 0; i <= num; i++) {
			System.out.println("배열"+i+"번째 인덱스에 넣을 값 : ");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
