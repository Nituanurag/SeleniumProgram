package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepsDefinitions.LmsBase;

public class HeadingPage extends LmsBase{
	
	
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//button[4]")
	WebElement assignmentButton;
	
	
//	
	public HeadingPage(WebDriver driver)
    {
        this.driver = driver;
      
        PageFactory.initElements(driver, this);
    } 
	

	public void Clickon_Assignment_Tab() {
	
		System.out.println("hello");
		assignmentButton.click();
	}
		
//public static String manageAssignmentPage() {
//	return driver.getTitle();
//	
//}

}
