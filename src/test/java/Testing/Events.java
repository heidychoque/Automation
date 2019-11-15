package Testing;

import Browsers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Events {

    public static void click(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }


    public static boolean isVisibleWebElement(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed();
    }


    public static String getContent(WebElement webElement){return webElement.getText();}

    public  static Point getPosition(WebElement webElement) {return webElement.getLocation();}

    public static String getAttribute(WebElement webElement, String attribute) {return webElement.getAttribute(attribute);}


    public static void sendKeys(WebElement webElement, String keys) {
        webElement.clear();
        webElement.sendKeys(keys);
    }


    public static  boolean compareURLs(String url){
        return DriverManager.getInstance().getWebDriver().getCurrentUrl().equals(url);
    }

    public static  boolean isEnabled(WebElement webElement){
        return  webElement.isEnabled();
    }

}
