package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		
		// 2. 파일 생성
		File file = new File(dir,"sample1.dat");
		//3. FileOutputStream 생성 (선언부는 밖에 생성은 안에 )
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
		//4. 출력할 데이터 구성(try 안에서 하셈)
			String str = "hello";// sample.dat에다가 넣는것
			byte[] arr = str.getBytes();// hello 잘라서 바이트 단위로 만든ㄴ것
		// 5. 출력
			out.write(arr);
		// 6. 플러싱(선택) 청소냠냠
			out.flush();
			System.out.println(file.length()+"크기의 "+file.getParent()+"파일 생성");
		}catch (IOException e ){
			e.printStackTrace();
		}finally {
			try {
		// 스트림 닫기(try안에 쓰고 if로 조건 걸어주기 ㅋ 
				 if(out != null) {
					 out.close();
				 }
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
