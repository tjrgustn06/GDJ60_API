package com.iu.api3.excption;

import java.util.Random;

public class ExcptionSample1 {

	
	
	public void ex1() throws ArithmeticException,NullPointerException,Exception {
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}
	
	public void ex2() throws Exception {
		//2자리
		int num1 = 65;
		int num2 = 48;
		//int sum = num1+num2;
		int sum = num2-num1;
		if(sum<0) {
			throw new CustomException("음수는 읽을 수 없어요");
		}
		
		if(sum>99) {
			throw new CustomException("세자리수는 몰라요");
		}
		
	}

}



