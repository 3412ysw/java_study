package com.gn.study.capsule;

public class Student {
	private int studentNo;
	
	//게터 세터 쓸 때 생성자랑 상관 ㄴ 
	//게터 세터는 메소드 (재할당이랑 더 가까움)
	// 재할당만 해도 ㄱㅊ 기본값 이미 들어있기 때문
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
}
