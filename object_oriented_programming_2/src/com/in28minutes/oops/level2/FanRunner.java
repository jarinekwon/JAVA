package com.in28minutes.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufaturer 1", 0.34567, "GREEN");
//		fan.isOn(true);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
