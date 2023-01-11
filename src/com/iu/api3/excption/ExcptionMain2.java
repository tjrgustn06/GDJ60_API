package com.iu.api3.excption;

public class ExcptionMain2 {

	public static void main(String[] args) {
		
		ExcptionSample1 e1 = new ExcptionSample1();
		ExcptionSample2 e2 = new ExcptionSample2();
	
				
		try {
			e1.ex2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료 합니다");
	}

}
