package com.iu.api2.util;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		//1천원 로또 1-45 번호6개를 핸덤하게 추출 중복X
		
//		int num = random.nextInt(9)+1;
//		System.out.println(num);
		
		for(int i=0; i<6; i++) {
			int num = random.nextInt(45)+1;
		}
		

	}

}
