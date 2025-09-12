package org.pages;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Stagemovementt extends BaseClass {





	public Stagemovementt (WebDriver driver) {


		PageFactory.initElements(driver, this);
	}



	public void stagemove() throws InterruptedException, AWTException {
		thread();
		performLogout();
		threadone();
		performLogin("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");
		thread();
		textpath("Select");
		threadone();
		TabIndex(driver, 6);
		threadhalf();
		textpath("Pull");


		threadone();

		tabb();
		tabb();

		Texthome("Marked for Correction");

		threadone();

		typing("Testing - Mark for correction");

		threadhalf();

		NextButton();

		thread();

		performLogout();

		threadone();

		performLogin("BranchTeam_KBZPay@gmail.com", "98DjpLo4WVsdI5HILPVI");

		thread();

		tabb();
		tabb();

		Texthome("Application Corrected");

		threadhalf();

		clearAndTypeAutoCompleteByIndex(5, "PA896PRT");

		threadone();

		clickAutoCompleteByIndex(8);

		threadhalf();

		uploadfilePdf();

		threadhalf();
		
		clearAndTypeAutoCompleteByIndex(12, "9898989898");

		threadhalf();

		clearAndTypeAutoCompleteByIndex(13, "56000");

		threadhalf();

		NextButton();

		thread();

		performLogout();

		threadone();

		performLogin("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");

		thread();
		textpath("Select");
		threadone();
		TabIndex(driver, 6);
		threadhalf();
		textpath("Pull");

		threadone();

		tabb();
		tabb();

		threedot3();

		threadone();
		Texthome("Need more info");

		threadhalf();

		typing("Testing - Need more info");

		threadhalf();

		NextButton();

		thread();

		performLogout();

		threadone();

		performLogin("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");


		thread();

		tabb();
		tabb();

		Texthome("Update");

		clickAutoCompleteByIndex(1);

		threadhalf();

		uploadfilePdf();

		inputareasindex(driver, 2, "Testing - Update");

		threadhalf();

		NextButton();


		thread();

		performLogout();

		threadone();

		performLogin("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");

		thread();
		textpath("Select");
		threadone();
		TabIndex(driver, 6);
		threadhalf();
		textpath("Pull");

		threadone();

		tabb();
		tabb();	      
		
		Texthome("Resolve");
		
		threadhalf();
		
		typing("Testing - Resolve");
		
		threadhalf();
		
		NextButton();
		
		thread();

		performLogout();

		threadone();

		performLogin("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");


		thread();

		tabb();
		tabb();
		
		Texthome("Reopen");
		
		threadhalf();
		
		typing("Testing - Reopen");
		
		

		NextButton();
		
		thread();

		performLogout();

		threadone();

		performLogin("TSO_KBZPay@gmail.com", "i00TLMvg~OWa3wW@xCE7");

		thread();
		textpath("Select");
		threadone();
		TabIndex(driver, 6);
		threadhalf();
		textpath("Pull");

		threadone();

		tabb();
		tabb();	      
		
		Texthome("Process");
		
		threadhalf();
		
		typing("testing - process");
		
		threadhalf();
		NextButton();


		thread();

		performLogout();

		threadone();

		performLogin("closeloopteam@gmail.com", "Nw5ZQMJNx9uN85AJb0n0");


		thread();

		tabb();
		tabb();
		
		Texthome("Close");
		
		threadhalf();
		
		typing("Testing - Closing");
		
		NextButton();
		
		thread();
		
		tabb();
		tabb();
		
		EyeButton();
		
		threadone();
		
		History();

	}
}












