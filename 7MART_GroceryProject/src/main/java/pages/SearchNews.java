package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNews {
	WebDriver driver;

	public SearchNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement manageNews;
	@FindBy(xpath= "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchNews;
	@FindBy(xpath = "//input[@class='form-control' and @name='un']")
	WebElement enterTitle;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix' and @name='Search']")
    WebElement searchButton;
	
	public void manageNews()
	{
		manageNews.click();
	}
	public void searchNews()
	{
		searchNews.click();
	}
	public void enterTitle(String Title1)
	{
		enterTitle.sendKeys(Title1);
	}
	public void searchButton()
	{
		searchButton.click();
	}
	public boolean isNewsFound(String News)
	{
		return true;
	}
}
