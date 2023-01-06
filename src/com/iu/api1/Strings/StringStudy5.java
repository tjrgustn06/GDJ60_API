package com.iu.api1.Strings;

public class StringStudy5 {

	public static void main(String[] args) {
	
		String str = "apple# Apple, aPPle# appLe";  //전처리 작업
		
		str = str.replace("," , "#");
		//str = str.replace(" ", ""); 
		//str = str.trim();	//앞뒤 공백만 없애고 싶으면 트림을 쓰면 된다
		String [] result = str.split("#"); //파싱(parsing) 하나의문자로 여러개의문자열로 나누는 작업
		
		for(int i =0; i<result.length;i++) {
			System.out.println(result[i].trim().toLowerCase());
		}

	}

}
