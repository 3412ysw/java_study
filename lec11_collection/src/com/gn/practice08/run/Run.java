package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Set<Person> list1 = new HashSet<Person>();
		list1.add(new Person("홍길동",20));
		list1.add(new Person("이순신",25));
		list1.add(new Person("유관순",22));
		
		Set<Person> list2 = new HashSet<Person>();
		list2.add(new Person("유관순",22));
		list2.add(new Person("강감찬",27));
		list2.add(new Person("을지문덕",30));
		
		int su1 = 1;
		System.out.println("=== 합집합 ===");
		Set<Person>union= new TreeSet<Person>(list1);
		union.addAll(list2);
		Iterator<Person> iterator = union.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(su1 + "번 :" + p);
			su1++;
		}
		
		int su2 = 1;
		System.out.println("=== 교집합 ===");
		Set<Person>intersection= new TreeSet<Person>(list1);
		intersection.retainAll(list2);
		Iterator<Person> iterator1 = intersection.iterator();
		while(iterator1.hasNext()) {
			Person p = iterator1.next();
			System.out.println(su2 + "번 :"+ p);
			su2++;
		}
		
		int su3 = 1;
		System.out.println("=== 차집합 ===");
		Set<Person>difference= new TreeSet<Person>(list1);
		difference.removeAll(list2);
		Iterator<Person> iterator2 = difference.iterator();
		while(iterator2.hasNext()) {
			Person p = iterator2.next();
			System.out.println(su3 + "번 :"+p);
			su3++;
		}
		
		
	}

}
