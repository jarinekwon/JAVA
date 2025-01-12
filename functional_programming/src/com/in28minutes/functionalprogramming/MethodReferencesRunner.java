package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static boolean isEven(Integer number) {
		return number % 2 ==0;
	}
	
	public static void main(String[] args) {
		
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
//			.map(s -> s.length())
			.map(String::length)
//			.forEach(s -> System.out.println(s));
//			.forEach(s -> MethodReferencesRunner.print(s));
//			.forEach(System.out::println);
			.forEach(MethodReferencesRunner::print);
		
		Integer max = List.of(23, 45, 67, 34).stream()
//						.filter(n -> n % 2 == 0)
						.filter(MethodReferencesRunner::isEven)
//						.max((n1, n2) -> Integer.compare(n1, n2))
						.max(Integer::compare)
						.orElse(0);
		
		System.out.println(max);
	}
}
