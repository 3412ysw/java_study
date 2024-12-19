package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputRun {

	public static void main(String[] args) {
		// 1. 파일 위치 저장
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"sample1.dat");
		// 2. 파일 입력 스트림 선언
		FileInputStream in = null;
		// 3. 파일 입력 스트림 생성
		try {
			in = new FileInputStream(file);
			// 4. 읽은 데이터를 보관할 배열 
			//(1) 파일 크기만한 비어있는 배열 만들기
			byte[] arr = new byte[(int)file.length()];
			int idx = 0; 
			// 5. 읽어오기
			//(2) 읽어올 데이터 담을 변수 
			int data ;
			//(3) 반복문 파일 내부 정보 읽어옴
			while(true) {
				data = in.read(); // 데이터가 리드라는 함수의 반환형으로 바뀜
				if(data == -1) break; // 정보 없으면 멈춤
				arr[idx++] =(byte) data; // 어레이에 데이터 값 담으삼
			}
			// 6. 확인하기
			//System.out.println(arr); 숫자 정보 
			String str = new String(arr);
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!= null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
