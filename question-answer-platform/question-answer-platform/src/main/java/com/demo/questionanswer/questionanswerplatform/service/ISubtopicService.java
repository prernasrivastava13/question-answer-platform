package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;

import com.demo.questionanswer.questionanswerplatform.entity.Subtopic;

public interface ISubtopicService {

	public List<Subtopic> findAll();

	public Subtopic findById(int id);

	public void save(Subtopic subtopic);

	public void delete(int id);

}
