package Testing;

import Browsers.DriverManager;
import Browsers.PropertyAccesor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoadHome {
    public static Home loadHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static void maximizeWindow() {
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void closeWindow(){
        DriverManager.getInstance().getWebDriver().close();
        DriverManager.getInstance().getWebDriver().quit();
    }

    public static void waitTime(){ DriverManager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void waitTimeexplicit(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
