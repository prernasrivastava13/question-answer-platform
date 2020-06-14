package com.demo.questionanswer.questionanswerplatform.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.questionanswer.questionanswerplatform.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
