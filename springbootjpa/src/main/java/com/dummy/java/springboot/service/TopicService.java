package com.dummy.java.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dummy.java.springboot.repository.TopicRepository;
import com.dummy.java.springboot.topic.Topic;

@Service
public class TopicService {
	
	@Autowired
    private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring","springcourse","desript")));
 
 public List<Topic> getTopics(){
	 List<Topic> topics = new ArrayList<>();
	 topicRepository.findAll()
			 .forEach(topics::add);
	 return topics;
 }
 
 public Topic getTopic(String id) {
	 
	 Topic t;
	 t = topicRepository.findById(id).get();
	 return t;
 }

public void addTopic(Topic topic) {
	topicRepository.save(topic);
	
	// TODO Auto-generated method stub
	
	
}
public void updateTopic(Topic topic,String id) {
	topicRepository.save(topic);
}
public void deleteTopic(String id) {
	topicRepository.deleteById(id);;
	
}

 
}
