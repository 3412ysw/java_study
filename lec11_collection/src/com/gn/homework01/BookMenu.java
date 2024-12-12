package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		for(int i = 0 ; ; i++) {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 선택 : ");
		int answer = sc.nextInt();
		if(answer==1) {
			insertBook();
			
		}else if(answer==2) {
			selectList();
			
		}else if(answer==3) {
			searchBook();
		
		}else if(answer==4) {
			deleteBook();
			
		}else if(answer==5) {
			ascBook();
			
		}else if(answer==9) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		
		
		
		}
	}
	
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.next();
		sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타) : ");
		int category1 = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();  
		String category2 ="";
		if(category1==1) {
			category2 = "인문";
		}else if(category1==2) {
			category2 = "자연과학";
		}else if(category1==3) {
			category2 = "어린이";
		}else {
			category2 = "기타";
		}
		Book book = new Book(title, author, category2, price);
		bc.insertBook(book);
	}
	
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		BookController b = new BookController();
		 // booklist -> List<book>
		List<Book> arr = bc.selectList();
		if(arr.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(Book a : arr) {
				System.out.println(a);
			}
		}
	}
	
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
	}
	
	public void deleteBook() {
		System.out.println("=== 도서 삭제 ===");
	}
	
	public void ascBook() {
		System.out.println("정렬에 성공하였습니다.");
	}
	

}
