package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[21];
			// java 7부터는 자동으로 scanner.close();를 해줄 수 있어서 적어줄 필요가 없음
		} 
	}
}