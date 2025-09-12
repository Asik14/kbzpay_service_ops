package org.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	
	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@aria-label='Enter registered email']")
	private WebElement emailfield;
	
	
	
	@FindBy(xpath = "//flt-semantics[@aria-label='Enter Password']//input[@data-semantics-role='text-field']")
	private WebElement passwordfield;
	
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement clickloginbtn;
	
	
	
	
	
	public void entermail(String mail) {
		emailfield.click();
		
		emailfield.sendKeys(mail);
		
	}
	
	public void enterpassword(String pass) {
		passwordfield.click();
		passwordfield.sendKeys(pass);
		
		
	}
	
	
	public void clicklogin() {
		clickloginbtn.click();

		
		
	}

	}
	
		
	






