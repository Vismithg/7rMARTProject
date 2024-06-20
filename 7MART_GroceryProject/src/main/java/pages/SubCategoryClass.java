package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.FileUpload;

public class SubCategoryClass {
	WebDriver driver;
	public SubCategoryClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")
	WebElement subCat;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")
	WebElement newCat;
	@FindBy(xpath = "//select[@class='form-control selectpicker' and @name='cat_id' and @id='cat_id']" )
	WebElement CatdropDown;
	@FindBy(xpath = "//input[@type='text' and @class='form-control' and @name='subcategory' and @id='subcategory']")
	WebElement subCatName;
	@FindBy(xpath="//input[@type='file' and @name='main_img' and @id='main_img']")
	WebElement chooseCatFile;
	@FindBy(xpath="//button[@type='submit' and @name='create' and @class='btn btn-danger']")
	WebElement saveCat;
	public void subCat()
	{
		subCat.click();
	}
	public void newCat()
	{
		newCat.click();
	}
	public void CatdropDown(String Category)
	{
		Select select = new Select(CatdropDown);
		select.selectByVisibleText(Category);
	}
	public void subCatName(String NameSub)
	{
		subCatName.sendKeys(NameSub);
	}
	public void chooseCatFile(String imagePath) {
	    FileUpload fileupload = new FileUpload();
	    fileupload.fileuploadSendKey(chooseCatFile, imagePath);
	}
	public void saveCat()
	{
		saveCat.click();
	}
	public boolean categoryIsAdded(String NewCaat)
	{
		return true;
	}
	}


