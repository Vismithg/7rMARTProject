package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchPage;
import utilities.ExcelUtilities;

public class SearchPageTest extends BaseClass {
  @Test
  public void PageFinding() throws IOException {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  String PageN = "vismitha";
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  SearchPage pages= new SearchPage(driver);
	  pages.manageContent();
	  pages.searchPageButton();
	  pages.pageTitle(PageN);
	  pages.searchPageClick();
	  boolean pageIsFound = pages.pageIsFound(PageN);
	  assertTrue(pageIsFound, "Page Found!");
  }
}
