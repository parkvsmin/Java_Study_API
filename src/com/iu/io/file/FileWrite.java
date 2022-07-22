package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void Write () throws Exception {
		File file = new File("C:\\study","test.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("Today is Friday\r\n");
		fw.flush(); //버퍼 강제로 밀어내기
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
		
	}

}
