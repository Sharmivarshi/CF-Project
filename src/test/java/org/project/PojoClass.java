package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="user-account")
	private WebElement acc;
	
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement clkLogin;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='dwfrm_login_login']")
	private WebElement login;
	
	@FindBy(xpath="(//button[contains(text(),'Accept all')])[1]")
	private WebElement clkCache;
	
	public WebElement getAcc() {
		return acc;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}


	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getClkCache() {
		return clkCache;
	}

}
