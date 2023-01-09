package com.iu.api1.Strings.ex3;

public class WeatherData {
	
	
	
	private String data;
	
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60, Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	
	//메서드명은 init
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
	public  WeatherDTO [] init() {
		String [] datas = this.data.split(",");
		WeatherDTO[] weathers = new WeatherDTO[datas.length/4];
		//int idx = 0;
		for(int i=0; i<datas.length; i=i+4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(datas[i]);
			weatherDTO.setGion(Integer.parseInt(datas[i+1]));
			weatherDTO.setStatus(datas[i+2]);
			weatherDTO.setMise(Integer.parseInt(datas[i+3]));
			weathers[i/4] = weatherDTO;
//			weathers[idx] = weatherDTO;
//			idx++;
		}
		 return weathers;
	
	}
	

}
