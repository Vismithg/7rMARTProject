package testscript;

import constants.Constant;
import utilities.ScreenShotCaptureUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  
  WebDriver driver;
  public Properties properties;
  public FileInputStream fls;
  public ScreenShotCaptureUtility scrshot;
  @Parameters("browser")
  @BeforeMethod(alwaysRun = true)

  public void initialisebrowser(String browser) throws Exception {
	    //driver = new ChromeDriver();
	  try
		{
			properties= new Properties();
			fls=new FileInputStream(Constant.CONFIGFILE);
			properties.load(fls);
		}
		catch(FileNotFoundException exception)
		{
			exception.printStackTrace();	
		}
		
		   
	  if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();	
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else
		{
			throw new Exception("browser is not correct");
		}
	  driver.get(properties.getProperty("url"));
	
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void browserQuit(ITestResult itestresult) throws IOException {
	  if (itestresult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotCaptureUtility();
			scrshot.captureFailureScreenShot(driver, itestresult.getName());
	  
	  
	  //driver.close();
  }

}
}