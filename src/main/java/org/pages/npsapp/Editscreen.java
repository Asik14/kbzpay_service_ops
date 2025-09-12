package org.pages.npsapp;

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

		clearAndTypeAutoCompleteByIndex(3, "Flow 1 - Kbz");

		threadhalf();

		clickAutoCompleteByIndex(4);

		uploadFilepng();


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













