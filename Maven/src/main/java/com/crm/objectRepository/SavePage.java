package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavePage {

	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	private WebElement checkfirstname;
	
	@FindBy(id="personal_txtEmpLastName")
	private WebElement checklastname;

	public WebElement getCheckfirstname() {
		return checkfirstname;
	}

	public WebElement getChecklastname() {
		return checklastname;
	}

	
	
}
