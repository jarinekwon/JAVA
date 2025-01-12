package com.in28minutes.loops;

public class ReverseNumber {
	public static int reverseNumber(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		int number = 123;
		System.out.println(reverseNumber(number));
	}
}
