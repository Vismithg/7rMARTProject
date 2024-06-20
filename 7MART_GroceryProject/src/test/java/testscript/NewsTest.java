package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.GroceryNews;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class NewsTest extends BaseClass {
  @Test
  public void addNews() throws IOException {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  String News = "There is no new news";
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  GroceryNews NewNews =new GroceryNews(driver);
	  NewNews.manageNews();
	  NewNews.newNews();
	  NewNews.enterNews(News);
	  NewNews.saveNews();
	  boolean isNewsAdded = NewNews.isNewsAdded(News);
	  assertTrue(isNewsAdded, "News Added!");
  }
}
