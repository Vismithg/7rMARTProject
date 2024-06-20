package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContent;
import utilities.ExcelUtilities;

public class NewPageTest extends BaseClass {
  @Test
  public void newPageAdded() throws IOException {
	    String usernamevalue = ExcelUtilities.getStringData(1, 0, "Logincredentials");
	    String passwordvalue = ExcelUtilities.getStringData(1, 1, "Logincredentials");
	    String title = ExcelUtilities.getStringData(0, 0, "NewPage");
	    String Desc = ExcelUtilities.getStringData(1, 0, "NewPage");
	    String PName = ExcelUtilities.getStringData(2, 0, "NewPage");
	    String image = "C:\\Users\\Vismitha\\Downloads\\Account Suspended.jpg";
	    LoginPage loginpage = new LoginPage(driver);
	    loginpage.enterUsername(usernamevalue);
	    loginpage.enterpassword(passwordvalue);
	    loginpage.submit();
	    ManageContent page = new ManageContent(driver);
	    page.manageContent();
	    page.newContent();
	    page.enterTitle(title);
	    page.description(Desc);
	    page.pageName(PName);
	    page.chooseImage(image);
	    page.savePage();

	    boolean isNewPageAdded = page.isNewPageAdded();
	    assertTrue(isNewPageAdded, "Not Added!");
	}
}