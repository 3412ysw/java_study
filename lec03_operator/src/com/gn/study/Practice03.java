package com.gn.study;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("숫자(1) : ");
        int num1 = sc.nextInt();
        System.out.print("숫자(2) : ");
        int num2 = sc.nextInt();
        boolean isFirstGTSecond = num1>num2;
        System.out.print("첫번째 숫자가 두번째 숫자보다 큰가요?" + isFirstGTSecond );
        //System.out.print("첫번째 숫자가 두번째 숫자보다 큰가요?" + (boolean)(num1 >num2) );
	
	}

}
