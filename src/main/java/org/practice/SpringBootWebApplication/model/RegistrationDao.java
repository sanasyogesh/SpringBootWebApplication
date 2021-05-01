package org.practice.SpringBootWebApplication.model;

import org.springframework.data.repository.CrudRepository;

public interface RegistrationDao extends CrudRepository<UserDetails, Integer>{
	
}
