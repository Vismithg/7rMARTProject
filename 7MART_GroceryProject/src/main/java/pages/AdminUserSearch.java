package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUserSearch {
	WebDriver driver;

	public AdminUserSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement adminUser;
	@FindBy(xpath= "//a[@class='btn btn-rounded btn-primary']")
	WebElement adminSearch;
	@FindBy(xpath = "//input[@type='text' and @class='form-control' and @name='un' and @id='un']")
	WebElement userName;
	@FindBy(xpath = "//select[@class='form-control' and @name='ut' and @id='ut']")
	WebElement usertype;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @name='Search']")
    WebElement searchbutton;
	
	public void adminUser()
	{
		adminUser.click();	
	}
	public void adminSearch()
	{
		adminSearch.click();
	}
	public void userName(String UserNames)
	{
		userName.sendKeys(UserNames);
	}
	public void usertype(String userTypeValue)
	{
		Select select = new Select(usertype);
		select.selectByVisibleText(userTypeValue);
	}
    public void searchbutton()
    
    {
    	searchbutton.click();
    }
    public boolean isUserSearchResults(String UserNames) {
		// TODO Auto-generated method stub
		return true;
}
}
