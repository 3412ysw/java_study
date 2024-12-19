package com.gn.homework02;

import java.io.*;

public class Practice {

	public void method1(File file) {
	
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(file);
			byte[] arr = new byte[(int)file.length()];
			int idx = 0;
			int data ;
			
			while(true) {
				data = in.read();
				if(data == -1) break;
				arr[idx++] =(byte)data;
			}
			
			String array = new String (arr);
			System.out.println(array);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!= null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void method2(File file) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] arr = new byte[(int)file.length()];
			byte[] size = new byte[5];
			int idx = 0;
			while(true) {
				int data = bis.read(size);
				if(data == -1) break;
				System.arraycopy(size, 0, arr, idx, data);
				idx +=data;
			}
			String str = new String(arr);
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			}catch(IOException e) {
			e.printStackTrace();
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	private InputStream FileInputStream(File file) {
		// TODO Auto-generated method stub
		return null;
	}
}
