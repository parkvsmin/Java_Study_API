package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {

		StudentController sc = new StudentController();
		StudentView sv = new StudentView();
		ArrayList<StudentDTO> ar = null;
		
		StudentDAO dao = new StudentDAO();
		StudentService service = new StudentService();
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
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("Add");
		studentDTO.setNum(6);
		studentDTO.setKor(50);
		ar.add(studentDTO);
		
		try {
			ArrayList<StudentDTO> result = ar;
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(ar);

	}

}


//iu.1,56,54,85
//choa.2,86,95,75
//suji.3,75,85,74
//hani.4,85,97,86

