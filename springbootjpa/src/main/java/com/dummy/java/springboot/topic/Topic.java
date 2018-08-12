package com.dummy.java.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
 public Topic(String id, String courseid, String description) {
		super();
		this.id = id;
		this.courseid = courseid;
		this.description = description;
	}
 
 public Topic() {
	 
 }
 @Id
 private String id;
 private String courseid;
 private String description;
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
 
}
