package com.gn.homework01.model.vo;



public class Employee extends Person{
	private int salary; //급여
	private String dept; //부서
	
	public Employee() {}
	
	public Employee(String name,int age,double height,double weight,int salary,String dept) {
		super(name,age,height,weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return super.toString()
			   +"\n급여 : " + salary
			   +"\n부서 : " + dept;
		 
		
	
	}
	
	

}
