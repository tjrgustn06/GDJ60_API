package com.iu.api1.Strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Strart");
		WeatherData weatherData = new WeatherData();
		WeatherDTO[] datas = weatherData.init();

//		WeatherController weatherController = new WeatherController();
//		weatherController.start();

		new WeatherController().start();

		System.out.println("Finish");

	}

}
