package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmpPage {

	@FindBy(id="firstName")
	WebElement firstnameEdt;
	
	@FindBy(id="lastName")
	WebElement lastnameEdt;
	
	@FindBy(id="btnSave")
	WebElement saveBtn;
	
	public void navigateToSave(String firstname,String lastname)
	{
		firstnameEdt.sendKeys(firstname);
		lastnameEdt.sendKeys(lastname);
		saveBtn.click();
	}
}
