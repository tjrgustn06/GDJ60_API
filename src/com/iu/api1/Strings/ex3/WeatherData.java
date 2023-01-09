package com.iu.api1.Strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	
	
	
	private String data;
	private int i;
	
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60, Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	
	//메서드명은 init
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
//init 
//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
//public WeatherDTO [] init() {
//	String [] datas = this.data.split(",");
//	WeatherDTO [] wethers = new WeatherDTO[datas.length/4];
//	//int idx=0;
//	for(int i=0;i<datas.length;i++) {
//		WeatherDTO weatherDTO = new WeatherDTO();
//		weatherDTO.setCity(datas[i]);
//		weatherDTO.setGion(Integer.parseInt(datas[++i]));
//		weatherDTO.setStatus(datas[++i]);
//		weatherDTO.setMise(Integer.parseInt(datas[++i]));
//		wethers[i/4] =weatherDTO;
//		//wethers[idx]=weatherDTO;
//		//idx++;
//	}
//	return weathers;
//}
	public WeatherDTO [] init() {
		StringTokenizer st = new StringTokenizer(this.data,",");
		WeatherDTO [] weathers = new WeatherDTO[st.countTokens()/4];
		int i=0;
		while(st.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(st.nextToken());
			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
			weatherDTO.setStatus(st.nextToken());
			weatherDTO.setMise(st.countTokens());		
			weathers[i] = weatherDTO;
			i++;
			
		}
		return weathers;
	}
	

}
