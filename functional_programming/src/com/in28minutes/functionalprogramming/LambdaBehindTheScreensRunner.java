package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		
		return number%2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {

		return number * number;
	}
	
}

public class LambdaBehindTheScreensRunner {
	public static void main(String[] args) {
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n%2 == 1;
		
		List.of(23, 43, 34, 45, 36, 48).stream()
//			.filter(n -> n%2 == 0)
//			.filter(new EvenNumberPredicate())
			.filter(evenPredicate)
//			.map(n -> n * n)
			.map(new NumberSquareMapper())
//			.forEach(e -> System.out.println(e));
			.forEach(new SystemOutConsumer());
		
//		.filter(new EvenNumberPredicate())
//		Stream<T> filter(Predicate<? super T> predicate);
//		boolean test(T t);
		
//		.forEach(new SystemOutConsumer());
//		void forEach(Consumer<? super T> action);
//		void accept(T t);
		
//		.map(new NumberSquareMapper())
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//		R apply(T t);
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n%2 == 0;
	}
}
