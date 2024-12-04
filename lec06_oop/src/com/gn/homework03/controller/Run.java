package com.gn.homework03.controller;

import com.gn.homework03.model.vo.Function;

public class Run {

	public static void main(String[] args) {
		Function function = new Function();
		//실행용 패키지 아래에 있는 클래스에서 메소드 3개를 호출합니다.
		function.result1("존나", "어렵네");

		function.result2(4, 6);
		
		function.result3("흑흑", "흑흑");
	
	}

}
