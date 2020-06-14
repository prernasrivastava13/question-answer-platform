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

import com.demo.questionanswer.questionanswerplatform.entity.Question;
import com.demo.questionanswer.questionanswerplatform.service.IQuestionService;

@RestController
@RequestMapping("/question")
public class QuestionRestController {
	private IQuestionService questionService;

	public QuestionRestController(IQuestionService questionService) {
		this.questionService = questionService;
	}

	@GetMapping("/list")
	public List<Question> getQuestionList() {
		return questionService.findAll();
	}

	@GetMapping("/getQuestion/{id}")
	public Question getQuestion(@PathVariable int id) {
		return questionService.findByQuestionId(id);
	}

	@PostMapping("/add")
	public Question addQuestion(@RequestBody Question question) {
		question.setQuestionId(0);
		questionService.save(question);
		return question;
	}

	@PutMapping("/update")
	public void updateQuestion(@RequestBody Question question) {
		questionService.save(question);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteQuestion(@PathVariable int id) {
		questionService.delete(id);
	}

}
