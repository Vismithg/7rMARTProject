package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchNews;
import utilities.ExcelUtilities;

public class SearchNewsTest extends BaseClass{
  @Test
  public void searchNewss() throws IOException {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  String News = "There is no new news";
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  SearchNews Newss= new SearchNews(driver);
	  Newss.manageNews();
	  Newss.searchNews();
	  Newss.enterTitle(News);
	  Newss.searchButton();
	  boolean isNewsFound = Newss.isNewsFound(News);
	  assertTrue(isNewsFound, "News Added!");
  }
}
