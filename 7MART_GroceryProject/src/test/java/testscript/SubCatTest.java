package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryClass;
import utilities.ExcelUtilities;

public class SubCatTest extends BaseClass {
  @Test
  public void addSubCat() throws IOException {
	  String usernamevalue=ExcelUtilities.getStringData(1, 0, "Logincredentials");
	  String passwordvalue=ExcelUtilities.getStringData(1, 1, "Logincredentials");
	  
	  String NameSub="ammu"  ;
	  String imagePath= "C:\\\\Users\\\\Vismitha\\\\Downloads\\\\Account Suspended.jpg";
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.enterUsername(usernamevalue);
	  loginpage.enterpassword(passwordvalue);
	  loginpage.submit();
	  SubCategoryClass Subbs= new SubCategoryClass(driver);
	  Subbs.subCat();
	  Subbs.newCat();
	  Subbs.CatdropDown("Apple");
	  Subbs.subCatName(NameSub);
	  Subbs.chooseCatFile(imagePath);
	  Subbs.saveCat();
	  boolean categoryIsAdded= Subbs.categoryIsAdded(imagePath);
	  assertTrue(categoryIsAdded, "not added!");
			  
	  
  }
}
