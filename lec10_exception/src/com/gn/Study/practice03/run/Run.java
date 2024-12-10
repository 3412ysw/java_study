package com.gn.Study.practice03.run;

import java.util.Scanner;

import com.gn.Study.practice03.controller.LoginManager;
import com.gn.Study.practice03.exception.InvalidCredentialsException;

public class Run {

	public static void main(String[] args) {
		 LoginManager l = new  LoginManager ();
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("아이디 : ");
		 String answer1 = sc.nextLine();
		 System.out.print("비밀번호 : ");
		 String answer2 = sc.nextLine();
		 
		 try {
			 l.login(answer1, answer2);
		 }catch(InvalidCredentialsException e) {
			 System.out.println(e.getMessage());
		 }
		 
	}

}
