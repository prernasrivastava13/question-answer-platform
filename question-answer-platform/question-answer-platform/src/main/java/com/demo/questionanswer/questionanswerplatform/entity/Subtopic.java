package com.demo.questionanswer.questionanswerplatform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subtopic")
public class Subtopic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "subtopic_name")
	private String subtopicName;

	@Column(name = "topic")
	private String topic;

	public Subtopic() {
	}

	public Subtopic(String subtopicName, String topic) {
		this.subtopicName = subtopicName;
		this.topic = topic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubtopicName() {
		return subtopicName;
	}

	public void setSubtopicName(String subtopicName) {
		this.subtopicName = subtopicName;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", subtopicName=" + subtopicName + ", topic=" + topic + "]";
	}

}
