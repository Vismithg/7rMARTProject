package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")
	WebElement manageContent;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchPageButton;
	@FindBy(xpath = "//input[@class='form-control' and @name='un' and @type='text']" )
	WebElement pageTitle;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix' and @type='submit' and @name='Search']")
	WebElement searchPageClick;
	public void manageContent()
	{
		manageContent.click();
	}
	public void searchPageButton()
	{
		searchPageButton.click();
	}
	public void pageTitle(String PageN)
	{
		pageTitle.sendKeys(PageN);
	}
	public void searchPageClick()
	{
		searchPageClick.click();
	}
	public boolean pageIsFound(String Paaage)
	{
		return true;
	}
	}
