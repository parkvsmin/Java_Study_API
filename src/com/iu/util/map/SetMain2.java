package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//1 ~ 45 중복되지 않는 숫자 6개 Set에 담아서 출력
		Random random = new Random();
		HashSet<Integer> nums = new HashSet<>();
		
		while(nums.size()!= 6) { //nums.size()<6
			int num =random.nextInt(45)+1; //0이상 45이하
			nums.add(num);
		}
		
		Iterator<Integer> iterator = nums.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		} // while
		System.out.println(nums);
//		Random random = new Random();
//		HashSet<Integer> set = new HashSet<>();
//		
//		for(int i=0;set.size()<6;i++) {
//			int num =(int)(Math.random()*45);
//			set.add(num);
//		} // for
//		System.out.println("Set"+set);
		
		
	}

}
