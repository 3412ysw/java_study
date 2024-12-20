package com.gn.homework03;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		fd.checkName(file);
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb ) {
		String str = sb.toString();
		fd.fileSave(file, str);
	}
	
	public StringBuilder fileOpen(String file) {
		fd.fileOpen(file);
		return fd.fileOpen(file) ;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String str = sb.toString();
		fd.fileEdit(file, str);
	}
	
	
}
