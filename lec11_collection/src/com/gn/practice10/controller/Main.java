package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {

	public static void main(String[] args) {

		Map<String,Planet> map = new HashMap<String,Planet>();
		map.put("Mercury",new Planet("수성", 4879,0.24));
		map.put("Venus",new Planet("금성", 12104,0.62));
		map.put("Earth",new Planet("지구", 12742,1.0));
		map.put("Mars",new Planet("화성", 6779,1.88));
		
		System.out.println("*** keySet() 사용 ***");
		Set<String> KeySet = map.keySet();
		Iterator<String> itKey = KeySet.iterator();
			while(itKey.hasNext()) {
				String Key = itKey.next();
				Planet value =map.get(Key);
				System.out.println("행성 이름 : " + Key +
						"("+value.getName()+"), 지름 : "+ value.getDiameter()+
						"km, 공전주기 : " + value.getPeriod() +" 년");
			}
			
		System.out.println("*** entrySet() 사용 ***");
		Set<Entry<String,Planet>>entrySet = map.entrySet();
		Iterator<Entry<String,Planet>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String,Planet> entry = itEntry.next();
			String key = entry.getKey();
			Planet value = entry.getValue();
			System.out.println("키 : " + key + ", 값 : " +value);
		}
			
		
	}
}