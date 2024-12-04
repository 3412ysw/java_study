package com.gn.study.method.model.vo;

public class Smartphone {
	// 1. 반환형 ㄴ 매개변수 ㄴ
	//-> 앱 열림 메시지 
	public void openApp() {
		System.out.println("앱이 열렸습니다.");
	}
	
	// 2. 반환형 ㅇ 매개변수 ㄴ 
	// -> 배터리 잔량 리턴
	public int checkBattery() {
		return 85;
	}
	
	// 3. 반환형 ㄴ 매개변수 ㅇ
	// -> 불륨 입력하면 출력
	public void setVolume(int volume) {
		System.out.println("볼륨이 " + volume + "으로 설정되었습니다.");
	}
	
	// 4. 반환형 ㅇ 매개변수 ㅇ
	//-> 메시지 전송
	public String sendMsg(String msg) {
		return "메시지\'"+msg+ "\'가 전송되었습니다.";
	}
	
	public void checkWork() {
		Hospital hospital = new Hospital();
		hospital.emergencyCall();
		hospital.dotorCall();
		hospital.staffAnnouncement();
		//hospital.personalRecord();
	}
	

	
	
	
	
}
