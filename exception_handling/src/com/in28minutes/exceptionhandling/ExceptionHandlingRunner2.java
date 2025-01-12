package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {
	
	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");		
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
			String str = null;
			str.length();
//			int[] i = {1, 2};
//			int number = i[3];
			System.out.println("Method2 Ended");			
//		} catch (Exception e) {
//			System.out.println("Matched Exception");
//			e.printStackTrace();
//		} //모든 exception들의 부모 클래스가 Exception
		} catch (NullPointerException e) {
			System.out.println("Matched NullPointerException");
			e.printStackTrace();
		} //Null 예외처리
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Matched ArrayIndexOutOfBoundsException");
//			e.printStackTrace();
//		} //배열 예외처리
	}
}
