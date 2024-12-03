package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("길동이 : ");
		int score3 = sc.nextInt();
		int[] score1 = {54,23};
		int[] score2 = new int[score1.length+1];
		for(int i = 0 ; i < score1.length ; i ++) {
			score2[i] =  score1[i];
		}
		int total = 0;
		 
        score2[score2.length-1] = score3;
        for(int scores : score2) {
        	System.out.println(scores); 
        	total += scores;
        }
        System.out.println("총합 : " + total);
    	System.out.println("펑균 : " + (total/score2.length-1));
	}

}
