package com.iu.api1.Wrappers;

public class Wrappers1 {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		String n1 ="1";
		Integer int1 = new Integer(n1);
		
		int num1 = Integer.parseInt(n1);
		System.out.println(num1*2);
		
		n1 ="15.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*1.2);
		
		
		

	}

}
