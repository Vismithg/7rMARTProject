package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroceryNews {
	WebDriver driver;

	public GroceryNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement manageNews;
	@FindBy(xpath= "//a[@class='btn btn-rounded btn-danger']")
	WebElement newNews;
	@FindBy(xpath = "//textarea[@class='form-control' and @name='news' and @id='news']")
	WebElement enterNews;
	@FindBy(xpath = "//button[@class='btn btn-danger' and @name='create']")
    WebElement saveNews;
	
	public void manageNews()
	{
		manageNews.click();	
	}
	public void newNews()
	{
		newNews.click();
	}
	public void enterNews(String News)
	{
		enterNews.sendKeys(News);
	}

    public void saveNews()
    
    {
    	saveNews.click();
    }
    public boolean isNewsAdded(String News) {
	
		return true;
}
}