package org.pages;

import java.awt.event.KeyEvent;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addrecordscreen extends BaseClass {
	
	
	

	public Addrecordscreen(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "//*[text()='KBZPay Service Operations']")
	private WebElement kbzpayservice ;

	public void click() throws InterruptedException {

		kbzpayservice.click();


		thread();	
	}



	@FindBy(xpath = "//*[text()='Add New']")
	private WebElement addrecordbtn ;

	public void addnewclick() throws Exception {
		addrecordbtn.click();
		

		thread();
		
		zoomOut(2);
			
			PleaseSelect(driver);
			threadhalf();
			
			
			textpath("Phone Change Request");
			
			threadhalf();
			
			inputareasindex(driver, 1, "95656565");
			
			threadhalf();
		
			
			inputareasindex(driver, 2, "Customer name : Flow1");
			
			threadhalf();
			threadone();

			WebElement element = driver.findElement(By.xpath("//*[@aria-label='YYYY-MM-DD']"));

			element.click();
			threadhalf();
			DateclickOk(5);
			
			threadone();
			
 
			clickAutoCompleteByIndex(4);
			
			threadhalf();
			
			uploadfilePdf();
			
			threadhalf();
			
			radiobutton(driver, 2);
			
			threadhalf();
			
			inputareasindex(driver, 5, "S5DS6D86");
			
		
			threadhalf();
			
			clickAutoCompleteByIndex(6);
			threadhalf();
			uploadFilepng();
			
			threadhalf();
			
			clickAutoCompleteByIndex(7);
			threadhalf();
			uploadfilePdf();
			
			threadhalf();
			
			
			
			inputareasindex(driver, 9, "No reason as of now");
			
			threadhalf();
			
			clickAutoCompleteByIndex(10);
			
			threadhalf();
			
			uploadFilepng();
			
			threadhalf();
			
			inputareasindex(driver, 11, "9898989898");
			
			threadhalf();
			
			inputareasindex(driver, 12, "9898989888");
			
			threadhalf();
			

			//switchEnable(1);
			
			threadhalf();
			inputareasindex(driver, 13, "9000");
			
			threadhalf();
			
			inputareasindex(driver, 14, "ww.stax.ai");
			

			
			
			NextButton();
			
			thread();
			thread();
			
			tabb();
			tabb();
			
			
			EyeButton();

			
			
			
			
			
			
			
			
			
	
			
			
		}

	}
	
	
	

	
























