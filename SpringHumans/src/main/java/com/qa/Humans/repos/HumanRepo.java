package com.qa.Humans.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.Humans.Domain.Human;

@Repository// indicates that HumanRepo will be used as a repository for our database
public interface HumanRepo extends JpaRepository<Human,Integer> { //hashmap clarify what this is for
	
	

}
