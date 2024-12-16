package com.gn.practice03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner (System.in);
		System.out.print("문자열을 입력하세요. : ");
		String word = sc.nextLine();
//		int i = sentence.indexOf(word);
//		if(i>=0) {
//			System.out.println(word);
//		}else {
//			System.out.println("존재하지 않는 단어입니다.");
//		}
		
		String result = "";
		String[] arr = sentence.split(" ");
		for(int i = 0; i <arr.length ;i++) {
			if(word.equals(arr[i])) {
				if(i == arr.length-1) {
					result = "null";
					break;
				}else {
					result = arr[i+1];
					break;
				}
			}else {
				result = "false";
			}	
		}
		if(result == "null") {
			System.out.println("마지막 단어입니다.");
		}else if(result.equals("false")) {
			System.out.println("존재하지 않는 단어입니다.");
		}else {
			System.out.println(word+ "다음 단어 : " +result);
		}
		
		
		
		
	}

}
