package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Person;
import com.gn.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
//		1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
//		2. 아래 사용 데이터를 참고하여 3명의 학생 객체 생성
//		3. 반복문을 통해 출력
//		4. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당
//		반복문을 통해 키보드로 사원 정보를 입력받기
//		5. 2명 정도의 사원 정보를 입력 받아서 각 개체에 저장하고 현재까지 기록된 사원들의 정보 출력

		
		Student[] students = new Student[3];
		students[0] = new Student("김철수",20,178.2,70,1,"정보시스템공학과");
		students[1] = new Student("이영희",23,167,54,4,"물리학과");
		students[2] = new Student("홍길동",21,197.6,86,2,"경영학과");
		
		
		
		for(Student s : students) {
			System.out.println(s.toString());
			}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 사원 입력받기 ===");
		Employee[] emp = new Employee [10];
		int count = 0;
		String answer = "y";
		while(true) {
			if(answer.equals("N")||answer.equals("n")||count==10) {
		    	break;
		    } else if(answer.equals("Y")||answer.equals("y")) {
		    	System.out.print("이름 : ");
			    String name = sc.nextLine();
			    System.out.print("나이 : ");
			    int age = sc.nextInt();
			    System.out.print("키 : ");
			    double height = sc.nextDouble();
			    System.out.print("몸무게  : ");
			    double weight = sc.nextDouble();
			    System.out.print("급여 : ");
			    int salary = sc.nextInt();
			    sc.nextLine();
			    System.out.print("부서 : ");
			    String dept =sc.nextLine();
			    
			    emp[count] = new Employee(name, age,height,weight,salary,dept);
			    count++;
			    System.out.print("계속 추가하시겠습니까?");
			    answer = sc.nextLine();
		    }
		}
		
		
		for(Employee e : emp) {
			if(e == null) {
				break;
			}
			System.out.println(e.toString());
		}

		
	}

}
