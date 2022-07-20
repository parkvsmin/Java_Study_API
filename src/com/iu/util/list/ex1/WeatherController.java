package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
//	start메서드
//	1.날씨정보초기화 - init메서드호출
//	2.전국날씨출력
//	3.지역날씨검색
//	4.지역정보추가
//	5.지역정보삭제
//	6.종          료
	
	Scanner sc;
	WeatherView wv;
	WeatherService ws;
	CityDTO [] CityDTOs;
	
	public WeatherController() {
	
	Scanner sc = new Scanner(System.in);
	wv = new WeatherView();
	ws = new WeatherService();
}
	
	public void start() {
	
		ArrayList<CityDTO> ar = new ArrayList<>();
		boolean check=true;
		while(check) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨출력");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역정보추가");
			System.out.println("5.지역정보삭제");
			System.out.println("6.종      료");
			int select= sc.nextInt();
		}
	
		
	}
	

}
