package com.qa.puppies.rest;
//controller handles everything related to the front end
//Puppies are created via postman (as we dont have a front end)

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.puppies.domain.Puppy;

@RestController// enables request handling
public class PuppyController {

	//PURELY FOR DEMO PURPOSES (AS WE DONT HAVE A DB YET)
	private List<Puppy> puppies = new ArrayList();
	
	
	@GetMapping("/hello") // listen for a request at /hello...localhost:8080/hello
	public String hello() {// what's inside the GetMapping must match the name of the method
		return"Hello, World!"; // sends response "Hello, World"
	}
	
	@PostMapping("/Create")// triggered by a POST request to /create
	//public Puppy createPuppy(@RequestBody Puppy newPuppy) { // a puppy object in the request body + response body
	public ResponseEntity<Puppy> createPuppy(@RequestBody Puppy newPuppy){
	this.puppies.add(newPuppy);
		//return this.puppies.get(this.puppies.size() -1);//returning the last element in the list to show the created puppy in POSTMAN.
		Puppy responseBody = this.puppies.get(this.puppies.size()-1);
		return new ResponseEntity<Puppy>(responseBody,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAll") // necessary to show the puppy that was created (on the front end, or POSTMAN) to the user.
	public List<Puppy>getPuppies(){
		return this.puppies;
	}
	//
	@GetMapping("/get/{id]")// getpupy with id of {id}
	public Puppy getPuppy(@PathVariable Integer id) {
		return this.puppies.get(id);
	}
	
	//replacing a puppy// UPDATE
	@PutMapping("/replace/{id}")
	public Puppy replacePuppy(@PathVariable Integer id, @RequestBody Puppy newPuppy) {//@RequestBody will create a new puppy object(internally an object mapper converts the jason code back to java)
		
		System.out.println("Replacing puppy with id " +id +"with "+ newPuppy);
		return null;
	}
	
	//Deleting a puppy// DELETE
	@DeleteMapping("/remove/{id}")
	public void removePuppy(@PathVariable Integer id) {
		System.out.println("Removing puppy with id" + id);
	}
//create read update delete
}
	

