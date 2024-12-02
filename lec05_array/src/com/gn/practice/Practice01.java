package com.gn.practice;

public class Practice01 {

	public static void main(String[] args) {
		String[] friends = {"박지영","김태우","이지훈","최유진","정승호"};
		for(int i = 0; i < friends.length; i++) {
			if((i+1)%2==0) {
				continue;
			}
			System.out.println((i+1)+":"+friends[i]);
		}
		
		
		String[] friends1 = new String[5];
		friends1[0] = "박지영" ;
		friends1[1] = "김태우" ;
		friends1[2] = "이지훈" ;
		friends1[3] = "최유진" ;
		friends1[4] = "정승호" ;
		
		

	}

}
