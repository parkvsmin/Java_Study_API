package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	private StudentDAO studentDAO;
	Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
	}

	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<StudentDTO> ar = studentDAO.getList();
		for(StudentDTO studentDTO:ar) {
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
		}
		
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		
		return studentDAO.setList(ar);
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		int result=0;
		
		System.out.println("삭제할 학생 번호 입력");
		for(int i=0;i<ar.size();i++) {
			int num = sc.nextInt();
			if(num==ar.get(i).getNum()) {
				StudentDTO st =ar.remove(i);
				if(st !=null) {
					result=1;
				}
			}
		}
		
		
		return result;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가할 학생 이름 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);

	}

}
