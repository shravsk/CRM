package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement usermngmnt;
	
	public void navigateToUserManagemntpage()
	{
		usermngmnt.click();
	}
}