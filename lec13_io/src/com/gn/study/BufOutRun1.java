package com.gn.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufOutRun1 {

	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub\\241219");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// 2.파일 객체
		File file = new File(dir,"sample3.dat");
		// 3.스트림 생성
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String str = "안녕\n" + "난 안갠차너\n";
			bos.write(str.getBytes());
			bos.write(str.getBytes());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!= null) bos.close(); // 순서 중요 ㅋ ㅋ 
				if(fos!=null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
