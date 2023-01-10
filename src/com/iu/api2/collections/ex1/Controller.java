package com.iu.api2.collections.ex1;

import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	
	
		StudentDAO studentDAO;
		View view;
	 

	 
	 public void Start() {
			System.out.println("1.학생정보 초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보 검색 조회");
			System.out.println("4.학생정보 추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.프로그램 종료");
			int select = sc.nextInt();
			boolean check = true;
			while(check==true) {
			switch(select) {		
			case 1:	
				System.out.println("1.학생정보 초기화");
				break;
			case 2:
				System.out.println("2.학생정보전체조회");
				break;
			case 3:
				System.out.println("3.학생정보 검색 조회");
				break;
			case 4:
				System.out.println("4.학생정보 추가");
				break;
			case 5:
				System.out.println("5.학생정보삭제");
				break;
				default:
					System.out.println("프로그램 종료");
					
			}
				check = false;
		
			}
		}
	 
}
