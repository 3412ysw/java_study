package com.gn.study;

public class Loopstmt {

	public static void main(String[] args) {
		//1. for문
		// 1 ~ 10까지 숫자 모두 출력
				// 초기식 -> 출발점(1)
				// 조건식 -> 도착점 (10)
				// 증감식 -> step(몇걸음씩)
				//for (초기식; 조건식; 증감식){}
				
		for(int i = 1 ; i <= 10 ; i++) {
					//System.out.println(i);
			   }
			   
		// 2. 초기식 생략
		int a = 1;
		for(; a <= 5; a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		
		for(int i = 1;; i++) {
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}
		
		
		int sum = 0;
		sum += 1;
		sum += 2;
		
		// 4. 중첩 for문 
		// i는 1~2까지 하나씩 커지면서 반복
		// z는 1~3까지 하나씩 커지면서 반복
		for(int i = 1 ; i <=2 ; i++) {
			System.out.println("A");
			for(int j = 1 ; j <=3 ; j++) {
				System.out.println("B");
			}
			System.out.println("C");
		}
		
		
		// 5. 중첩 for문 활용
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.print("*"); 
			}
			System.out.print("\n");
		}
		
		// 6. break를 사용한 중첩 for문
		// 외부: 0에서부터 2 미만 1씩 커지면서 반복
		// 내부; 0에서부터 3 미만 1씩 커지면서 반복
		//1.내부에 걸면 내부 for문 1회만 반복
		//2.외부에 걸면 외부 for문 1회만 반복 (내부는 그대로)
		
		for(int i = 0 ; i < 2 ; i++) {
			System.out.print("1");
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print("2");
				//1.break;
			}
			System.out.print("3\n");
			//2.break;
		}
			
			//7. while 문
			int start = 1;
			/*while(start <= 10) {
				System.out.println(start);
				start++;
				}*/
			while(true) {
				System.out.println(start);
				start++;
				if(start>10) {
					break;
				}
			}
			
			
			
			
		
		
		
		
		
		
	
		
		
	}

}
