package selenium;

import infrastructure.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasicSeleniumBrowser implements SeleniumBrowser {

    private static Browser browserInstance;

    private WebDriver driver;

    /**
     * Basic constructor initializing the Browser instance with a Google Chrome Web-Driver instance.
     */
    public BasicSeleniumBrowser() {
        this.setDriver(new ChromeDriver());
    }

    /**
     * Embrace change: Allows to exchange a Browser instance for a particular alternative one.
     * @param instance The concrete instance of the browser to be used, e.g., Firefox, Internet Explorer, Google Chrome
     */
    public static void setBrowser(Browser instance) {
        browserInstance = instance;
    };

    public static Browser getInstance() {
        return browserInstance;
    }

    protected void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

    @Override
    public void goTo(String uri) {
        this.driver.get(uri);
    }

    @Override
    public void close() {
        this.driver.close();
    }

    @Override
    public void quit() {
        this.driver.quit();
    }

}
