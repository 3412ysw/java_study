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
		int total = 0 ;
		int[] arr = new int [num];
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값:");
			int nums = sc.nextInt();
			arr[i] = nums;
			}
		for(int numsu:arr) {
			System.out.print(numsu);
			total += numsu;
		}
		System.out.print("\n");
		System.out.print("총합 : "+ total);
	sc.close();	
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int enter1 = sc.nextInt();
		while(true) {
			if(enter1%2==0 || enter1 < 3) {
				System.out.println("다시 입력하세요.");
				System.out.print("정수 : ");
				enter1 = sc.nextInt();
			} else {
				int[] arr = new int[enter1];
				int num = 0;
		    	for(int i=0; i<enter1; i++) {
		    		if(i>enter1/2) {
		    			num--;
		    		} else {
		    			num++;
		    		}
		    		arr[i] = num;
		    	}
		    	for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]);
					if(i==arr.length-1) {
						continue;
					}
					System.out.print(", ");
				}
		    	break;
			}
		}
	}	
		
		

	
	public void practice04() {
		
		
//		for(int i = 0 ; ; i++) {
//		int rnd1 = (int)(Math.random()*45)+1;
//		   if(rnd1==rnd2) {
//			   continue;
//		    }
//		   int[] arr = {rnd1,rnd2,rnd2,rnd2,rnd2,rnd2};
//		   //System.out.print();
//		}
		
		}
		
		
		
	
	
	
	
	
	
	
	
	
	public void practice05() {
	
	}
	
	
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int number1 = sc.nextInt();
		sc.nextLine();
		String[]arr = new String[number1];
		for(int i=0;i<number1;i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			String text = sc.nextLine();
			arr[i] = text;
		}
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String word = sc.nextLine();
			if(word.equals("Y")||word.equals("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int number2 = sc.nextInt();
				sc.nextLine();
				String[]arr2 = new String[number1+number2];
				for(int i=0;i<number1;i++) {
					arr2[i]=arr[1];
				}for(int i = 0; i<number2; i++) {
					System.out.print((number1+i+1)+"번째 문자열 : ");
					arr2[number1+i]= sc.nextLine();
				}
				
				
				
			}else if(word.equals("N")||word.equals("n")) {
				break;
			}else {
				System.out.println("입력할 수 없는 값입니다.");
			}
			//System.out.println(arr2[number1+i]);
			
		}
	
	}
	
	
	
	public void practice07() {
	
	}
	public void practice08() {
		
	}
	
	
	
}
