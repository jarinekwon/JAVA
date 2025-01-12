package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Ranga");
		names.add("Ravi");
		names.add("John");
		
		List<String> copyOfNames = List.copyOf(names);
		//List, Set, Map에서 copyOf를 쓰면 수정 불가능
		
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
	}
}
