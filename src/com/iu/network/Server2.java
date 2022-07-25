package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;


public class Server2 {
	//getFood
	//Server에서 메세지를 기다림
	//1 : 점심 메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//2 : 저녁 메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//3 : 프로그램이 종료
	//그외 나머지 : 잘못 입력된 번호입니다를 client로 전송
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;



	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();

		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안먹어");

		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");

	}

	public void getFood() throws Exception {
		ServerSocket serverSocket = new ServerSocket(8282);
		Socket socket = serverSocket.accept();

		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;

		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;

		boolean check=true;

		while (check) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message=br.readLine();

			int select = Integer.parseInt(message);

			Random random = new Random(Calendar.getInstance().getTimeInMillis());
			if(select==1) {
				int index = random.nextInt(lunch.size());
				message = lunch.get(index);
			}else if(select==2) {
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
			}else if(select==3) {
				break;
			}else {
				message="잘못된 번호";
			}

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);

			bw.write(message+"\r\n");
			bw.flush();
		} // while 끝 

		br.close();
		ir.close();
		is.close();

		bw.close();
		ow.close();
		os.close();


		socket.close();
		serverSocket.close();
	}
}


