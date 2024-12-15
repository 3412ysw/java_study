package com.gn.homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {

	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.contains(l)) {
			return false;
		}else {
			lottery.add(l);
			return true;
		}
	}
	
	public boolean deleteObject(Lottery l) {
		if(lottery.contains(l)) {
			lottery.remove(l);
			return true;
		}else if(win.contains(l)) {
			win.remove(l);
			return true;
		}else {
			return false;
		}
	}
	
	
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	
	// 1. 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
			// -> 당첨 목록을 찾기 전에 추첨 대상의 수가 4보다 큰지 먼저 확인
			// -> lottery의 크기가 4보다 작은 경우 null 리턴
			// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
			// 인덱스를 이용해 win에 당첨자 저장
			// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
			// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
			// 기존에 당첨된 사람은 제외
			// 삭제된 사람의 자리만 새로운 추첨자로 채우기
	
	public Set<Lottery> winObject(){
	    	if(lottery.size()<4) {
	    		return null;
	    	}else{
	    		while(win.size()<4) {
	    			List<Lottery> list = new ArrayList<Lottery>(lottery);
		    		int i = (int)(Math.random()*list.size());
		    		if(win.contains(list.get(i))) {
		    			continue;
		    		}else {
		    			win.add(list.get(i));
		    			
		    		}
	    		}
	    			return win;
	        }
		

	   
	}
		
		
	public Set<Lottery> sortedWinObject(){
		Set<Lottery> list = new TreeSet<Lottery>(win);
		
		return list;
	}
	
	public boolean searchWinnder(Lottery l) {
		if(win.contains(l)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
