package com.iu.api1.Wrappers.ex1;

public class JuminCheck2 {

	// check
	// 주민번호를 받아서
	// 991224-1234567
	// 맨끝자리는 체크용 번호로 뺌
	// 9 8 0 7 2 4 - 1 2 3 4 5 6
	// 2 3 4 5 6 7 8 9 2 3 4 5
	// 18+ 24+ 0+ 35+ 12+ 28+ 8+ 18+ 6+ 12+ 20+ 30
	// 합이 약:122 합을 11로 나누어서 나머지를 구함
	// 122 /11 = 몫:11, 나머지는1)예시
	// 나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	// 11-1=10
	// 11로 뺀 결과값이 두자리면
	// 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	// 10/10 몫:1,나머지:0 0==체크용 번호랑 확인
	// 정상적인 주민번호다 틀린 번호다
	// 18+3+030+35+8+2+24+32+5=157
	public void check(String jumin) {
		// jumin.charAt(0)
		jumin = "980724-1234567";
	int num = 2;
		int sum = 0;
//	for (int i = 0; i < jumin.length() - 1; i++) {
//		if (i == 6) {
//				continue;
//			}
//			sum = sum + Integer.parseInt(jumin.substring(i, i + 1)) * num;
//			num++;
//			if (num == 10) {
//				num = 2;
//			}
//
//		}
//		int result = 11 - sum % 11;
//
//		if (result > 9) {
//			result = result % 10;
//		}
//		int flag = Integer.parseInt(jumin.substring(13));
//
//		if (result == flag) {
//			System.out.println("정상입니다");
//		} else {
//			System.out.println("비정상입니다");
//		}
		for (int i = 0; i < jumin.length() - 1; i++) {
			if (i == 6) {
				continue;
			}
			sum = sum + Integer.parseInt(String.valueOf(jumin.charAt(i))) * num;
			num++;
			if (num == 10) {
				num = 2;
			}
			int result = 11 - sum % 11;

			if (result > 9) {
				result = result % 10;
			}
			int flag = Integer.parseInt(jumin.substring(13));

			if (result == flag) {
				System.out.println("정상입니다");
			} else {
				System.out.println("비정상입니다");
			}

		}
	}
}
