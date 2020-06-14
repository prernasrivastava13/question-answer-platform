package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import com.demo.questionanswer.questionanswerplatform.entity.Question;

public interface IQuestionService {

	public List<Question> findAll();

	public Question findByQuestionId(int id);

	public void save(Question question);

	public void delete(int id);

}
