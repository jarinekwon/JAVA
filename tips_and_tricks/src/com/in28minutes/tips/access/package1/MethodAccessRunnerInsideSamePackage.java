package com.in28minutes.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.protectedMethod();
//		exampleClass.privateMethod();
		exampleClass.defaultMethod();
	}
}
