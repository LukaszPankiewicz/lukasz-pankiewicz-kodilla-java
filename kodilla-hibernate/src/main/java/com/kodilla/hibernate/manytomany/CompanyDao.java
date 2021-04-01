package com.kodilla.hibernate.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface CompanyDao extends CrudRepository<Company, Integer> {
}
