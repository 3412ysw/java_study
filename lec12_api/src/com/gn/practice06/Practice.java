package com.gn.practice06;

public class Practice {
	
	
	public String practice() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
//		sb.delete(10, 11+1);
		int idx1 = sb.indexOf(" ");
		int idx2 = sb.lastIndexOf(" ");
		sb.delete(idx1,idx2);
		sb.reverse();
	
		
		return sb.toString();
	}
	
	
	
}
