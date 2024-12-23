package com.gn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
	
		  Scanner scan = new Scanner(System.in);
		    int num1 = scan.nextInt();
		    int num2 = scan.nextInt();
		    for(int i = 0 ;; i++){
		       if((i*4)+((num1-i)*2)==num2){
		           System.out.println(i+" "+(num1-i));
		           break;
		       }else {
		    	   System.out.println("계산불가");
		    	   break;
		       }
		    }
		   
		        
		
	}
	
}
