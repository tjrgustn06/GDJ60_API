package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WeatherController {

	//start
	//1.날씨정보 초기화
	// 초기화가 완료 되었습니다.
	//2.전국날씨 정보
	//3.지역날씨 검색
	//도시정보가 없으면 없습니다 있으면 날씨정보를 찍어준다
	//4.지역날씨 추가
	//5.지역날씨 삭제	
	//6.종 		료

	
		

		void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		WeatherInput weatherInput = new WeatherInput();
		WeatherData weatherData = new WeatherData();
		WeatherView weatherView = new WeatherView();
		WeatherDTO [] weatherDTOs =null;
		
		while(check) {
		System.out.println("2.전국날씨 정보");
		System.out.println("3.지역날씨 검색");
		System.out.println("4.지역날씨 추가");
		System.out.println("5.지역날씨 삭제");
		System.out.println("6.종료");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			weatherDTOs = weatherData.init();
			System.out.println("초기화가 완료 되었습니다");			
			break;
		case 2:						
			weatherView.view(weatherDTOs);
			break;
		case 3:
			System.out.println("지역날씨 검색");
			break;
		case 4:
			System.out.println("지역날씨 추가");
			weatherInput.add(weatherDTOs);
			break;
		case 5:
			System.out.println("지역날씨 삭제");
			break;
		default:
			System.out.println("종료합니다");
			check = false;
		}
		}
	}
	
}
