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
    		System.out.print("메뉴 번호 : ");
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
//    파일에 저장할 내용을 입력하세요. 
//	 ex끝it  이라고 입력하면 종료됩니다. 
//	 내용 :  
 // "ex끝it"를 입력할 때까지 사용자가 입력하게 하고 
 // 그 값들을 StringBuilder에 저장 
// 저장할 파일 명을 입력해주세요(ex. myFile.txt) :  
 // 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 
 // "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"가 출력됨 
 // y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 
 // StringBuilder 넘김 
 // n를 입력하면 "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복 
 // 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
 // 파일 명과 내용을 fc에 fileSave 메소드로 넘김 
    public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String user = "";
		do {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			user = sc.nextLine();
			if(!user.equalsIgnoreCase("ex끝it")) {
				sb.append(user + "\n");
			}
		} while(!user.equalsIgnoreCase("ex끝it"));
		
		boolean check = false;
		String file = null;
		do {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			file = sc.nextLine();
			
			check = fc.checkName(file);
			
			if(check) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
				String answer = sc.nextLine();
				if(answer.equalsIgnoreCase("Y")) {
					fc.fileSave(file, sb);
					check = false;
				} else {
					check = true;
				}
			} else {
				fc.fileSave(file, sb);
			}
		}while(check);
     }
    
    //열 파일 명 : 
    	  // 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
    	  // 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 
    	  // 반환 값 출력 
    	  // 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
    public void fileOpen() {
    	System.out.print("열 파일 명 : ");
    	sc.nextLine();
    	String name = sc.next();
    	if(fc.checkName(name)==true) {
    		fc.fileOpen(name);
    	}else if(fc.checkName(name)==false) {
    		System.out.println("없는 파일입니다.");
    	}
     }
    
 // 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
    // 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
    // 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
    // ex끝it를 입력하면 반복문 종료 후
    //fc의 fileEdit()에 파일 명과 StringBuilder 전달 
    public void fileEdit() {
    	System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		
		boolean b = fc.checkName(file);
		if(b) {
			
			StringBuilder sb = new StringBuilder();
			String user = null;
			do {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it  이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				user = sc.nextLine();
				if(!user.equalsIgnoreCase("ex끝it")) {
					sb.append(user + "\n");
				}
			} while(!user.equalsIgnoreCase("ex끝it"));
			
			fc.fileEdit(file, sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	
    	
    
    }
	
	
	
	
	
	
	
	
	
}
