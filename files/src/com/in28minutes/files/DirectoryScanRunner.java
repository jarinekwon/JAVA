package com.in28minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		
		Path currentDirectory = Paths.get(".");
		
//		Files.list(currentDirectory).forEach(System.out::println);
		
//		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
//		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		
//		BiPredicate<Path, BasicFileAttributes> javaMatcher 
//		= (path, attribute) -> String.valueOf(path).contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher 
		= (path, attribute) -> attribute.isDirectory();
		
//		Files.find(currentDirectory, 4, javaMatcher).forEach(System.out::println);
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);
	}
}
