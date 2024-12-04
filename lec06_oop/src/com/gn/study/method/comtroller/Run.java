package com.gn.study.method.comtroller;

import com.gn.study.method.Library;
import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Smartphone;

public class Run {

	public static void main(String[] args) {
		// 객체 생성(인스턴스화)
		Smartphone myphone = new Smartphone();
		
		System.out.println("====");
		myphone.checkWork();
		System.out.println("====");
		
		// 1. 반환형 ㄴ 매개변수 ㄴ
		myphone.openApp();
		
		// 2. 반환형 ㅇ 매개변수 ㄴ
		int battery = myphone.checkBattery();
		System.out.println("잔량 배터리 : " + battery);
		System.out.println(myphone.checkBattery());
		
		// 3. 반환형 ㄴ 매개변수 ㅇ
		myphone.setVolume(15);
		
		// 4. 반환형 ㅇ 매개변수 ㅇ
		String result= myphone.sendMsg("자니?");
		System.out.println(result);
	
		
		// 객체화 
		Library library = new Library ();
		
		library.borrowBooks("해리포터","반지의 제왕","채식주의자");
	    library.returnBooks(1000, "1984","파친코");
	
	    // 객체화
	    Hospital hospital = new Hospital();
	    
	    hospital.emergencyCall();
	    // 나머지 안댕 ㅎ
	    
	    
	  //인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo();
		Math.random(); 
	    
	    
	    
	    
	}

}
