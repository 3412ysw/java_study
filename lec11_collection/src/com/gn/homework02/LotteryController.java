package com.gn.homework02;

import java.util.*;
import java.util.Set;

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
		
		
		
		
		return false;
		
	}
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		return lottery;
	}
	public Set<Lottery> sortedWinObject(){
		return lottery;
	}
	
	public boolean searchWinnder(Lottery l) {
		return false;
		
	}
	
	
	
}
