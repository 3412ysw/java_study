package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] arr = str.split("\n");
		
		
		for(int i = 0; i <3;i++) {
			String name = arr[i].substring(0, 3);
			int age = Integer.parseInt(arr[i].substring(4,6)); 
			String address = arr[i].substring(7,10);
			char gender = arr[i].substring(11).charAt(0);
			
			Person p = new Person(name,age,address,gender);
			System.out.println(p);
		}
        
	
		
		
	
		
		
//	- 그 후, 위 3개의 문자열을 `,`를 기준으로 하여 값을 잘라서 객체를 생성하세요.
//	- 만들어진 3개의 객체를 toString()을 통해 출력하세요.
//	- 이때 사용되는 객체의 클래스 다이어그램은 다음과 같습니다.
		
		
	}

}
