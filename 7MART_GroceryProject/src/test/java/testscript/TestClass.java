package testscript;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.annotations.Test;

import pages.AdminUsers;
import pages.LoginPage;
import utilities.ExcelUtilities;


public class TestClass extends BaseClass {
@Test
public void verifyNewUserCanBeAdded() throws IOException
{
String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
String usernames = "Vismi";
String pwdvlaue = "Jojojojo";
LoginPage loginpage =new LoginPage(driver);
loginpage.enterUsername(usernamevalue);
loginpage.enterpassword(passwordvalue);
loginpage.submit();
AdminUsers AdminUser =new AdminUsers(driver);
AdminUser.clickOnAdminUser();
AdminUser.addNewUser();
AdminUser.enterUsername(usernames);
AdminUser.createPassword(pwdvlaue);
AdminUser.selectUserType("Staff");
AdminUser.clickOnSavebutton();
boolean isUserisaddedd = AdminUser.isUseraddResults(usernames);
assertTrue(isUserisaddedd, "User  addedd!");



	
}
}
	


