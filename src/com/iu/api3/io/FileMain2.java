package com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\filetest","test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		String name = "suji";
		try {
			FileWriter fw = new FileWriter(file,true); //기본값이 false 추가 하고 싶으면 true
			fw.write(name+"\r\n");  //\r(다시 뒤로 빼기)\n(다음건 밑에 쓰기)
			fw.flush(); //강제로 버퍼를 밀어내기(비우기)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
