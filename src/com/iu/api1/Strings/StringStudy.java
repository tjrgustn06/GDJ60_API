package com.iu.api1.Strings;

import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abcakwjehaskjndn";
		
		System.out.println(str2);
		
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		char ch = str2.charAt(0);
		
		
	int num = str2.indexOf('k',5);
		System.out.println("Num :"+num);

	}

}
