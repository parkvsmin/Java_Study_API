package com.iu.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapMain {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("n1", 10);
		map.put("n2", 20);
		map.put("third", 270);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		int num = map.get("n2");
		System.out.println(num);
		
		//1. key들을 알아내기 유,무 
		boolean check =map.containsKey("n1"); 
		System.out.println(check);
		
		Set<String> set = map.keySet();
		
		//Map 반복적으로 꺼내는 형식
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
			System.out.println(map);
		

	}

}
