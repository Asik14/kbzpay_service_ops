package org.VueJs;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class Sa_DailyReport extends BaseClass {

	
	
	@Test
	private void tc01() throws IOException, AWTException, InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://staging.flow.stax.run/#/login");
		maximize();
	}				

	@AfterClass
	private void tc02() throws InterruptedException, AWTException, IOException {
	    // Wait for the page to load
	    waits(2000);

	    // Correct path to your Excel file
	    String filePath = "C:\\Users\\jainu\\OneDrive\\Desktop\\Testdata.xlsx";
	    String username = ExcelUtils.getCellData("C:\\Users\\jainu\\OneDrive\\Desktop\\Testdata.xlsx", "Sheet1", 3, 1);

	    // Locate and use the username input field
	    WebElement user = driver.findElement(By.xpath("//*[@aria-label='Enter registered email']"));

	    // Wait for visibility (your wait method must be defined correctly)
	    wait(10); // Make sure this uses WebDriverWait internally or replace with explicit wait

	    user.click();
	    Thread.sleep(1000); // Small pause before sending keys
	    user.sendKeys(username);
	}
		
	
	
	
	
}
