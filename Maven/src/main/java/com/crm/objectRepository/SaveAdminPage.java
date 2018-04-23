package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveAdminPage {

	@FindBy(id="searchSystemUser_userName")
	WebElement search;
	
	public void navigateToSearchPage(String username)
	{
		search.sendKeys(username);
	}
}
