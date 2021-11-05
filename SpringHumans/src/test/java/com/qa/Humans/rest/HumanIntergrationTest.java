package com.qa.Humans.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//importing methods, I would have to include MockMvcResultMachers.post (line 39) instead of just post(etc)
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Humans.Domain.Human;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // boots the entire context and uses a random port to prevent conflict
@AutoConfigureMockMvc // creates the MockMVC object for sending our requests
@Sql(scripts = { "classpath:human-schema.sql",
"classpath:human-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
//runs schema and data file before each test
//if you see error like 'x is not a column' check you're using '' for strings

public class HumanIntergrationTest {
	
@Autowired
private MockMvc mvc;// we're using MockMvc to perform the integration testing using Junit


@Autowired // i'm doing an injection without a constructor
private ObjectMapper mapper; //the EXACT SAME mapper that spring uses to convert objects to and from JSON

@Test
void testCreateHuman() throws Exception {
	Human requestBody = new Human("Drukill", 2077, "Crypton", false, 1.25,
	"Regrowth");
	
	String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody) ; //converting line 35 into JSON using mapper 
	
	
	RequestBuilder request = post("/create-human")
			.contentType(MediaType.APPLICATION_JSON)
			.content(requestBodyAsJSON); // sets up the test request
	
	Human responseBody = new Human(2,"Drukill", 2077, "Crypton", false, 1.25, // creating what the expected value should be
	"Regrowth");
	String reponseBodyAsJSON = this.mapper.writeValueAsString(responseBody);
	
	ResultMatcher checkStatus = status().isCreated();// check the status code is 201
	ResultMatcher checkBody = content().json(reponseBodyAsJSON);// check the body matches the example
	
	
	this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);//performs request and checks the
	//response
	
	
	}
	
@Test
void testGetAll() throws Exception{
	
	RequestBuilder request = get("/getAll");
	
	ResultMatcher checkStatus = status().isOk();
	//5646, 'true', 'Duplication', 'SyGonRo', 'Mexatucan256', 2.0
	Human human = new Human(1,"SyGonRo", 5646, "Mexatucan256", true, 2.0,"Duplication"); // creating what the expected value in the response should be
			
	List<Human> humanList = List.of(human); // converting created human into a list
	String responseBody = this.mapper.writeValueAsString(humanList);
	ResultMatcher checkBody = content().json(responseBody);
	
	this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);		


}






}
