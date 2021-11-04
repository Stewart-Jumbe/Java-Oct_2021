//The controller talks to the front end

package com.qa.Humans.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Humans.Domain.Human;
import com.qa.Humans.service.HumanService;

@RestController // enables request handling

public class HumanController {

	//Creating private list because we're not implementing the database yet
	private HumanService service;
	
	//injecting HumanService into Human Controller through the use of a constructor
	@Autowired // this annotation isnt needed because we only have 1 constructor
	public HumanController(HumanService service) {
		super();
		this.service = service;
	}


	//checking that spring is working
	@GetMapping("/Alright") // listen for a request at /Alright
	public String greetYou() {
		return "Alright mate"; // sends response
	}
	
	
	//Creating a human
	@PostMapping("/create-human") // triggering a post request
	public ResponseEntity<Human> createHuman(@RequestBody Human newHuman) { //inserting the human object in the request body
		Human responseBody= this.service.createHuman(newHuman);
		return new ResponseEntity<Human>(responseBody, HttpStatus.CREATED);
	}
		
//	public Human createHuman(@RequestBody Human newHuman) { //inserting the human object in the request body
//		this.humans.add(newHuman);
//		System.out.println(newHuman.toString());
//		return this.humans.get(this.humans.size()-1);//returning the most recently added
		
	
	//Reponse Entities will be needed for everything except Get
	//Response has a head, body and code
	//Create, Read, Update, Delete
	
	//READING
	//returning a list of everything in humans list to the console
	@GetMapping("/getAll")
	public ResponseEntity<List<Human>> getHumans(){
		return ResponseEntity.ok(this.service.getHumans());//unneccessary due to this being a get request
	}
	
//	public List<Human> getHumans(){
//		return this.humans;
//	}
	
	
	
	
	//Getting a specific index in the list
	@GetMapping("/get/{id}") // Getting human with id of {id}
	public Human getHuman(@PathVariable Integer id) {// @PathVariable gets the index position from the URL e.g localhost/8080/get/01
		return this.service.getHuman(id);
	}
	
	
//	public Human getHuman(@PathVariable Integer id) {// @PathVariable gets the index position from the URL e.g localhost/8080/get/01
//		return this.humans.get(id);
//	}

		
	//Update
	@PutMapping("/replace/{id}")
	
	public ResponseEntity<Human> replaceHuman(@PathVariable Integer id, @RequestBody Human newHuman) {//@RequestBody will create a new human object(internally an object mapper converts the jason code back to java)
		System.out.println("Replacing human with id " +id +"with "+ newHuman);
		//Human mycreation = this.humans.set(id, newHuman);
		Human mycreation = this.service.replaceHuman(id, newHuman);// changing the references so that we're refereing to humanservices (aliased as service) and the methods in there
		return new ResponseEntity<Human>(mycreation, HttpStatus.ACCEPTED);
	}
//	public Human replaceHuman(@PathVariable Integer id, @RequestBody Human newHuman) {//@RequestBody will create a new human object(internally an object mapper converts the jason code back to java)
//		System.out.println("Replacing human with id " +id +"with "+ newHuman);
//		this.humans.set(id, newHuman);
//		return null;
//	}
	
	//DELETE
	@DeleteMapping("/remove/{id}")
	
	public ResponseEntity<?> removeHuman(@PathVariable Integer id) {
		System.out.println("Removing human with id "+ id);
		//this.humans.remove(id.intValue());
		this.service.removeHuman(id.intValue());
		return new ResponseEntity<>("Removed"+id, HttpStatus.NO_CONTENT);
	}
//	public Human removeHuman(@PathVariable Integer id) {
//		System.out.println("Removing human with id "+ id);
//		this.humans.remove(id);
//		return null;
//	}
	
	
	
	
	
	
	
	
	
	
}



