package io.corp.pivotal.repositories;


import io.corp.pivotal.domain.Company;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long>{

}
