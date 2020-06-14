package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.TopicRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Topic;

@Service
public class TopicService implements ITopicService {

	private TopicRepository topicRepository;

	@Autowired
	public TopicService(TopicRepository theTopicRepository) {
		topicRepository = theTopicRepository;
	}

	@Override
	public List<Topic> findAll() {
		return topicRepository.findAll();
	}

	@Override
	public Topic findById(int id) {
		Optional<Topic> result = topicRepository.findById(id);
		Topic topic = null;
		if (result.isPresent()) {
			topic = result.get();
		} else {
			throw new RuntimeException("topic not found with id: " + id);
		}

		return topic;
	}

	@Override
	public void save(Topic topic) {
		topicRepository.save(topic);
	}

	@Override
	public void delete(int id) {
		topicRepository.deleteById(id);
	}

}
