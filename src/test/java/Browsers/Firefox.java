package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Browser {
    @Override
    public WebDriver initializeDriver() {
        return new FirefoxDriver();
    }
}
