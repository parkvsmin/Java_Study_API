package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//view 3개
	//1. String 출력
	//2. StudentDTO 출력
	//3. ArrayList<StudentDTO> 출력
	
	public void view(String str) {
		System.out.println(str);
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println(studentDTO.getName());
		System.out.println(studentDTO.getNum());
		System.out.println(studentDTO.getKor());
		System.out.println(studentDTO.getEng());
		System.out.println(studentDTO.getMath());
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			StudentDTO studentDTO = ar.get(i);
			this.view(studentDTO);
		}
	}

	public boolean remove(ArrayList<StudentDTO> ar) {
		// TODO Auto-generated method stub
		return false;
	}

	public void init(ArrayList<StudentDTO> ar) {
		// TODO Auto-generated method stub
		
	}
}
