package com.gn.homework02;

import java.io.File;



public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		File file = new File("C:\\test\\sub\\나비야1.dat");
		
		long before1 = System.nanoTime();
		p.method1(file);
		long after1= System.nanoTime();
		double result1 = after1 - before1;
		System.out.println((result1/100000.0)+ "밀리초 걸림");
		
	
		long before2 = System.nanoTime();
		p.method2(file);
		long after2= System.nanoTime();
		double result2 = after2 - before2;
		System.out.println((result2/100000.0)+ "밀리초 걸림");
		
		
		
		
		
		

	}

}
