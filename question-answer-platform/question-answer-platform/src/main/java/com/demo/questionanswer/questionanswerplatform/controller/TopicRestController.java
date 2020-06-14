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

import com.demo.questionanswer.questionanswerplatform.entity.Topic;
import com.demo.questionanswer.questionanswerplatform.service.ITopicService;

@RestController
@RequestMapping("/topic")
public class TopicRestController {

	private ITopicService topicService;

	@Autowired
	public TopicRestController(ITopicService theTopicService) {
		topicService = theTopicService;
	}

	@GetMapping("/list")
	public List<Topic> showTopic() {
		return topicService.findAll();
	}

	@GetMapping("/getTopic/{topicId}")
	public Topic getTopic(@PathVariable int topicId) {
		return topicService.findById(topicId);
	}

	@PostMapping("/add")
	public Topic addTopic(@RequestBody Topic topic) {
		topic.setId(0);
		topicService.save(topic);
		return topic;
	}

	@PutMapping("/update")
	public Topic updateTopic(@RequestBody Topic topic) {
		topicService.save(topic);
		return topic;
	}

	@DeleteMapping("/delete/{topicId}")
	public String deleteTopic(@PathVariable int topicId) {
		Topic topic = topicService.findById(topicId);
		if (topic == null)
			throw new RuntimeException("Topic not found with id: " + topicId);
		topicService.delete(topicId);
		return "Deleted topic id is: " + topicId;

	}

}
