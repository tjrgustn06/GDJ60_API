package com.iu.api1.object;

public class ObjectStudy {

	public static void main(String[] args) {
		//객체 생성 공식
		Object object = new Object();
		
		//멈버 사용(접근)
		// 참조변수명.변수명 , 참조변수명.메서등명()
		int result = object.hashCode();
		System.out.println(result);
		
		String a = object.toString();
		System.out.println(a);
		System.out.println(object); // object.toString() 를 호출하게 되어있음
		
		Child child = new Child();
		child.toString();
		
		Object obj = new Object();
		System.out.println(object == obj);
		boolean check = object.equals(obj);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		
		Object o = child; //다형성
		
	

	}

}
