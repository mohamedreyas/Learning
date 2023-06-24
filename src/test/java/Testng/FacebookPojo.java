package Testng;

import org.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends Base{
	
	public FacebookPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	
	public WebElement getTxtpass() {
		return txtpass;
	}

	
	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
