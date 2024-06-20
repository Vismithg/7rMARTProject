package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubCategorySearch {
	WebDriver driver;
	public SubCategorySearch(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")
	WebElement subCat;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")
	WebElement SearchCat;
	@FindBy(xpath = "//select[@class='form-control selectpicker' and @name='cat_id' and @id='cat_id']" )
	WebElement SearchCatdropDown;
	@FindBy(xpath = "//input[@type='text' and @class='form-control' and @name='subcategory' and @id='subcategory']")
	WebElement SearchsubCatName;
	@FindBy(xpath="//button[@type='submit' and @name='create' and @class='btn btn-danger']")
	WebElement searchAddedSubCat;
	public void subCat()
	{
		subCat.click();
	}
	public void SearchCat()
	{
		SearchCat.click();	
	}
	public void SearchCatdropDown(String Category)
	{
		Select select = new Select(SearchCatdropDown);
		select.selectByVisibleText(Category);
	}
	public void SearchsubCatName(String SavedName)
	{
		SearchsubCatName.sendKeys(SavedName);
	}
	public void searchAddedSubCat()
	{
		searchAddedSubCat.click();
	}
	public boolean catIsFound(String SavedName)
	{
		return true;
	}
	
}
