package selenium;

import infrastructure.Browser;
import org.openqa.selenium.WebDriver;

public interface SeleniumBrowser extends Browser {

    /**
     * The specific Web-driver instance of the browser under consideration.
     * @return Web-driver instance, e.g., ChromeDriver, FirefoxDriver
     */
    WebDriver getDriver();

}
