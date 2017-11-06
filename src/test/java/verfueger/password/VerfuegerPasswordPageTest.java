package verfueger.password;

import core.BasicTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Pages;
import pages.PasswordInputPage;
import pages.VerfuegerInputPage;

import static junit.framework.TestCase.assertFalse;

public class VerfuegerPasswordPageTest extends BasicTest {

    private PasswordInputPage passwordInputPage;

    @Override
    protected void tearDownHook() {
        // do nothing at the moment
    }

    @Override
    protected void setupHook() {
        this.browser.goTo("https://login.fat2.sparkasse.at/sts/oauth/authorize?client_id=stsdemo&response_type=token");
        VerfuegerInputPage verfuegerInputPage = Pages.VerfuegerInputPage(this.browser);
        //TODO: Refactor Verfüger number entry
        verfuegerInputPage.startLogin().as("789234128").doIt();
        this.passwordInputPage = Pages.PasswordInputPage(this.browser);
    }

    @Test
    public void should_not_have_info_badge() {
        // then
        assertFalse("Info badge visible, but should be hidden", this.passwordInputPage.hasInfoBadge());
    }
}
