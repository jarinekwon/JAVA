package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy //빈의 초기화가 시작시에 이루어지지 않음(누군가 빈을 사용할 때마다 이루어짐)
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApplication.class)) {
			
			System.out.println("Initialization of context completed");
			
			context.getBean(ClassB.class).doSomething();;
		} 
		
		
	}
}
