package com.iu.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStream is = System.in; //0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
			String message=br.readLine();
			System.out.println(message);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//연결된 역순으로 자원 해제
			try {
			br.close();
			ir.close();
			is.close();
		}catch (Exception e) {
			//TODO: handle exception
		}

		}
	}
}
