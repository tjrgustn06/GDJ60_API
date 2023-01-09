package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private static final int WeatherDTO = 0;
	//3번
	//search
	//배열을받고, 키보드로부터 검색할 도시명을 입력 받음 도시 대소문자 상관없이 일치
	//찾은 DTO를 리턴,없으면 null;리턴
	public void saarch() {
		System.out.println("지역을 선택해주세요");
	}
	

	
	//4번
	//add메서드
	//배열을받고, 키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열을 리턴
	
//	public WeatherDTO [] add(WeatherDTO[] weather) {

//	WeatherDTO weatherDTO = new WeatherDTO();
//	System.out.println("City 추가");
//	String city = sc.next();
//	System.out.println("gion 추가");
//	String gion = sc.next();
//	System.out.println("Status 추가");
//	String status = sc.next();
//	System.out.println("mise 추가");
//	String mise = sc.next();
//	
//	WeatherDTO[] newweather = new WeatherDTO[weather.length + 1];
//	for (int i=0; i<weather.length+1; i++) {
//		newweather[i] = weather[i];
//			
//	}
//	return weather;
//	}
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = null;
	
	public void add(WeatherDTO [] weatherDtos) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(sc.nextInt());
		System.out.println("날씨를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 입력하세요");
		weatherDTO.setMise(sc.nextInt());
		WeatherDTO[] newInfo = new WeatherDTO[weatherDtos.length];
		
		for(int i=0; i<weatherDtos.length;i++) {
			newInfo[i] = weatherDtos[i];
		}
		newInfo[weatherDtos.length] = weatherDTO;
		return;
	}
	
	
	//5번
	//remove
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴
	
	
	
}
