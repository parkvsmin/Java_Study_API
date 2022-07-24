package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
	
		StudentController sc = new StudentController();
		StudentView sv = new StudentView();
		ArrayList<StudentDTO> ar = null;
		
		
		StudentDAO dao = new StudentDAO();
//		ArrayList<StudentDTO> ar=null;
		try {
			ar = dao.getList();
			for(StudentDTO studentDTO:ar) {
				System.out.println(studentDTO.getName());
				System.out.println(studentDTO.getNum());
				System.out.println(studentDTO.getKor());
				System.out.println(studentDTO.getEng());
				System.out.println(studentDTO.getMath());
				System.out.println(studentDTO.getTotal());
				System.out.println(studentDTO.getAvg());
				
				System.out.println("==================");
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(ar);

	}

}
