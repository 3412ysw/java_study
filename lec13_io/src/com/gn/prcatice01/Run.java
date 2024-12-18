package com.gn.prcatice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		DateTimeFormatter dtf = 
//				DateTimeFormatter.ofPattern("yyyy\\MM\\dd");
//		String result = today.format(dtf);
//		
//		File dir = new File("C:\\test\\sub\\"+result);
//		
//		
//		if(!dir.exists()) {
//			if(dir.mkdirs()) {
//				System.out.println("디렉토리 생성 성공");
//			}else {
//				System.out.println("디렉토리 생성 실패");
//			}
//		}else {
//			System.out.println("이미 존재하는 디렉토리");
//		}
//		
		File dir = new File("C:\\test\\sub\\");

		Practice p = new Practice();
		p.deleteFile(dir);
	}

}
