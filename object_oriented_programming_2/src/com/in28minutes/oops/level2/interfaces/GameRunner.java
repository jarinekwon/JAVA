package com.in28minutes.oops.level2.interfaces;

public interface GameRunner {
	public static void main(String[] args) {
		GamingConsole[] games = {new MarioGame(), new ChessGame()};
		
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		
//		MarioGame game = new MarioGame();
//		ChessGame game = new ChessGame();
//		GamingConsole game = new MarioGame();
//		GamingConsole game = new ChessGame();
//		game.up();
//		game.down();
//		game.left();
//		game.right();
	}
}
