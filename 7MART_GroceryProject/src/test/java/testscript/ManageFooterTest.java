package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooter;
import utilities.ExcelUtilities;

public class ManageFooterTest extends BaseClass{
  @Test
  public void updateDetails() throws IOException {
		  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
		  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
		  String Addresss = "kk rr ll ii";
		  String Email="VIsmi@hotmail.com";
		  String phoneN="987654321";
		  LoginPage loginpage =new LoginPage(driver);
		  loginpage.enterUsername(usernamevalue);
		  loginpage.enterpassword(passwordvalue);
		  loginpage.submit();
		  ManageFooter manage= new ManageFooter(driver);
		  manage.manageFooters();
		  manage.edit();
		  manage.address(Addresss);
		  manage.email(Email);
		  manage.phone(phoneN);
		  manage.update();
		  boolean isUpdated=manage.isUpdated(phoneN);
		  assertTrue(isUpdated,"not updated");
		  
		  
  }
  }

