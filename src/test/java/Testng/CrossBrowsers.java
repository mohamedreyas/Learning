package Testng;

import org.Base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;


public class CrossBrowsers extends Base {
	
	@Parameters("browser")
	@Test
	public void CrossBrowserTest(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")) {
			Browserlaunch("chrome");
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
		Browserlaunch("edge");
		

	}
		else 
			System.out.println("Firefox Broswer Launched");
		
		Lauchurl("https://www.facebook.com/");
	}
	
	
	
	
}
