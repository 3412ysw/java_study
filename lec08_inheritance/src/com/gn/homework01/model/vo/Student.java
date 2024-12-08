package com.gn.homework01.model.vo;

public class Student extends Person{
	private int grade; //학년
	private String major; // 전공
	
	public Student() {}
	
	public Student(String name,int age,double height,double weight,int grade,String major) {
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
		
	}
	@Override
	public String toString() {
	return super.toString()+"\n학년 : "+ grade+"\n전공 : "+ major;
	}
	
}
