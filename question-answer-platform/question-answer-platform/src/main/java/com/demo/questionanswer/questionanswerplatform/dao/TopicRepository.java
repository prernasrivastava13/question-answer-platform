package com.demo.questionanswer.questionanswerplatform.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.questionanswer.questionanswerplatform.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

}
