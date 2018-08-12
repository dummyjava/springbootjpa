package com.dummy.java.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dummy.java.springboot.course.Course;



public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topic);
}
