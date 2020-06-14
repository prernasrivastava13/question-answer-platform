package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;

import com.demo.questionanswer.questionanswerplatform.entity.Tag;

public interface ITagService {

	public List<Tag> findAll();

	public Tag findById(int id);

	public void save(Tag tag);

	public void delete(int id);

}
