package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PimPage {

	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmpBtn;
	
	public void navigateToAddEmpPage()
	{
		addEmpBtn.click();
	}
}
