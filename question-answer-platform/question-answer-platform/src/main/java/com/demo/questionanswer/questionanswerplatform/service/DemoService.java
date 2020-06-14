package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.DemoRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Demo;

@Service
public class DemoService implements IDemoService {

	private DemoRepository demoRepository;

	@Autowired
	public DemoService(DemoRepository theDemoRepository) {
		demoRepository = theDemoRepository;
	}

	@Override
	public List<Demo> findAll() {
		return demoRepository.findAll();
	}

}
