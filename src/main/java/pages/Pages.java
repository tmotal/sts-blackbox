package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.SeleniumBrowser;

public class Pages {

    private static <T>T createPage(SeleniumBrowser browser, Class<T> pageClass) {
        WebDriver driver = browser.getDriver();
        return PageFactory.initElements(driver, pageClass);
    }

    public static VerfuegerInputPage VerfuegerInputPage(SeleniumBrowser browser) {
        return createPage(browser, VerfuegerInputPage.class);
    }

    public static PasswordInputPage PasswordInputPage(SeleniumBrowser browser) {
        return createPage(browser, PasswordInputPage.class);
    }
}
