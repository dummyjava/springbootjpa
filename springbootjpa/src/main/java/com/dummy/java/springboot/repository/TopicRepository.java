package com.dummy.java.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.dummy.java.springboot.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
     
}
