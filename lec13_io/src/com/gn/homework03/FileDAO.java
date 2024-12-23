package com.gn.homework03;

import java.io.*;

public class FileDAO {

	public boolean checkName(String file) {
		//객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌 
		  // 해당 파일이 있는지 없는지에 대한 boolean 값을 반환 
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File newFile = new File(dir, file);
		if(newFile.exists()) {
			return true;
		}else {
			
		}
		return false;
	}

	// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
	  // String에 써서 저장 
	public void fileSave(String file, String s) {
		File dir = new File("C:\\test\\sub");
		File newFile =  new File (dir,file);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){
			bw.write(s);
		} catch (IOException e) {          
			e.printStackTrace();
		}
	}
	
	// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환 
	 
	public StringBuilder fileOpen(String file) {
		File dir = new File("C:\\test\\sub");
		File newFile = new File(dir,file);
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(newFile))){
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				sb.append(data).append("/n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return sb;
		
	}
	
	// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
	  // String에 써서 저장하되 이어서 저장될 수 있도록 함 
	public void fileEdit(String file, String s) {
		File dir = new File("C:\\test\\sub");
		File newFile = new File(dir,file);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile,true))){
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
