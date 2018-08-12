package com.dummy.java.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
 public Topic(String id, String topic, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
	}
 
 public Topic() {
	 
 }
 @Id
 private String id;
 private String topic;
 private String description;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTopic() {
	return topic;
}
public void setTopicid(String topic) {
	this.topic = topic;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
}
