package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimBtn;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminBtn;
	
	public void navigateToPimPage()
	{
		pimBtn.click();
	}
	public void navigateToAdminPage()
	{
		adminBtn.click();
	}
}
