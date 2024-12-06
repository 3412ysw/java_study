package com.gn.homework01.run;

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

		Person p = new Person();
		Student s = new Student();
		Employee e = new Employee();
		
		Student[]arr2 = new Student[3];
		arr2[0] = new Student("김철수",20,178.2,70,1,"정보시스템공학과");
		arr2[1] = new Student("이영희",23,167,54,4,"물리학과");
		arr2[2] = new Student("홍길동",21,197.6,86,2,"경영학과");
		
		for(Student su: arr2) {
			
		}
		
		
		
	}

}
