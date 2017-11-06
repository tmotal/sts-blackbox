package selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser extends BasicSeleniumBrowser {

    /**
     * Basic constructor initializing an Internet Explorer Web-driver
     */
    public InternetExplorerBrowser() {
        this.setDriver(new InternetExplorerDriver());
    }

}
