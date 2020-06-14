package com.demo.questionanswer.questionanswerplatform.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.questionanswer.questionanswerplatform.entity.Subtopic;
import com.demo.questionanswer.questionanswerplatform.service.ISubtopicService;

@RestController
@RequestMapping("/subtopic")
public class SubtopicRestController {

	private ISubtopicService subtopicService;

	public SubtopicRestController(ISubtopicService theSubtopicService) {
		subtopicService = theSubtopicService;
	}

	@GetMapping("/list")
	public List<Subtopic> getSubtopicList() {
		return subtopicService.findAll();
	}

	@GetMapping("/getSubtopic/{subtopicId}")
	public Subtopic getSubtopic(@PathVariable int subtopicId) {
		return subtopicService.findById(subtopicId);
	}

	@PostMapping("/add")
	public Subtopic addSubtopic(@RequestBody Subtopic subtopic) {
		subtopic.setId(0);
		subtopicService.save(subtopic);
		return subtopic;
	}

	@PutMapping("/update")
	public Subtopic updateSubtopic(@RequestBody Subtopic subtopic) {
		subtopicService.save(subtopic);
		return subtopic;
	}

	@DeleteMapping("/delete/{subtopicId}")
	public String deleteSubtopic(@PathVariable int subtopicId) {
		Subtopic subtopic = subtopicService.findById(subtopicId);

		if (subtopic == null)
			throw new RuntimeException("Subtopic not found with id: " + subtopicId);
		subtopicService.delete(subtopicId);
		return "Deleted subtopic with id: " + subtopicId;
	}

}
