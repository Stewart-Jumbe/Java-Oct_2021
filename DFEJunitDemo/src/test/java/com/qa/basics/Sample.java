package com.qa.basics;
import org.junit.Test;

public class Sample {
	
	//ctrl + f11 : run last command
	
	//Junit is our testing framework, its open source
	// An error is a human failure or defect in the code
	//a failure is a defect that means that the expected result is not obtained
	
	
	//We can use different annotations based on the Junit version
	//Junit 5 			- Junit 4
	//@BeforeAll		-@BeforeClass - Can think of this as the environment set up (e.g access to a database), only created once
	//@AfterAll			-@AfterClass  -  
	//@BeforeEach		-@BeforeEach  -Created at each instance (i.e more than once)
	//@Test				-@Test
	//@Disable			-@Ignore // Can be used to ignore a section of code so that its not tested
	
	
	
	@BeforeClass
	public static void init() {
	System.out.println("Start of test");
	}
	
	@Before
	// Calculator cal = new calculator()
	public void setup() {
		System.out.println("Ran @before every test");
	}
	
	@Test
	public void someTest() {
	System.out.println("this is a test");	
	}

	
	@After
	public void close() {
	//db.close();//closes down connection to database	
	}
	
	@AfterClass
	public static void tearDown() {
// scanner.close();
	}
	}
}
