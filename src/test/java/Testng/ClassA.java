package Testng;

import java.util.Date;

import org.Base;
import org.junit.AfterClass;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.LaunchSuite;

import com.beust.jcommander.Parameters;

public class ClassA extends Base {
	
	@BeforeClass
	public void Bc() {
		Browserlaunch("edge");

	}
	
	@AfterClass
	public void Ac() {
		driver.close();
	}
	
	@BeforeMethod
	public void Bm() {
		Date d = new Date();
		
		System.out.println("Testcase Start time :"+d);
		
	}
	
	@AfterMethod
	 public void Am() {
       Date d = new Date();
		System.out.println("Testcase End time :"+d);

	}
	
	@Test
	public void Tc1() {
		Lauchurl("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		SoftAssert a = new SoftAssert();
		
		a.assertEquals(title, title.contains("facebook"));
		

	}
	
	//@org.testng.annotations.Parameters({"email","pass"})
	//@Test(dataProvider="TestData")
	public void Tc2(String user, String pwd) {
		
		FacebookPojo f = new FacebookPojo();
		filltext(f.getTxtEmail(), user);
		
		String attribute = f.getTxtEmail().getAttribute("value");
		
		//Assert.assertEquals(f.getTxtEmail(), attribute.startsWith("Reyas"));
		filltext(f.getTxtpass(), pwd);
		
		//String attribute2 = f.getTxtpass().getAttribute("value");
		
		Assert.assertTrue(true);
		

	}
	
	@Test
	public void Tc3() {
		FacebookPojo f = new FacebookPojo();
		btnclk(f.getBtnlogin());

	}
	
	/*@DataProvider(name="TestData")
	@Test
	public Object[][] data(){
		return new Object[][] {
			{"Reyas","12345"},
			{"Rahi","54321"},
			{"Java", "09876"}
		};
	} */


}
