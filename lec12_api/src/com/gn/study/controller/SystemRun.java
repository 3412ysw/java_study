package com.gn.study.controller;

public class SystemRun {

	public static void main(String[] args) {
		long before =System.currentTimeMillis();
		//1.arraycopy()
		int[] src = {10,15,25,30};
		int[] dst = new int[src.length];
//		기본 배열 복사
//		for(int i = 0 ; i < src.length;i++) {
//			dst[i] = src [i];
//		}
		//원본배열, 원본 시작 위치,대상 배열, 대상시작위치, 복사할 길이
		System.arraycopy(src, 0, dst, 0, src.length);
		
		for(int d:dst) {
			System.out.print(d+"|");
		}
		
		System.out.println("\n==================");
		//2. currentTimeMillis()
		long timestamp =System.currentTimeMillis();
		System.out.println(timestamp);
		
		long after = System.currentTimeMillis();
		System.out.println(after-before+"밀리초 걸림");
		
		
		
		
		
		
	}
	

}
