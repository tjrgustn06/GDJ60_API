package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class StudentView {
	
	public void view(StudentDTO studentDTO) {
		System.out.println("이름:"+studentDTO.getName());
		System.out.println("번호:"+studentDTO.getNum());
		System.out.println("국어:"+studentDTO.getKor());
		System.out.println("영어:"+studentDTO.getEng());
		System.out.println("수학:"+studentDTO.getMath());
		System.out.println("총점:"+studentDTO.getTotal());
		System.out.println("평균:"+studentDTO.getAvg());
	}
	
	public void view(String msg ) {
		System.out.println(msg);
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(StudentDTO studentDTO:ar) {
			this.view(studentDTO);
		}
	}
}
