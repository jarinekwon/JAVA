package com.in28minutes.tips.enums;

public enum Season {
//	WINTER, SPRING, SUMMER, FALL;
	SUMMER(1), WINTER(2), FALL(3), SPRING(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}