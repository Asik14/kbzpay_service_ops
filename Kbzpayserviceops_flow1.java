package Kbzpay_Service;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.pages.Addrecordscreen;
import org.pages.Editscreen;
import org.pages.LoginPage;
import org.pages.Stagemovementt;
import org.testng.annotations.Test;

public class Kbzpayserviceops_flow1 extends BaseClass {


	LoginPage lo ;
	Addrecordscreen add;
	Editscreen edit ;
	Stagemovementt stage;
	
	
	

	@Test(priority = -10)
	public void BrowserSetup() {
		browserLaunch("chrome");
		urlLaunch("https://staging.flow.stax.run/#/login");
		maximize();  

		lo = new LoginPage(driver);

	}


	@Test(priority = 1)
	public void loginscreen() throws InterruptedException {
		thread();
		waits(3000); 

		Thread.sleep(4000);
		waitWithTimeout(driver, 20);

		lo.entermail("BranchTeam_KBZPay@gmail.com");
		threadhalf();
		lo.enterpassword("98DjpLo4WVsdI5HILPVI");
		lo.clicklogin();

	}


	@Test(priority = 2)
	public void addrecordScreen() throws Exception {
		thread();
		
		add = new Addrecordscreen(driver);
		add.click();
		add.addnewrecord();	
		
	}
	
	
	@Test(priority = 3)
		public void editaction() throws InterruptedException, AWTException {
		edit = new Editscreen(driver);
		edit.editscreen();
		
			
			
		}
	
	
	  @Test(priority = 4)
	    public void stagemoveTest() throws InterruptedException, AWTException {
	        stage = new Stagemovementt(driver);
	        stage.stagemove();
	    }
	}



















