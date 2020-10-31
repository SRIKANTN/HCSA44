package Com_ActiTime_Test;

import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Page.actiTIMEEnterTimeTrackPage;
import Com_ActiTime_Page.actiTIMELoginPage;

public class validLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void validLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		// verify the login page title
		lp.verifyTitle(lgTitle);
		//Enter valid user name
		lp.enterUserName(un);
		//enter the valid password
		lp.enterPassword(pw);
		//click on login button
		lp.clickOnLoginButton();
		//Verify Enter time track page title
		lp.verifyTitle(hpTitle);
		//click on logout button
		hp.clickOnLogoutButton();
		// verify the login page title
		lp.verifyTitle(lgTitle);
	}

}
