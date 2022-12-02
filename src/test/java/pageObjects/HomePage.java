package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import stepsDefinitions.LmsBase;


public class HomePage extends LmsBase{
	
	By Assignment = By.xpath("//span[contains(text(), 'Assignment')]");
//	@FindBy(xpath = "//button[@routerlink='/assignment']")
	WebElement assignmentButton;
//	
	public String getAssignmentButtonText() {
		return this.assignmentButton.getText();
	}
}
