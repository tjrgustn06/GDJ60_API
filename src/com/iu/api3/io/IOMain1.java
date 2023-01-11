package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {

	public static void main(String[] args) {
		//1.키보드 연결
		//표준입력 : 키보드, 마우스, 캐스너
		//표준출력 : 모니터
		Scanner sc = new Scanner(System.in);
		InputStream is = System.in;
		//char 을 처리하는 stream
		InputStreamReader ir = new InputStreamReader(is);
		//string 을 처리하는 stream
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println("입력");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
