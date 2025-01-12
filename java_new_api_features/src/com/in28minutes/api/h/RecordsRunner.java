package com.in28minutes.api.h;

public class RecordsRunner {
	
	record Person(String name, String email, String PhoneNumber) {
//		Person(String name, String email, String PhoneNumber) {
//			if (name == null) {
//				throw new IllegalArgumentException("name is null");
//			}
//			this.name = name;
//			this.email = email;
//			this.PhoneNumber = PhoneNumber;
//		}
		
//		int number; //인스턴스 변수(비정적 필드)는 허용되지 않음
		static int number; // 정적필드는 허용
		
		Person {
//			static int number;
			if (name == null) {
				throw new IllegalArgumentException("name is null");
			}
		}
		
		public String name() { //인스턴스 메소드는 가능(public일 경우)
			System.out.println("Do Something");
			
			return name;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Ranga", "ranga@in28minutes.com", "123-456-7890");
		Person person1 = new Person("Ranga", "ranga@in28minutes.com", "123-456-7890");
		Person person2 = new Person("Ranga1", "ranga@in28minutes.com", "123-456-7890");
		
		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));
		System.out.println(person.name());
	}
}
