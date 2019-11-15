package Browsers;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private WebDriver webDriver;
    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
