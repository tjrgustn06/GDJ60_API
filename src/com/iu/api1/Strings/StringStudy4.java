package com.iu.api1.Strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4);
		
		System.out.println(result);
		
		result = str.substring(4, 6);
		System.out.println(result);
		
		str = "te21jnhsdst@naver.com";
		
		
		//int idx = str.indexOf("@");//4
		result = str.substring(str.indexOf("@")+1);
		System.out.println(result);
		
		
	}

}
