package org.pages;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Editscreen extends BaseClass{


	public Editscreen(WebDriver driver) throws InterruptedException, AWTException {

		PageFactory.initElements(driver, this);

	}
	
	
	
	
	public void editscreen() throws InterruptedException, AWTException {
	
		
			
		threadone();
		
		History();
		
		threadone();


		EditButton();

		threadhalf();

		clearAndTypeAutoCompleteByIndex(1, "9656589898");	

	
		threadhalf();
		
		clearAndTypeAutoCompleteByIndex(2, "Flow1");	


		clickAutoCompleteByIndex(4);

		uploadFilepng();

		
		thread();
		
		TabIndex(driver, 14);
		
		threadhalf();
		
		textpath("INR");
		threadhalf();
		clearAndTypeAutoCompleteByIndex(13, "568900");	


		threadone();

		NextButton();
		
		thread();


		threadone();
		
		Texthome("Assign to TSO");

		threadhalf();


		radiobutton(driver, 1);

		threadhalf();


		radiobutton(driver, 3);		

		threadhalf();


		radiobutton(driver, 5);
		
		threadone();
		
		
		typing("Testing - Assign to TSO");
		
		threadone();
		
		NextButton();
		
		thread();
		
		
		
		
		














	}








}













