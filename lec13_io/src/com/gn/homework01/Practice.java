package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {

	
	public String method1(String str) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "나비야1.dat");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			byte[] arr = str.getBytes();
			out.write(arr);
			out.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
				
			}catch(IOException e) {
					e.printStackTrace();
				}
			}
	return str;
	}
	
	
	public String method2(String str) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File (dir,"나비야2.dat");
		
		try(BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(file))){
			bw.write(str.getBytes());
			
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
			
		return str;
		
	}
	
	
	
	
	
	
	
	
}
