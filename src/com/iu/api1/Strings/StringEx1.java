package com.iu.api1.Strings;

public class StringEx1 {

	public static void main(String[] args) {
		String phone = "010-1234-5678";

		boolean check = true;
		int idx = 0;
		String str = new String("010-1234-5678");

		while (check) {
			idx = phone.indexOf('-', idx);
			if (idx != -1) {
				System.out.println("Idx: " + idx);
				idx++;
			} else {
				check = false;
				break;
			}
		}

	}

}
