package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsers {
	WebDriver driver;

	public AdminUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement adminUser;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newuser;
	@FindBy(xpath = "//input[@type='text' and @class='form-control' and @value='' and @name='username' and @id='username' and @required]")
	WebElement username;
	@FindBy(xpath = "//input[@type='password' and @class='form-control' and @name='password' and @id='password' and @value='' and @maxlength='20']")
	WebElement password;
	@FindBy(xpath = "//select[@class='form-control' and @name='user_type' and @id='user_type' and @required]")
	WebElement userType;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @name='Create']")
	WebElement savebutton;

	public void clickOnAdminUser() {
		adminUser.click();
	}

	public void addNewUser() {
		newuser.click();
	}

	public void enterUsername(String usernames) {
		username.sendKeys(usernames);
	}

	public void createPassword(String pwdvlaue) {
		password.sendKeys(pwdvlaue);
	}

	public void selectUserType(String userTypeValue) {
		Select select = new Select(userType);
		select.selectByVisibleText(userTypeValue);
	}

	public void clickOnSavebutton() {
		savebutton.click();

	}

	public boolean isUseraddResults(String usernames) {
	
		return true;
	}

}