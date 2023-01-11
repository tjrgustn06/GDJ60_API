package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		birth.set(1991, 5, 5);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		//현재 시간을 밀리세컨즈로 변환(MS)
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		long b = birth.getTimeInMillis();
		n = n - b;
		
		n = n/(1000*60*60*24);
		n=n/365;
		
		System.out.println("N: "+n);
		System.out.println("S: "+s);
		
		System.out.println(sample.getTime());
		System.out.println(now.getTime());
		System.out.println(birth.getTime());

	}

}
