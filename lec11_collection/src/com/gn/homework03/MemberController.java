package com.gn.homework03;

import java.util.HashMap;
import java.util.Map;

public class MemberController {

	Map<String,Member> map = new HashMap<String,Member>();
	
	public boolean joinMember(String id, Member m) {
		return false;
		}
	
	public String login(String id, String password) {
		return password;
		
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		return false;
		
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	
	
	
	
	
}
