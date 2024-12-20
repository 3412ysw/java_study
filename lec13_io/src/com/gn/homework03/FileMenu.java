package com.gn.homework03;

import java.util.*;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
    public void mainMenu() {
    	
    	while(true) {
    		System.out.println(" ***** My Note ***** ");
    		System.out.println("1. 노트 새로 만들기");
    		System.out.println("2. 노트 열기 ");
    		System.out.println("3. 노트 열어서 수정하기");
    		System.out.println("9. 끝내기");
    		System.out.println("메뉴 번호 : ");
    		int menu = sc.nextInt();
    		switch(menu) {
    			case 1 : fileSave(); break;
    			case 2 : fileOpen(); break;
    			case 3 : fileEdit(); break;
    			case 9 : System.out.println("프로그램을 종료합니다.");
    					 return;
    			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); 
    					 break;
    		}
    	}
     }
	
    public void fileSave() {
    	while(true) {
    		System.out.println("파일에 저장할 내용을 입력하세요. ");
    		System.out.println("ex끝it  이라고 입력하면 종료됩니다. ");
    		
    	}
    	
    	
    	
    	
    }
    
    public void fileOpen() {}
    
    public void fileEdit() {}
	
	
	
	
	
	
	
	
	
}
