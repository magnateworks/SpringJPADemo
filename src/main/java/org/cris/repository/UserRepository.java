package org.cris.repository;

import java.util.List;

import org.cris.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByFirstName(String firstName); 
	List<User> findByFirstNameAndLastName(String firstName, String lastName); 
	
}
