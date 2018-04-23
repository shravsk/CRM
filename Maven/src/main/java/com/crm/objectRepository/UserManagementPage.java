package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagementPage {

	@FindBy(id="btnAdd")
	WebElement addBtn;
	
	public void navigateToAddPage()
	{
		addBtn.click();
	}
}
