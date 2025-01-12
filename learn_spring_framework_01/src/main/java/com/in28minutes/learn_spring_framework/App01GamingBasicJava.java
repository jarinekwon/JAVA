package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//1: Object Creation
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		
		//2: Object Creation + Wiring of Dependencies
		// GamingConsole is a Dependency of GameRunner
//		var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
		
	}
}
