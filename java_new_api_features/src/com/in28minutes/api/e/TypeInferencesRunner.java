package com.in28minutes.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Ranga", "Ravi");
		List<String> names2 = List.of("John", "Adam");
//		List<List<String>> names = List.of(names1, names2);
		var names = List.of(names1, names2);
//		var abc = null; //var가 추론이 가능한 변수가 우측에 와야함
		
		names.stream().forEach(System.out::println);
		
		for (var i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		for (var name : names1) {
			System.out.println(name);
		}
		
//		List.of("Ranga", "Ravi").stream()
//								.filter(s -> s.length() < 5)
//								.forEach(System.out::println);
		var filter = List.of("Ranga", "Ravi").stream().filter(s -> s.length() < 5);
		filter.forEach(System.out::println);
	}
}
