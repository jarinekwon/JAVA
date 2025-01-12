package com.in28minutes.tips.access.package2;

import com.in28minutes.tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
//		exampleClass.protectedMethod();
//		exampleClass.privateMethod();
//		exampleClass.defaultMethod();
	}
}
