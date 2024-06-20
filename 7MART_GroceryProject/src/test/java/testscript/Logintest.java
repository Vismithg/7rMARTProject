package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class Logintest extends BaseClass {
	/*@DataProvider(name="credentials")
	public Object[][] testData() 
	{// data provider 
		Object[][] input = new Object[2][2]; 
		input[0][0] = "admin"; 
		input[0][1] = "admin"; 
		input[1][0] = "admin@123";
	    input[1][1] = "admin123"; 
	    return input;
	}*/

	@Test(groups= {"smoketest"}/*dataProvider = "credentials"*/)
	@Parameters("browser")
	public void verifyTheUserAbleToLoginValidCredentials(String browser/*String usernames, String passwords*/) throws IOException {
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "Logincredentials");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "Logincredentials");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterpassword(passwordvalue);
		loginpage.submit();
		boolean homepageisloaded = loginpage.dashboard();
		assertTrue(homepageisloaded, "homepageisnotloaded");

	}

//invalid credential
	@Test
	public void verifyTheUserAbleToLoginInValidCredentials() throws IOException {
		String usernamevalues = ExcelUtilities.getStringData(2, 0, "Logincredentials");
		String passwordvalues = ExcelUtilities.getStringData(2, 1, "Logincredentials");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalues);
		loginpage.enterpassword(passwordvalues);
		loginpage.submit();
		boolean usernameAndPasswordvalid = loginpage.alert();
		assertTrue(usernameAndPasswordvalid, "usernameAndPasswordinvalid");
	}

	@Test(retryAnalyzer =retry.Retry.class)
	public void verifyTheUserAbleToLoginInValidCredentials1() throws IOException {
		String usernamevaluess = ExcelUtilities.getStringData(3, 0, "Logincredentials");
		String passwordvaluess = ExcelUtilities.getStringData(3, 1, "Logincredentials");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevaluess);
		loginpage.enterpassword(passwordvaluess);
		loginpage.submit();
		boolean usernameAndPasswordvalid = loginpage.alert();
		assertTrue(usernameAndPasswordvalid, "usernameinvalid");
	}


	@Test
	public void verifyTheUserAbleToLoginInValidCredentials2() throws IOException {
		String usernamevaluess = ExcelUtilities.getStringData(4, 0, "Logincredentials");
		String passwordvaluess = ExcelUtilities.getStringData(4, 1, "Logincredentials");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevaluess);
		loginpage.enterpassword(passwordvaluess);
		loginpage.submit();
		boolean usernameAndPasswordvalid = loginpage.alert();
		assertTrue(usernameAndPasswordvalid, "usernameAndpwdinvalid");
	}
}
