package com.gn.practice05;

public class Run {

	public static void main(String[] args) {
		String[] words =
		{"java", "application", "programming", "interface"};
		
		String word = String.join(" ", words);
		System.out.println("문장 : " + word);
		
		String a = word.substring(5,6).toUpperCase();
		String b = word.substring(17,18).toUpperCase();
		String c = word.substring(29,30).toUpperCase();
		
		System.out.println("변환 : " + a+b+c);

	}

}
