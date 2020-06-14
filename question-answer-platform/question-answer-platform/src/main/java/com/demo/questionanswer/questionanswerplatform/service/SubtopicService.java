package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.SubtopicRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Subtopic;
import com.demo.questionanswer.questionanswerplatform.entity.Topic;

@Service
public class SubtopicService implements ISubtopicService {

	private SubtopicRepository subtopicRepository;

	@Autowired
	public SubtopicService(SubtopicRepository theSubtopicRepository) {
		subtopicRepository = theSubtopicRepository;
	}

	@Override
	public List<Subtopic> findAll() {
		return subtopicRepository.findAll();
	}

	@Override
	public Subtopic findById(int id) {
		Optional<Subtopic> result = subtopicRepository.findById(id);
		Subtopic subtopic = null;
		if (result.isPresent()) {
			subtopic = result.get();
		} else {
			throw new RuntimeException("topic not found with id: " + id);
		}

		return subtopic;
	}

	@Override
	public void save(Subtopic subtopic) {
		subtopicRepository.save(subtopic);
	}

	@Override
	public void delete(int id) {
		subtopicRepository.deleteById(id);
	}

}
