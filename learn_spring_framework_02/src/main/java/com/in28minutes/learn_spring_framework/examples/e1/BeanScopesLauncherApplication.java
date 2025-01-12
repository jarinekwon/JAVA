package com.in28minutes.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//SCOPE_SINGLETONE -> 스프링 IoC 컨테이너마다 단 1개의 객체 인스턴스(DEFAULT)
//SCOPE_PROTOTYPE -> 많은 객체 인스턴스가 스프링 IoC 컨테이너마다 생성(NOT DEFAULT)
@Component
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
					(BeanScopesLauncherApplication.class)) {
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			//동일한 인스턴스 반복
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			//빈이 참조될 때마다 다른 인스턴스 생성
		} 
	}
}
 