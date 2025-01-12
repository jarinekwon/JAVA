package com.in28minutes.oops.level2;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanUp();
}
