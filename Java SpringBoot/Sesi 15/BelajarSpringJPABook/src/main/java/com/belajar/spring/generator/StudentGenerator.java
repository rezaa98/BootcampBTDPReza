package com.belajar.spring.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.belajar.spring.entity.Course;
import com.belajar.spring.entity.Student;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

public class StudentGenerator {

	Logger logger = Logger.getLogger(StudentGenerator.class.getName());

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public void generateStudent() {

		Student student = new Student("Bagus Oktavian", 15);
		studentRepository.save(student);

		List<Course> courses = generateCourse();
		student.getCourses().addAll(courses);
		studentRepository.save(student);

		logger.log(Level.INFO, "Courses : " + student.getCourses());
	}

	public List<Course> generateCourse() {

		List<Course> courses = new ArrayList<>();
		Course course1 = new Course("Beggining Spring Boot", 12, 1500);
		Course course2 = new Course("Spring Reactive", 8, 800);
		Course course3 = new Course("Microservices Architecture", 9, 100);
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);

		courseRepository.saveAll(courses);
		return courses;
	}
}
