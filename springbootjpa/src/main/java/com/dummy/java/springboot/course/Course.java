package com.dummy.java.springboot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.dummy.java.springboot.topic.Topic;

@Entity
public class Course {
	
 public Course(String id, String courseid, String description,String topicId) {
		super();
		this.id = id;
		this.courseid = courseid;
		this.description = description;
		this.setTopic(new Topic(topicId,"",""));
	}
 
 public Course() {
	 
 }
 @Id
 private String id;
 private String courseid;
 private String description;
 @ManyToOne
 private Topic topic;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCourseid() {
	return courseid;
}
public void setCourseid(String courseid) {
	this.courseid = courseid;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public Topic getTopic() {
	return topic;
}

public void setTopic(Topic topic) {
	this.topic = topic;
}
 
}
