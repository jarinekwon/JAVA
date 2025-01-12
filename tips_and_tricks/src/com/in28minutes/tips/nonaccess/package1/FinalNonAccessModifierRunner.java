package com.in28minutes.tips.nonaccess.package1;

final class FinalClass {
	
}

//class SomeClass extends FinalClass {
//}

class SomeClass {
	public void doSomething() {
//	final public void doSomething() {
//	public void doSomethingElse(final int arg) {
//		arg = 6;
	}
}

class ExtendingClass extends SomeClass {
	@Override
	public void doSomething() {
		
	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		int i = 5;
//		final int i = 5;
		
//		final int i;
//		i = 5;
		
		i = 7;
	}
}

