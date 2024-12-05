package com.gn.study.capsule.closed;
// 게터 세터 사용 ㅇㅇ
public class Account2 {

	private String user;
	private int balance;
	
	public Account2() {}
	
	
	public Account2(String user,int balance) {
		this.user = user;
		this.balance = balance;
	}
		
		public String getuser() {
			return user;
			
		}
		
		public int getBalance() {
			return balance;
		}
		
		public void setUser(String user) {
			this.user =user;
		}
		
		public void setBalance(int balance) {
			if(balance <0 ) {
				System.out.println("출금이 불가능 합니다 ");
			}else {
			this.balance = balance;
		    }
	}
	
	
	
}
