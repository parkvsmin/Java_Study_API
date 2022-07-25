package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.util.list.ex1.CityDTO;

public class StudentController {

	private StudentView sv;
	private Scanner sc;

	//start 메서드 
	//1. 학생정보출력 - 모든 학생정보 출력
	//2. 학생정보검색 - getstudent
	//3. 학생정보추가 - setstudentadd
	//4. 학생정보삭제 
	//5. 백     업 - setlist호출
	//6. 종     료


	public void start() {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		boolean check=true;

		while(check) {
			System.out.println("1. 학생정보출력");
			System.out.println("2. 학생정보검색");
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 백      업");
			System.out.println("6. 종      료");
			int select = sc.nextInt();
//			if(select==1) {
//				sv.init(ar);
//			}else if(select==2) {
//				sv.view(ar);
//			}else if(select==3) {
//				StudentDTO studentDTO = ervice.find(ar);
//				if(studentDTO !=null) {
//					sv.view(studentDTO);
//				}else {
//					sv.view("학생정보추가");
//				}
//			}else if(select==4) {
//				boolean result = service.add(ar);
//				String message="추가 실패";
//				if(result) {
//					message="추가 성공";
//				}
//				sv.view(message);
//			}else if(select==5) {
//				boolean result =sv.remove(ar);
//				String message="삭제 실패";
//				if(result) {
//					message="삭제성공";
//				}
//				sv.view(message);
//			}else {
//				check=!check;
//				break;
//			}
		}
	}
}
