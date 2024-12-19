package com.gn.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun2 {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\241219");
		if(dir.exists() ==false) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample2.dat");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file,true);
			String str = "멋쟁이 토마토~!\n";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
