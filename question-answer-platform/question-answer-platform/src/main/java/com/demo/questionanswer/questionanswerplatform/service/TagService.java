package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.TagRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Tag;

@Service
public class TagService implements ITagService {

	public TagRepository tagRepository;

	public TagService(TagRepository theTagRepository) {
		tagRepository = theTagRepository;
	}

	@Override
	public List<Tag> findAll() {
		return tagRepository.findAll();
	}

	@Override
	public Tag findById(int id) {
		Optional<Tag> result = tagRepository.findById(id);
		Tag tag = null;
		if (result.isPresent()) {
			tag = result.get();
		} else {
			throw new RuntimeException("Tag not found with id: " + id);
		}
		return tag;
	}

	@Override
	public void save(Tag tag) {
		tagRepository.save(tag);
	}

	@Override
	public void delete(int id) {
		tagRepository.deleteById(id);
	}

}
