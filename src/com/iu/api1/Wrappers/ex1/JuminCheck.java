package com.iu.api1.Wrappers.ex1;

public class JuminCheck {
	
	
	//Check1
	//주민등록번호를 받아서 
	//남성인지 여성인지 출력
	
	
	
	public void check1(String jumin) {		
		//jumin.charAt(7);
		String check = jumin.substring(7,8);
		int c = Integer.parseInt(check);
		if(c%2==1) {	
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
//		if(check.equals("1") || check.equals("3"));	
//		if(c==1||c==3) {
//			
//		}else {
//	}		
	}
		
		//check2
	//주민등록번호를 받아서 
	//나이를 계산해서 출력
	//3-5  : 봄
	//6-8  : 여름
	//9-11 : 가을
	//12-2 : 겨울
				
	public void check2(String jumin) {
		//1.나이계산
		String y = jumin.substring(0,2);
		String check = jumin.substring(7,8);
		 int year = 1900;
		if(check.equals("3") ||check.equals("5")) {
			year =2000;
		}		
			year = year + Integer.parseInt(y);
			int age =2023-year;
			System.out.println("Age : "+age);
			
			//2.계절 출력
			String m = jumin.substring(2,4);
			int month = Integer.parseInt(m);
			if(month>=3 &&month<=5) {
				System.out.println("봄");
			}else if(month>=6 &&month<=8) {
				System.out.println("여름");
			}else if(month>=9 &&month<=11) {
				System.out.println("가을");
			}else {
				System.out.println("겨울");
			}
		}
	}

