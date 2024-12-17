package com.gn.homework10.controller;

public class BuilderController {

	public BuilderController() {}
	
	public String afterReplace(String str) {
		StringBuilder sb = new StringBuilder(str);
		while(sb.indexOf(" ")!= -1) {
		int idx = sb.indexOf(" ");
		sb.deleteCharAt(idx);
		}
		return sb.toString();
	}
	
	
	public String firstCap(String input) {
		String first = input.substring(0,1).toUpperCase();
		String last = input.substring(1);
		input = first+last;
		
		return input ;
	}
	
	public int findChar(String input, char one) {
		for(int i = 1 ; ;i++) {
			
		}
		
	}
	
	
}
