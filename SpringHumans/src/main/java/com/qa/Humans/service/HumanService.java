package com.qa.Humans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.Humans.Domain.Human;

//Contain the CRUD functionality
public interface HumanService {
	
	Human createHuman(Human newHuman);
	
	List<Human> getHumans();
	
	Human getHuman(Integer id);
	
	Human replaceHuman(Integer id, Human newHuman);
	
	boolean removeHuman(Integer id);

}
