package com.gn.Study.practice03.controller;

import com.gn.Study.practice03.exception.InvalidCredentialsException;

public class LoginManager {
	
	public void login(String id, String pwd)
			throws InvalidCredentialsException{
		if(isValidCredentials(id, pwd)==true) {
			System.out.println("성공적으로 로그인되었습니다.");
		}else if (isValidCredentials(id, pwd)==false) {
			throw new InvalidCredentialsException(
					"로그인이 실패하였습니다.\n"
					+ "잘못된 아이디와 비밀번호 입니다.");
			
		}
	}
	
	private boolean isValidCredentials(String id,String pwd ) {
		if(id.equals("admin")&&pwd.equals("admin1234!")) {
			return true;
		}else {
			return false;
		}
	}
}
