package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain1 {

	public static void main(String[] args) {
		//키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in; //키보드전선과연결 byte처리
		InputStreamReader ir = new InputStreamReader(is); //한글자
		BufferedReader br = new BufferedReader(ir); //연결끝
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
