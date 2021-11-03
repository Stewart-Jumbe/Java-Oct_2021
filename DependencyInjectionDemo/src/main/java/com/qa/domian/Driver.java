package com.qa.domian;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// a bean is a managed object
@Component//components are created as singletons ie we dont need to instatiate them in order for them to exist
@Scope("prototype") // this allows for the creation addition objects of the driver class
public class Driver {

	public Driver() {
		System.out.println("Driver Created");
	}
}
