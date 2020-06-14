package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;

import com.demo.questionanswer.questionanswerplatform.entity.Company;

public interface ICompanyService {

	public List<Company> findAll();

	public Company findByCompanyId(int id);

	public void save(Company company);

	public void delete(int id);

}
