package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {

	public static void main(String[] args) {

		Map<String,Information> infoMap = new HashMap<String,Information>();
		infoMap.put("Jhon", new Information(" 123-456-7890",3800000));
		infoMap.put("Emma", new Information("987-654-3210 ",2300000));
		infoMap.put("Tom", new Information("555-123-4567",4600000));
	    System.out.println("변경전 : " + infoMap);
	
//	    imfoMap.put("Jhon", new Information("123-456-7890",4100000));
	    infoMap.get("Jhon").setSalary(4100000);
	    
	    //(1)엠마가 전번 바꿧오 -> 엠마의 정보 출력
	    //111-111-111
	    System.out.println("=== Emmadml 정보 ===");
	    infoMap.get("Emma").setPhone("111-111-111");
	    System.out.println("전화번호 : "+infoMap.get("Emma").getPhone());
	    System.out.println("월급 : "+infoMap.get("Emma").getSalary());
	    
	    
	    
//	    System.out.println("변경후 : " + imfoMap);
	}

}
