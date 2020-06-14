package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.QuestionRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Question;

@Service
public class QuestionService implements IQuestionService {

	private QuestionRepository questionRepository;

	@Autowired
	QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> findAll() {
		List<Question> questionList = questionRepository.findAll();
		return questionList;
	}

	@Override
	public Question findByQuestionId(int id) {
		Optional<Question> question = questionRepository.findById(id);
		if (question.isPresent())
			return question.get();
		else
			throw new RuntimeException("Question not found with id: " + id);
	}

	@Override
	public void save(Question question) {
		questionRepository.save(question);
	}

	@Override
	public void delete(int id) {
		questionRepository.deleteById(id);
	}

}
