package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}
	
//	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	} // Setter보단 Constructor를 더 선호

	@Override
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
//@ComponentScan("com.in28minutes.learn_spring_framework.examples.a1")
@ComponentScan //경로를 설정하지 않으면 현재 클래스 패키지에 적용
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
					(DepInjectionLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
			
		} 
	}
}
