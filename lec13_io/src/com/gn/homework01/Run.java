package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice p = new Practice();
		long before1 = System.nanoTime();
		p.method1(song);
		long after1= System.nanoTime();
		double result1 = after1 - before1;
		System.out.println((result1/100000.0)+ "밀리초 걸림");
		
	
		long before2 = System.nanoTime();
		p.method2(song);
		long after2= System.nanoTime();
		double result2 = after2 - before2;
		System.out.println((result2/100000.0)+ "밀리초 걸림");
		
		
		
		
		
	}

}
