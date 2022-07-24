package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	//DAO : Data Access Object
	//DTO : Data Transfer Object
	//file data에 접근 
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리 
		//List로받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제 (덮어쓰기)
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생 했을 경우
		
		ArrayList<StudentDTO> studentData = ar;
		
		ar = new ArrayList<StudentDTO>();

		File file = new File("C:\\study\\studentData.txt");
		String [] names = file.list();
		for(String s:names) {
			System.out.println(s);
		}
		File [] files = file.listFiles();
		for(File f: files) {
			if(f.isFile()) {
				if(f.length()==0) {
					f.delete();
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int result = 1;
		return result;
		
	}
	
	//1. getList
	// StudentData 파일의 내용을 읽어서 작업
	
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("C:\\study\\studentData.txt");
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr);
		
		boolean check = true;
		br.readLine();
		while(check) {
			String str=br.readLine();
			if(str==null) {
				break;
			}

			StringTokenizer st = new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));					studentDTO.setTotal(studentDTO.getEng()+studentDTO.getKor()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
				}
		}
		
		return ar;
		
		
	}
}
