package com.dummy.java.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dummy.java.springboot.topic.Topic;

@Service
public class TopicService {
 private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring","springcourse","desript")));
 
 public List<Topic> getTopics(){
	 return topics;
 }
 
 public Topic getTopic(String id) {
	 return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
 }

public void addTopic(Topic topic) {
	topics.add(topic);
	// TODO Auto-generated method stub
	
	
}
public void updateTopic(Topic topic,String id) {
	for(int i =0; i< topics.size(); i++) {
		Topic t= topics.get(i);
		if(t.getId().equals(id)) {
		  topics.set(i,topic);
		}
	}
	
}
public void deleteTopic(String id) {
	
topics.removeIf(s -> s.getId().equals(id));
	
}

 
}
