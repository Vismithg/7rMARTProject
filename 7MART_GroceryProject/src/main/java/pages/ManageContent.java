package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUpload;

public class ManageContent {
	WebDriver driver;
public ManageContent(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")
WebElement manageContent;
@FindBy(xpath= "//a[@href='https://groceryapp.uniqassosiates.com/admin/pages/add' and @class='btn btn-rounded btn-danger']")
WebElement newContent;
@FindBy(xpath = "//input[@class='form-control' and @name='title']")
WebElement enterTitle;
@FindBy(xpath = "//div[@class='note-editable card-block' and @contenteditable='true']")
WebElement description;
@FindBy(xpath = "//input[@class='form-control' and @name='page']")
WebElement pageName;
@FindBy(xpath = "//input[@type='file' and @name='main_img' and @id='main_img']")
WebElement chooseImage;
@FindBy(xpath = "//button[@type='submit' and @name='create' and @class='btn btn-danger']")
WebElement savePage;

public void manageContent()
{
	manageContent.click();
}
public void newContent()
{
	newContent.click();
}
public void enterTitle(String title)
{
	enterTitle.sendKeys(title);
}
public void description(String Desc)
{
	description.sendKeys(Desc);
}

public void pageName(String PName)
{
	pageName.sendKeys(PName);
}
public void chooseImage(String image, WebElement images)
{
	FileUpload fileupload= new FileUpload();
	fileupload.fileuploadSendKey(images, image);
}
public void savePage()
{
	savePage.click();
}
public boolean isNewPageAdded() {
	// TODO Auto-generated method stub
	return true;
}
public void chooseImage(String image) {
	// TODO Auto-generated method stub
	
}
}
