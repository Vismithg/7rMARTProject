package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
    public static void selectOptionByValue(WebElement element, String selectvalue) {
        Select select = new Select(element);
        select.selectByValue(selectvalue);
    }

    public static void selectOptionByText(WebElement selectElement, String selectText) {
        Select select = new Select(selectElement);
        select.selectByVisibleText(selectText);
    }

    public static void doubleClickToMoveSelection(WebDriver driver, WebElement selectable) {
        Actions action = new Actions(driver);
        action.doubleClick(selectable).perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public static void instructor(WebDriver driver, WebElement instructor) {
        
    }

    public static void rightClick(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    public static void hoverOver(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public static void clickAndHold(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.clickAndHold(element).perform();
    }

    public static void release(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.release(element).perform();
    }

    public static void moveByOffset(WebDriver driver, WebElement element, int xOffset, int yOffset) {
        Actions action = new Actions(driver);
        action.moveByOffset(xOffset, yOffset).perform();
    }

    public static void click(WebDriver driver, WebElement element) {
        element.click();
    }

    public static void sendKeys(WebDriver driver, WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void clear(WebDriver driver, WebElement element) {
        element.clear();
    }
}
