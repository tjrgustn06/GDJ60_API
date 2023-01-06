package com.iu.api1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next();//abc.jpg
		boolean flag = true;
		
		//확장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(result);
		
		
		//확장자가 이미지인지 검증
		for(int i =0; i<names.length;i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일입니다");
				i = names.length;
				//flag =flase; (밑에꺼랑 같은 의미임)
				flag=!flag;
				break;
			}
			
		}
		if(flag) {
			System.out.println("비정상 파일입니다");
		}

		
		System.out.println("Finish");

	}
	
}

