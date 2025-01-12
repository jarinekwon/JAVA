package com.in28minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileToWrite = Paths.get("./resources/file_write.txt");
		
		List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		
		Files.write(pathFileToWrite, list);
	}
}
