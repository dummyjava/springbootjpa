package com.dummy.java.springboot.topic;

public class Topic {
	
 public Topic(String id, String courseid, String description) {
		super();
		this.id = id;
		this.courseid = courseid;
		this.description = description;
	}
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
