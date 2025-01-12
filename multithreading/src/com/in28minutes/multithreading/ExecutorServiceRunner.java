package com.in28minutes.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	@Override
	public void run( ) {
		System.out.print("\nTask " + number + " Started");		
		for (int i = number * 100; i < number * 100 + 99; i++) {
			System.out.println(i + " ");
		}		
		System.out.print("\nTask " + number + " Done");		
	}
}

public class ExecutorServiceRunner {
	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		executorService.execute(new Task1());
//		executorService.execute(new Thread(new Task2()));
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));

		/*
		//Task3
		System.out.print("\nTask3 Kicked Off");		
		for (int i = 301; i < 399; i++) {
			System.out.println(i + " ");
		}	
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
		*/
		executorService.shutdown();
	}
}
