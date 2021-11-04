package com.qa.Humans.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.qa.Humans.Domain.Human;
import com.qa.Humans.repos.HumanRepo;
@Primary //
@Service
public class HumanServiceDB implements HumanService{

	private HumanRepo repo;//decalring variable that will be used to refer back to our repo
	
	//injecting HumanRepo into HumanServiceDB, once done we can use repo methods from JPA
	public HumanServiceDB(HumanRepo repo) {
		super();
		this.repo = repo;
	}
	
	//Create
	@Override
	public Human createHuman(Human newHuman) {
		return this.repo.save(newHuman);
	}

	//Read
	@Override
	public Human getHuman(Integer id) {
	//return this.repo.findById(id).orElseThrow(()->new EntityNotFoundException("No puppy found with id: " +id));
	Optional<Human> humanOptional = this.repo.findById(id);
	
	if (humanOptional.isPresent()) {
		Human foundHuman = humanOptional.get();
		return foundHuman; // return the found human if object is present
	}else {
		throw new EntityNotFoundException("No human found with id "+ id);
	}
	
	}
	
	//Update
	@Override
	public Human replaceHuman(Integer id, Human newHuman) {
		Human existingHuman = this.getHuman(id); // finding the human human we want to update
		
		existingHuman.setAgeOfBirth(newHuman.getAgeOfBirth());
		existingHuman.setBionicTech(newHuman.isBionicTech());
		existingHuman.setName(newHuman.getName());
		existingHuman.setPlanetOfOrgin(newHuman.getPlanetOfOrgin() );
		existingHuman.setUpdateVersion(newHuman.getUpdateVersion());
		existingHuman.setImplantedAbility(newHuman.getImplantedAbility());
		return this.repo.save(existingHuman);
	}

	//Read
	@Override
	public List<Human> getHumans() {
		return this.repo.findAll();
	}
	
	//Delete
	@Override
	public boolean removeHuman(Integer id) {
		this.repo.deleteById(id);//returns null
		return !this.repo.existsById(id); //checking if deleted id doesn't exist, response true
	}

	
	
	
	
}
