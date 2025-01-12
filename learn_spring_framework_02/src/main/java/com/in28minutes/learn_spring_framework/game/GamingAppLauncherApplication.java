package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
//public class App03GamingSpringBeans {
public class GamingAppLauncherApplication {

//	@Bean
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Parmeter: " + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
//					(GamingConfiguration.class)) {
					(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		} 
	}
}
