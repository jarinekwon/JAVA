package com.in28minutes.learn_spring_boot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
//		return Arrays.asList(new Course(1, "Learn Microservice", "in28minutes"),
//				new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
		
		return repository.findAll();
	}
	
	//get - Retrieve information
//	@GetMapping("/courses/1")
	@GetMapping("/courses/{id}")
	public Course getCoursesDetails(@PathVariable long id) {
//		return new Course(1, "Learn Microservice1", "in28minutes");
		
		Optional<Course> course = repository.findById(id);
		
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		
		return course.get();
	}
	
	//post - Create a new resource
	@PostMapping("/courses") 
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}
	
	//put - Update/Replace a resource
	@PutMapping("/courses/{id}") 
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}
	
	//delete - Delete a resource
	@DeleteMapping("/courses/{id}") 
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
}











