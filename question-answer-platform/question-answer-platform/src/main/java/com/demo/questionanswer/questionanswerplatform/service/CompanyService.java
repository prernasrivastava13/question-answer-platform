package com.demo.questionanswer.questionanswerplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.questionanswer.questionanswerplatform.dao.CompanyRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Company;

@Service
public class CompanyService implements ICompanyService {

	private CompanyRepository companyRepository;

	@Autowired
	public CompanyService(CompanyRepository theCompanyRepository) {
		companyRepository = theCompanyRepository;
	}

	@Override
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	@Override
	public Company findByCompanyId(int id) {
		Optional<Company> result = companyRepository.findById(id);
		Company company = null;
		if(result.isPresent()) {
			company = result.get();
		} else {
			throw new RuntimeException("Company not foud with id: "+id);
		}
		
		return company;
	}

	@Override
	public void save(Company company) {
		companyRepository.save(company);
	}

	@Override
	public void delete(int id) {
		companyRepository.deleteById(id);
	}

}
