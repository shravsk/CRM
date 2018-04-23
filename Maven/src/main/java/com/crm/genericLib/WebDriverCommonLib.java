package com.crm.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {
	WebDriver d;
	public void waitForElement(WebElement element)
	{
		int wait=0;
		while(wait<40)
		{
			try{
				element.click();
				break;
			}
			catch(Throwable t)
			{
				try{
					Thread.sleep(1000);
					wait++;
				}
				catch(InterruptedException e)
				{
					
				}
			}
		}
	}
	
	public void waitForpageLoad()
	{
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void mouseMove(WebElement element)
	{
		Actions act=new Actions(BaseClass.d);
		act.moveToElement(element).perform();
	}
	
	
}
