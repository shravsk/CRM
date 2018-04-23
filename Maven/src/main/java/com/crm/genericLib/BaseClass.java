package com.crm.genericLib;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectRepository.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
	public ExtentReports extent;
	public static WebDriver d;
	CommonUtils c=new CommonUtils();
	@BeforeSuite
	public void configBS()
	{
		extent=new ExtentReports("./test-output/report.html");
		extent.loadConfig(new File("./extent-config.xml"));
	}
	@BeforeClass
	public void configBC() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/sravya/automation/Maven/src/main/resources/chromedriver");
		//d=new ChromeDriver();
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Properties pobj=c.getPropertiesObject();
		String url=pobj.getProperty("url");
		d.get(url);
		Reporter.log("launching the browser......",true);
	}
	
	@BeforeMethod
	public void configBM() throws Throwable
	{
		LoginPage lp=PageFactory.initElements(d, LoginPage.class);
		Properties pobj=c.getPropertiesObject();
		String loginusername=pobj.getProperty("loginusername");
		String loginpassword=pobj.getProperty("loginpassword");
		lp.login(loginusername, loginpassword);
		Reporter.log("navigate to Home Page......",true);
	}
	
	@AfterMethod
	public void configAM()
	{
		
	}
	
	@AfterClass
	public void configAC()
	{
		
	}
	@AfterSuite
	public void configAS()
	{
		extent.flush();
		extent.close();
	}
}
