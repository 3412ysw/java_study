package com.gn.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		for(int i = 0; i <arr.length ;i++) {
			System.out.print("문자열("+ (i+1) + ")"+":");
			arr[i] = sc.nextLine();
		}
		
		String max = arr[0];
		
		for(int i = 1 ; i <arr.length; i++) {
			if(max.length()< arr[i].length()) {
				max = arr[i];
			}else if(max.length() == arr[i].length()) {
				if(max.compareTo(arr[i])>0) {
					max = arr[i];
				}
			}
		}
		System.out.println(max.concat(max));
		

		
		
	}

}
