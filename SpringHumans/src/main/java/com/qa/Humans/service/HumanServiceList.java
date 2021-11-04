package com.qa.Humans.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.Humans.Domain.Human;

@Service// shows intent, says its a bean and this is where our business logic goes
public class HumanServiceList implements HumanService {

	
	private List<Human> humansList = new ArrayList<>();

	
	@Override
	public Human createHuman(Human newHuman) {
		this.humansList.add(newHuman);
		return this.humansList.get(this.humansList.size()-1);
	}

	@Override
	public List<Human> getHumans() {
		return this.humansList;
	}
	
	@Override
	public Human getHuman(Integer id) {
	
		return this.humansList.get(id);
	}
	

	@Override
	public Human replaceHuman(Integer id, Human newHuman) {
		return this.humansList.set(id, newHuman);
	}

	@Override
	public boolean removeHuman(Integer id) {
		Human toRemove = this.humansList.get(id); //creating 
		this.humansList.remove(id.intValue()); //id.intValue is neccessary because id is an Integer object, if we used int id there would be no need for this
		return !this.humansList.contains(toRemove);
	}

	


	
}
