package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="txtUsername")
	WebElement usrnmEdt;
	
	@FindBy(id="txtPassword")
	WebElement pwdEdt;
	
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	public void login(String username,String password)
	{
		usrnmEdt.sendKeys(username);
		pwdEdt.sendKeys(password);
		loginBtn.click();
	}
}
