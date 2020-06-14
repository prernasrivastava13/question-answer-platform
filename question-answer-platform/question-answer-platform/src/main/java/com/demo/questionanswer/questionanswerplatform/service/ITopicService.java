package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;

import com.demo.questionanswer.questionanswerplatform.entity.Topic;

public interface ITopicService {

	public List<Topic> findAll();

	public Topic findById(int id);

	public void save(Topic topic);

	public void delete(int id);

}
