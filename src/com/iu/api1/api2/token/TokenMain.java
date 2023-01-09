package com.iu.api1.api2.token;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {

		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";

		StringTokenizer st = new StringTokenizer(nations, ",");

		String[] n = nations.split(",");

		for (int i = 0; i < n.length; i++) {
			NAtionDTO nationDTO = new NAtionDTO();
			nationDTO.setName(n[i]);
			nationDTO.setCity(n[i]);
		}
		while (st.hasMoreTokens()) {
			NAtionDTO nationDTO = new NAtionDTO();

			String t1 = st.nextToken();
			System.out.println(t1);
			String t2 = st.nextToken();
			System.out.println(t2);

		}
	}
}

