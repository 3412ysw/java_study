package com.gn.study.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.study.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		Set<Integer> Class1 = new HashSet<Integer>();
		Class1.add(1);
		Class1.add(2);
		Class1.add(3);
		
		Set<Integer> Class2 = new HashSet<Integer>();
		Class2.add(3);
		Class2.add(4);
		Class2.add(5);
		
		System.out.println("=== 합집합 ===");
//		Class1.addAll(Class2);
		Set<Integer> union = new HashSet<Integer>(Class1);
		union.addAll(Class2);
        System.out.println(Class1);
		System.out.println(union);
		
		System.out.println("=== 교집합 ===");
//		Class1.retainAll(Class2);
		Set<Integer> intersection = new HashSet<Integer>(Class1);
		intersection.retainAll(Class2);
		System.out.println(Class1);
		System.out.println(intersection);
		
		System.out.println("=== 차집합 ===");
		Set<Integer> difference = new HashSet<Integer>(Class1);
		difference.removeAll(Class2);
		System.out.println(difference);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("철수",20));
		set1.add(new Student("우석",28));
		set1.add(new Student("은우",30));
		
		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("철수",20));
		set2.add(new Student("길동",25));
		
//		set1.addAll(set2);
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		
		//HashSet 요소조회 
		Set<String> fruits = new HashSet<String> ();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.print(fruit);
//			iterator.remove();
//			if(fruits.size()!=0) {
//				System.out.print(",");
//			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
