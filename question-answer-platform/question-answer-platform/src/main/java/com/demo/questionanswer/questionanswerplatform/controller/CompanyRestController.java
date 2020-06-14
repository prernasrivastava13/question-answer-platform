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

import com.demo.questionanswer.questionanswerplatform.entity.Company;
import com.demo.questionanswer.questionanswerplatform.service.ICompanyService;

@RestController
@RequestMapping("/company")
public class CompanyRestController {

	private ICompanyService companyService;

	public CompanyRestController(ICompanyService theCompanyService) {
		companyService = theCompanyService;
	}

	@GetMapping("/list")
	public List<Company> getCompanyList() {
		return companyService.findAll();
	}

	@GetMapping("/getCompany/{companyId}")
	public Company getCompany(@PathVariable int companyId) {
		return companyService.findByCompanyId(companyId);
	}

	@PostMapping("/add")
	public Company addCompany(@RequestBody Company company) {
		company.setCompanyId(0);
		companyService.save(company);
		return company;
	}

	@PutMapping("/update")
	public Company updateCompany(@RequestBody Company company) {
		companyService.save(company);
		return company;
	}

	@DeleteMapping("/delete/{companyId}")
	public String deleteCompany(@PathVariable int companyId) {
		Company company = companyService.findByCompanyId(companyId);

		// throw exception if null
		if (company == null) {
			throw new RuntimeException("Company not found:" + companyId);
		}
		companyService.delete(companyId);
		return "Deleted company id: " + companyId;
	}

}
