package com.gn.practice01;

public class Run {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();

		int [] arr = new int[1000000];
		for(int i = 0 ; i <arr.length;i++) {
		arr[i] = (int)(Math.random()*100)+1;
		}
		int [] array = new int[arr.length/2];
		System.arraycopy(arr, 0, array, 0, array.length);
		
		for(int i = 0 ; i <array.length;i++) {
			if(i%10==9) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i]+",");
			}
		}
		
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간 : " + (after-before)/100+"ms");
		
	}

}
