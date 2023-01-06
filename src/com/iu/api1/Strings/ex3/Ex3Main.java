package com.iu.api1.Strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Strart");
		WeatherData weatherData = new WeatherData();
		WeatherDTO [] datas = weatherData.init();
		
		for(int i=0; i<datas.length; i++) {
		
			System.out.print(datas[i].getCity());
			System.out.print(datas[i].getStatus());
		}
		
		
		System.out.println("Finish");

	}

}
