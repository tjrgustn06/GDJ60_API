package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();

		// 1천원 로또 1-45 번호6개를 핸덤하게 추출 중복X
		
		//2.Set
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<6) {
			hs.add(random.nextInt(45)+1);
		}
		System.out.println(hs);

//		System.out.println(num);

//		for (int i = 0; i < 6; i++) {
//			int num = random.nextInt(45) + 1;
//			
//		}
		//1.배열 선언
//		int [] nums = new int [6];
//		
//		for(int i =0; i<nums.length; i++) {
//			
//			nums[i] = random.nextInt(45)+1;
//				for(int j=0; j<i; j++) {
//				if(nums[i]==nums[j]) {
//					i--;
//					break;
//				}
//			}
//						
//		}
//			for(int i =0; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		
//			}
		
			//ArrayList
//			ArrayList<Integer> ar = new ArrayList<>();
//			while(ar.size()<6) {
//				int n = random.nextInt(45) + 1;
//				boolean check = true;
//				for(int i=0; i<ar.size(); i++) {
//					if(n!=ar.get(i)) {
//						check = false;
//						break;
//					}
//				}
//				if(check) {
//					ar.add(n);
//				}
//				for(int i =0; i<ar.size(); i++) {
//				
//				System.out.println(ar.get(i));
//			}
//		}
	
}
}