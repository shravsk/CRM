package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	public void search()
	{
		searchBtn.click();
	}
}
