package com.gn.homeork.loop;

import java.util.Scanner;

public class Practice {
	
	public void Practice01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int nums = sc.nextInt();
		int total = 0;
		while(true){
			if(1<=nums&&nums<=50) {
				for(int i = 1; i <= nums; i++) {
					if(i%2 ==1) {
						continue;
					}
					total += i;
				}
				System.out.println("합계 : " + total);
				break;
			}else {
				System.out.println("1~50 사이의 정수를 입력하세요. ");
				System.out.print("정수 : ");
				nums = sc.nextInt();
			}
			
		}
		
	}
	
	public void Practice02(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int su = sc.nextInt();
		
		while(true) {
			//System.out.print("숫자 : ");
			//int su = sc.nextInt();
		if(su < 0) {
			System.out.println("양수만 입력해주세요.");
			System.out.print("숫자 : ");
			su = sc.nextInt();
		}else if (su > 9) {
			System.out.println("9이하의 숫자를 입력해주세요.");
			System.out.print("숫자 : ");
			su = sc.nextInt();
		} else if(su==0){
			break;
		} else {
			for(int i = su; i < 10; i++) {
				System.out.println("=== "+ su +"단 ===");
				for(int j = 1; j < 10; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}System.out.print("숫자 : ");
			 su = sc.nextInt();
			
		}
		
	    }sc.close();
	}


	public void Practice03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.nextLine();
		String anser = "탈출";
		
		while(true) {
		for(int i=0;;i++) {
			if(text.equals(anser)) {
			break;
			}else {
				System.out.println(text);
				System.out.print("입력 : ");
				text = sc.nextLine();
			}
		}
		}
	}
	
	public void practice04(){
		Scanner sc = new Scanner(System.in);
		String text;
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			text = sc.nextLine();
		}while(text.equals("yes")) ;{
			System.out.println("게임을 종료합니다.");
		}
		
	
	}
	
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int nums;
		int total = 0;
		while(true){
			System.out.print("숫자(0을 입력하면 종료) : ");
			nums = sc.nextInt();
			if(nums < 0) {
				continue;
			}else if (nums >0) {
				total += nums;
			}else if (nums==0) {
				System.out.println("양수의 합계 : " + total);
				break;
			}
		}
	}
	
	
	
	public void practice06() {
		for(int i= 4; i == 0 ;i--) {
			System.out.print("*");}
//			for(int j = 1; j < 10; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
	}
	
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while(true) {
			if(num>0) {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;
			}else {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			}
		}
	}
	

    public void practice08() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("문자열 : ");
    	String line = sc.nextLine(); // application
    	System.out.print("문자 : ");
    	char ch = sc.nextLine().charAt(0); // a
    	int count = 0;
    	for(int i =0 ; i < line.length(); i++) {
    		if(line.charAt(i)== ch) {
    			count++;
    		}
    	}
    	System.out.println("포함된 개수 : "+ count);
    	System.out.print("다시 입력하시겠습니까? : ");
    	String answer = sc.nextLine();
    	while(true) {
    		if(answer.equals("Y")||answer.equals("y")) {
    			System.out.print("문자열 : ");
    			line = sc.nextLine();
    			System.out.print("문자 : ");
    			ch = sc.nextLine().charAt(0);
    			// "a".charAt(0)
    			count = 0;
    			for(int i =0 ; i < line.length(); i++) {
    	    		if(line.charAt(i)== ch) {
    	    			count++;
    	    		}
    	    	}
    			System.out.println("포함된 개수 : "+ count);
    			System.out.print("다시 입력하시겠습니까? : ");
    	    	answer = sc.nextLine();
    		} else if(answer.equals("N")||answer.equals("n")) {
    			sc.close();
    			break;
    		} else {
    			System.out.println("잘못된 대답입니다. 다시 입력해주세요");
    			System.out.print("다시 입력하시겠습니까? : ");
    	    	answer = sc.nextLine();
    		}
    	}
 
    	
    	
    
    	
    	
    	
    	
    	
    	
    	
    }
}


