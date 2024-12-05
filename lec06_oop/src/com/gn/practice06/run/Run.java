package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person ();
		
//		id : user01
//		pwd : 1234
//		name : 김철수
//		age : 43
//		gender : M
//		phone : 010-111-1111
//		email : kcs@gmail.com
		p.setId("user01");
		p.setPwd("1234");
		p.setName("김철수");
		p.setAge(43);
		p.setGender('M');
		p.setPhone("010-111-1111");
		p.setEmail("kcs@gmail.com");
		
		
        System.out.println(p.information());
        
	}

}
