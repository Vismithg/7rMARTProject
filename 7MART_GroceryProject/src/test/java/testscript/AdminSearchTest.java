package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserSearch;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminSearchTest extends BaseClass{
  @Test
  public void findUser() throws IOException 
  {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  String UserNames = "Vismii";
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  AdminUserSearch AdminUser1 =new AdminUserSearch(driver);
	  AdminUser1.adminUser();
	  AdminUser1.adminSearch();
	  AdminUser1.userName(UserNames);
	  AdminUser1.usertype("Staff");
	  AdminUser1.searchbutton();
	  boolean isUserisFound = AdminUser1.isUserSearchResults(UserNames);
	  assertTrue(isUserisFound, "User  Found!");
	 
  }
}
