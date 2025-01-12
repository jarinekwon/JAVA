package com.in28minutes.api.d;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner {
	
	
	public static void main(String[] args) {
		System.out.println(" ".isBlank());
		System.out.println(" LR ".strip());
		System.out.println(" LR ".stripLeading());
		System.out.println(" LR ".stripTrailing());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		System.out.println(" L R ".strip().replace(" ", "@"));
		System.out.println(" L R ".stripLeading().replace(" ", "@"));
		System.out.println(" L R ".stripTrailing().replace(" ", "@"));
		
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
		
		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s. My age is %d".formatted("Ranga", 25));
		
//		String str = null;
//		System.out.println(str.isBlank()); //str이 null이라 호출할 수 없다고 오류메시지
		SampleClass sampleClass = new SampleClass();
		System.out.println(sampleClass.str.isBlank()); //sample.str이 null이라 호출할 수 없다고 오류메시지
		
		
	}
}
