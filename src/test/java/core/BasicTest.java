package core;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import selenium.ChromeBrowser;
import selenium.SeleniumBrowser;
import util.PropertiesUtils;

public abstract class BasicTest {

    protected SeleniumBrowser browser;

    @BeforeClass
    public static void initialize() {
        //TODO: Currently fine, but may be better placed in a test-setup / test-settings class
        System.setProperty("webdriver.chrome.driver", PropertiesUtils.get("selenium.webdriver.chromedriver.path"));
    }

    @Before
    public void setup() {
        this.browser = new ChromeBrowser();
        this.setupHook();
    }

    @After
    public void tearDown() {
        this.tearDownHook();
        this.browser.close();
    }

    /**
     * Hook allowing customized cleanup steps and tasks.
     */
    protected abstract void tearDownHook();

    /**
     * Hook allowing customized setup steps and tasks.
     */
    protected abstract void setupHook();

}
