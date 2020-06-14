package com.demo.questionanswer.questionanswerplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.questionanswer.questionanswerplatform.entity.Tag;
import com.demo.questionanswer.questionanswerplatform.service.ITagService;

@RestController
@RequestMapping("/tag")
public class TagRestController {

	private ITagService tagService;

	public TagRestController(ITagService theTagService) {
		tagService = theTagService;
	}

	@GetMapping("/list")
	public List<Tag> getTagList() {
		return tagService.findAll();
	}

	@GetMapping("/getTag/{tagId}")
	public Tag getTag(@PathVariable int tagId) {
		return tagService.findById(tagId);
	}

	@PostMapping("/add")
	public Tag addTag(@RequestBody Tag tag) {
		tag.setId(0);
		tagService.save(tag);
		return tag;
	}

	@PutMapping("/update")
	public Tag updateTag(@RequestBody Tag tag) {
		tagService.save(tag);
		return tag;
	}

	@DeleteMapping("/delete/{tagId}")
	public String deleteTag(@PathVariable int tagId) {
		Tag tag = tagService.findById(tagId);
		if (tag == null)
			throw new RuntimeException("Deleted tag id is: " + tagId);
		tagService.delete(tagId);
		return "Deleted tagId is: " + tagId;
	}

}
