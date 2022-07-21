package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		Calendar future = Calendar.getInstance();
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f-n;
//		System.out.println(result/1000);
		
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR,1996);
		birth.set(Calendar.MONTH,4);
		birth.set(Calendar.DATE,26);
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long result = n-b;
		result = result/(1000*60*60*24);
		result = result/365;
		System.out.println(result);
		
		Date date = now.getTime();
		System.out.println(date);
		

	}

}
