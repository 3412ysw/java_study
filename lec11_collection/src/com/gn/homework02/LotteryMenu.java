package com.gn.homework02;

import java.util.*;



public class LotteryMenu {

	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		for(int i = 0;;i++) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : insertObject();
			        break;
			case 2 : deleteObject();
					break;
			case 3 : searchObject();
	         		break;
			case 4 : winObject();
	         		break;
			case 5 : sortedWinObject();
					break;
			case 6 : searchWinner();
	         		break;
			case 9 : System.out.println("프로그램 종료.");
					return;
	        default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 
	        }
		}
	}
	
	public void insertObject() { 
		System.out.println("==== 1. 추점 대상 추가 ====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		for(int i = 0 ; i < num ; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.next();
			Lottery lottery = new Lottery(name,phone);
			boolean bool = lc.insertObject(lottery);
		    if(!bool) {
		    	System.out.println("중복된 대상입니다. 다시 입력하세요.");
		    	i--;
		    }
		}
		System.out.println(num+"명추가 완료되었습니다.");
	}
	
	public void deleteObject() {
	    System.out.println("==== 2.추첨 대상 삭제 ====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		Lottery lottey = new Lottery(name, phone);
		boolean bool = lc.deleteObject(lottey);
		if(bool) {
			System.out.println("삭제 완료되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void searchObject() {
		System.out.println("==== 3.추첨 대상 목록 조회 ====");
		System.out.println(lc.searchObject());
	}
	
	public void winObject() {
		System.out.println("==== 4.당첨 대상 구성 ====");
		if(lc.winObject()==null) {
			System.out.println("추첨 대상이 4명 이상이여야 당첨 대상을 구성할 수 있습니다.");
		}else {
		System.out.println(lc.winObject());
		}
		
	}
	
	public void sortedWinObject() {
		Set<Lottery> set = lc.sortedWinObject();
		Iterator<Lottery> iterator = set.iterator();
		while(iterator.hasNext()) {
			Lottery l = iterator.next();
			System.out.println(l);
		}
		
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		Lottery lotter = new Lottery (name,phone);
		boolean bool = lc.searchWinnder(lotter);
		if(bool) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("다음 기회에!");
		}
	}
	
	
	
}
