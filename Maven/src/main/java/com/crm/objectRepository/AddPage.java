package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPage {

	@FindBy(id="systemUser_employeeName_empName")
	WebElement empname;
	
	@FindBy(id="systemUser_userName")
	WebElement usernameBtn;
	
	@FindBy(id="systemUser_password")
	WebElement passwordBtn;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpwdBtn;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	public void navigateToSaveAdminPage(String firstname,String lastname,String username,String password,String confirmpwd)
	{
		empname.sendKeys(firstname);
		empname.sendKeys(" "+lastname);
		usernameBtn.sendKeys(username);
		passwordBtn.sendKeys(password);
		confirmpwdBtn.sendKeys(confirmpwd);
		save.click();
	}
	
}
