package com.in28minutes.multithreading;


class Task1 extends Thread {
	@Override
	public void run( ) {
		System.out.print("\nTask1 Started");		
		for (int i = 101; i < 199; i++) {
			System.out.println(i + " ");
		}		
		System.out.print("\nTask1 Done");		
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");		
		for (int i = 201; i < 299; i++) {
			System.out.println(i + " ");
		}
		System.out.print("\nTask2 Done");
	}
	
}

public class ThreadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		//Task1
//		for (int i = 101; i < 199; i++) {
//			System.out.println(i + " ");
//		}
//		System.out.print("\nTask1 done");
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1); //우선 순위 정하기
//		task1.run();
		task1.start(); //병렬적으로 작동하게 됨
		
		//Task2
//		for (int i = 201; i < 299; i++) {
//			System.out.println(i + " ");
//		}
//		System.out.print("\nTask2 Done");
		System.out.print("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start(); //병렬적으로 작동
		
		//wait for task1 to complete
		task1.join();
		task2Thread.join();
		
		//Task3
		System.out.print("\nTask3 Kicked Off");		
		for (int i = 301; i < 399; i++) {
			System.out.println(i + " ");
		}	
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
	}
}
