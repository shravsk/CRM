import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericLib.BaseClass;
import com.crm.genericLib.CommonUtils;
import com.crm.genericLib.WebDriverCommonLib;
import com.crm.objectRepository.AddEmpPage;
import com.crm.objectRepository.AddPage;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.PimPage;
import com.crm.objectRepository.SaveAdminPage;
import com.crm.objectRepository.SavePage;
import com.crm.objectRepository.UserManagementPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class OrangeCrmTest extends BaseClass{

	CommonUtils c=new CommonUtils();
	@Test
	public void orangecrmTest() throws Throwable
	{
		ExtentTest log=extent.startTest("OrangeCrmTest");
		Properties pobj=c.getPropertiesObject();
		
		HomePage hp=PageFactory.initElements(d, HomePage.class);
		hp.navigateToPimPage();
		Reporter.log("navigate to Pim Page...",true);
		log.log(LogStatus.INFO, "navigate to PimPage..");
		PimPage pp=PageFactory.initElements(d, PimPage.class);
		pp.navigateToAddEmpPage();
		Reporter.log("navigate to AddEmp Page...",true);
		log.log(LogStatus.INFO, "navigate to AddEmp Page...");
		AddEmpPage ap=PageFactory.initElements(d, AddEmpPage.class);
		String firstname=pobj.getProperty("firstname");
		String lastname=pobj.getProperty("lastname");
		ap.navigateToSave(firstname, lastname);
		Reporter.log("navigate to Save Page...",true);
		log.log(LogStatus.INFO,"navigate to Save Page...");
		SavePage sp=PageFactory.initElements(d, SavePage.class);
		String actVal=sp.getCheckfirstname().getAttribute("value");
		Reporter.log("verifying firstname...",true);
		log.log(LogStatus.INFO, "verifying firstname...");
		Assert.assertEquals(actVal, firstname);
		String actVal1=sp.getChecklastname().getAttribute("value");
		Reporter.log("verifying lastname...",true);
		log.log(LogStatus.INFO,"verifying lastname...");
		Assert.assertEquals(actVal1, lastname);
		hp.navigateToAdminPage();
		Reporter.log("navigate to Admin Page...",true);
		log.log(LogStatus.INFO, "navigate to Admin Page...");
		AdminPage app=PageFactory.initElements(d, AdminPage.class);
		app.navigateToUserManagemntpage();
		Reporter.log("navigate to UserManagement Page...",true);
		log.log(LogStatus.INFO,"navigate to UserManagement Page...");
		UserManagementPage ump=PageFactory.initElements(d, UserManagementPage.class);
		ump.navigateToAddPage();
		Reporter.log("navigate to Add Page...",true);
		log.log(LogStatus.INFO, "navigate to UserManagement Page...");
		AddPage aap=PageFactory.initElements(d, AddPage.class);
		String username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		Reporter.log("navigate to SaveAdmin page...",true);
		log.log(LogStatus.INFO, "navigate to SaveAdmin page...");
		aap.navigateToSaveAdminPage(firstname, lastname, username, password, password);
		SaveAdminPage sap=PageFactory.initElements(d, SaveAdminPage.class);
		extent.endTest(log);
	}
}
