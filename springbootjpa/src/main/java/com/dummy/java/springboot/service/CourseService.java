package com.dummy.java.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dummy.java.springboot.course.Course;
import com.dummy.java.springboot.repository.CourseRepository;



@Service
public class CourseService {
	
	@Autowired
    private CourseRepository courseRepository;
	
	//private List<Course> courses = new ArrayList<>(Arrays.asList(new Course("spring","springcourse","desript")));
 
 public List<Course> getCourses(String topicId){
	 List<Course> courses = new ArrayList<>();
	 courseRepository.findByTopicId(topicId)
			 .forEach(courses::add);
	 
	 return courses;
 }
 
 public Course getCourse(String id) {
	 
	 Course t;
	 t = courseRepository.findById(id).get();
	 return t;
 }

public void addCourse(Course course) {
	courseRepository.save(course);
	
	// TODO Auto-generated method stub
	
	
}
public void updateCourse(Course course,String id) {
	courseRepository.save(course);
}
public void deleteCourse(String id) {
	courseRepository.deleteById(id);;
	
}

 
}
