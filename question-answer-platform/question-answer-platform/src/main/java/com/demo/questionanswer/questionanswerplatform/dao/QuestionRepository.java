package com.demo.questionanswer.questionanswerplatform.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.questionanswer.questionanswerplatform.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
