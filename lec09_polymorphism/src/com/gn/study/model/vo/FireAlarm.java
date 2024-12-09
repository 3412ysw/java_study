package com.gn.study.model.vo;

public class FireAlarm implements Alarm{
	@Override
	public void soundAlarm() {
		System.out.println("대피");
	}
}
