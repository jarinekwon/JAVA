package com.in28minutes.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
//		Map<Character, LongAdder> occurances = new Hashtable<>();
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap();
		
		String str = "ABCD ABCD ABCD";
		
		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
			/*
			LongAdder longAdder = occurances.get(character);
			
			if (longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment(); //정수를 사용했다면 ++를 해주어야하지만 LongAdder는 자동 연산 가능
			occurances.put(character, longAdder);
			*/
		}
		System.out.println(occurances);
	}
}
