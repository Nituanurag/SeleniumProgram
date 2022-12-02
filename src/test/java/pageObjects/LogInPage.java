package pageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepsDefinitions.LmsBase;


public class LogInPage extends LmsBase {


		/*
		 * Login Page Actions should go here....
		 */
		@FindBy(id = "username")WebElement userName;
		
		@FindBy(xpath = "//div//input[@id = 'password']")
		WebElement userPassword;
		
		@FindBy(id = "errormessage")
		WebElement loginAlert;
		
		@FindBy(xpath = "//span[contains(text(), 'Login')]")WebElement loginBtn;
		
		@FindBy(xpath = "//span[contains(text(), 'LMS - Learning Management System')]")
		WebElement loginDisplay;
		
		public void enter_UserName(String uName) {
			
			userPassword.clear();
			userName.click();
			userName.sendKeys(uName);
		}
		public void enter_Password(String pwd) throws InterruptedException {
			PageFactory.initElements(driver, this);
			userPassword.click();
			userPassword.sendKeys(pwd);
		}
		public void clickLoginButton() {
			loginBtn.click();
		}
		public String locateLogin() {
			return driver.getTitle();
		}
		public String getLoginAlert() {
			return loginAlert.getText();
		}
		public void clearUserName() {
			userName.clear();
		}
		public void clearPasswd() {
			userPassword.clear();
		}
		public String LocateHomePage() {
			return loginDisplay.getText();
		}

//	@FindBy(id = "username")
//	WebElement userName;
//
//	@FindBy(xpath = "//div//input[@id = 'password']")
//	WebElement userPassword;
//
//	@FindBy(id = "errormessage")
//	WebElement loginAlert;
//
//	@FindBy(xpath = "//span[contains(text(), 'Login')]")
//	WebElement loginBtn;
//
//	@FindBy(xpath = "//span[contains(text(), 'LMS - Learning Management System')]")
//	WebElement loginDisplay;

	
	
//	public LogInPage() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void enter_UserName(String uName) throws InterruptedException {
//		PageFactory.initElements(driver, this);
//		//userPassword.clear();
//		userName.click();
//		userName.sendKeys(uName);
//		Thread.sleep(100);
//	}
//
//	public void enter_Password(String pwd) throws InterruptedException {
//		PageFactory.initElements(driver, this);
//		//userName.clear();
//		userPassword.click();
//		userPassword.sendKeys(pwd);
//		Thread.sleep(100);
//	}
//
//	public void clickLoginButton() {
//		loginBtn.click();
//	}
//
//	public String locateLogin() {
//		return driver.getTitle();
//	}
//
//	public String getLoginAlert() {
//		return loginAlert.getText();
//	}
//	public String LocateHomePage() {
//		return loginDisplay.getText();
//	}


}
