package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		//year
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year: "+year);
		//월 month
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month: "+(month+1));
		//일
		int date = ca.get(Calendar.DATE);
		System.out.println("DATE: "+date);
		//요일
		int day = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("DAY:"+ day);
		//시
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println("HOUR:"+ hour);
		//분
		int min = ca.get(Calendar.MINUTE);
		System.out.println("MINUTE: "+min);
		//초
		int sec = ca.get(Calendar.SECOND);
		System.out.println("SECOND: "+sec);

	}

}
