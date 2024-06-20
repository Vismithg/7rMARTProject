package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategorySearch;
import utilities.ExcelUtilities;

public class SubCategorySearchTest extends BaseClass {
  @Test
  public void subCategoryisFound() throws IOException {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  String SavedName="ammuu"  ;
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  SubCategorySearch Suubs = new SubCategorySearch(driver);
	  Suubs.subCat();
	  Suubs.SearchCat();
	  Suubs.SearchCatdropDown("Apple");
	  Suubs.SearchsubCatName(SavedName);
	  Suubs.searchAddedSubCat();
	  boolean catIsFound = Suubs.catIsFound(SavedName);
	  assertTrue(catIsFound,"not found!");
  }
}
