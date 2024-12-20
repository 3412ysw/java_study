package com.gn.homework03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		File dir = new File(file);
		if(dir.exists()) {
			return true;
		}else if(!dir.exists()) {
			
		}
		return false;
		}
	
	
	public void fileSave(String file, String s) {
		File dir = new File(file);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public StringBuilder fileOpen(String file) {
		File dir = new File(file);
		if(dir.exists()) {
			StringBuilder sb = new StringBuilder();
			return sb;
		}else if(!dir.exists()) {
			
		}
		return null;
	}
	
	
	public void fileEdit(String file, String s) {
		return ;
	}
	
}
