package com.in28minutes.tips.enums;

import java.util.Arrays;

//enum Season {
////	WINTER, SPRING, SUMMER, FALL;
//	SUMMER(1), WINTER(2), FALL(3), SPRING(4);
//	
//	private int value;
//	
//	private Season(int value) {
//		this.value = value;
//	}
//
//	public int getValue() {
//		return value;
//	}
//}

public class EnumRunner {

	public static void main(String[] args) {
		
//		Season season = "Garbage";
		Season season = Season.WINTER;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(season1.ordinal()); //순서를 나타내는 메소드(index와 순서는 같음)
		System.out.println(season1.SPRING.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(season1.SPRING.getValue());
		
	}
}
