package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
//	//1: Object Creation
//	var game = new MarioGame();
//	var game = new SuperContraGame();
//	var game = new PacmanGame();
//	
//	//2: Object Creation + Wiring of Dependencies
//	//GamingConsole is a Dependency of GameRunner
//	var gameRunner = new GameRunner(marioGame);
//	var gameRunner = new GameRunner(game);
//	
//	gameRunner.run();
}
