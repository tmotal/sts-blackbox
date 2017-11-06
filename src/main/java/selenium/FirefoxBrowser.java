package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser extends BasicSeleniumBrowser {

    /**
     * Basic constructor initializing a Firefox Web-driver instance
     */
    public FirefoxBrowser() {
        this.setDriver(new FirefoxDriver());
    }

}
