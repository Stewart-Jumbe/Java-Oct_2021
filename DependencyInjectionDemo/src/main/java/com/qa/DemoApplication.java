package com.qa;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.domian.Car;
import com.qa.domian.Driver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context =SpringApplication.run(DemoApplication.class, args);//what is the context, context is the container
		context.getBean(Car.class);//getting the car class and creating it
		//Driver as a prototype will exist when we create an instance of it, much like standard instantiation
		Driver dave = context.getBean(Driver.class);
		Driver lee = context.getBean(Driver.class);
		
	}

	
}
