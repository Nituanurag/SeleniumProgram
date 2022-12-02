package stepsDefinitions;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HeadingPage;
import pageObjects.HomePage;

public class StepsDefinitions extends LmsBase {
	 HeadingPage hp = new HeadingPage(driver);
	
	 
	@Before
//	public void setUp() {
//		hp = new HeadingPage(driver);
//	}
	
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() throws Exception {
		System.out.println("hello");
	    //driver.getTitle();
	    //Thread.sleep(1000);
	  
	   
	}

	@When("User click on manage assignment page")
	public void user_click_on_manage_assignment_page() {
		hp.Clickon_Assignment_Tab();
		System.out.println("hello");
	}
//
//	@Then("User should see a heading with text {string} on the page")
//	public void user_should_see_a_heading_with_text_on_the_page(String string) throws Exception {
//		System.out.println("hello");
//		  hp.teardown();
//	}

}
