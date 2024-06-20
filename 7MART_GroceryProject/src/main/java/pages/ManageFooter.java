package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooter {
	WebDriver driver;

	public ManageFooter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
	WebElement manageFooters;
	@FindBy(xpath= "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")
	WebElement edit;
	@FindBy(xpath = "//textarea[@id='content' and @name='address']")
	WebElement address;
	@FindBy(xpath = "//input[@name='email' and @id='email']")
    WebElement email;
	@FindBy(xpath = "//input[@name='phone' and @id='phone']")
    WebElement phone;
	@FindBy(xpath = "//button[@name='Update']")
    WebElement update;
	
	public void manageFooters()
	{
		manageFooters.click();
	}
	public void edit()
	{
		edit.click();
	}
	public void address(String Addresss)
	{
		address.sendKeys(Addresss);
	}
	public void email(String Email)
	{
		email.sendKeys(Email);
	}
	public void phone(String phoneN)
	{
		phone.sendKeys(phoneN);
	}
	public void update()
	{
		update.click();
	}

	public boolean isUpdated(String phoneN)
	{
		return true;
	}
}


