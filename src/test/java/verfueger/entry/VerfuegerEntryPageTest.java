package verfueger.entry;

import core.BasicTest;
import org.junit.Test;
import pages.Pages;
import pages.VerfuegerInputPage;
import util.PropertiesUtils;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

//TODO: Identify and extract common test cases such as common text present, bank-logo present, etc. Simply everything
//TODO: that all pages of Federated Login will have in common
public class VerfuegerEntryPageTest extends BasicTest {

    private static final String ENTRY_PAGE_TITLE = "pages.verfuegerentry.pageTitle";
    private static final String ENTRY_PAGE_COMMMON_TEXT = "pages.verfuegerentry.commonText";

    private VerfuegerInputPage entryPage;

    @Override
    protected void tearDownHook() {
        // do nothing
    }

    @Override
    protected void setupHook() {
        // open Verfüger entry page for every test
        //TODO: Encapsulate URL into external variable
        this.browser.goTo("https://login.fat2.sparkasse.at/sts/oauth/authorize?response_type=token&client_id=stsdemo");
        this.entryPage = Pages.VerfuegerInputPage(this.browser);
    }

    @Test
    public void should_have_page_title() {
        // then
        assertEquals("Wrong page title. Not Verfueger entry page title.", PropertiesUtils.get(ENTRY_PAGE_TITLE), this.entryPage.getTitle());
    }

    @Test
    public void should_have_common_text() {
        // then
        //TODO: find a better way to abstract away an "element exists" functionality
        assertTrue("Commontext div should have a value but hasn't.", this.entryPage.hasCommonText());
        //TODO: fetch text from property file
        assertEquals("Commontext doesn't fit expected text.", "", this.entryPage.getCommonText());
    }

    @Test
    public void should_have_submit_button_text() {
        // then
        assertTrue("Login button text should be set but isn't.", this.entryPage.hasSubmitBtnText());
        //TODO: fetch text from property file
        assertEquals("Login button text doesn't fit expected text", "Weiter", this.entryPage.getSubmitBtnText());
    }

    @Test
    public void should_have_info_badge() {
        // then
        assertTrue("Info badge visible, but should be hidden", this.entryPage.hasInfoBadge());
    }

    @Test
    public void should_not_have_forgot_password_link() {
        // then
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertFalse("Password forgotten link shown, but shouldn't.", this.entryPage.hasPasswordForgottenLink());
    }

    @Test
    public void should_not_have_login_with_otp_password_link() {
        // then
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertFalse("Login with cardTAN OTP link shown, but shouldn't.", this.entryPage.hasCardTanOtpInfoLink());
    }

    @Test
    public void should_not_have_change_password_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertFalse("Should not have change password link, but has.", this.entryPage.hasChangePasswordLink());
    }

    @Test
    public void should_not_have_security_app_request_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertFalse("Has request security app activation code link but shouldn't.", this.entryPage.hasSidActivationCodeLink());
    }

    @Test
    public void should_have_language_flag() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have a language flag, but hasn't.", this.entryPage.hasLanguageFlag());
    }

    @Test
    public void should_have_login_title() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have a login title but hasn't.", this.entryPage.hasLoginTitle());
    }

    @Test
    public void should_have_verfueger_input_field() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have user-input field but hasn't.", this.entryPage.hasUserInputField());
    }

    @Test
    public void should_have_verfueger_input_image() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have user input field image, but hasn't.", this.entryPage.hasUserInputFieldImage());
    }

    @Test
    public void should_have_verfueger_input_label() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have user input field label, but hasn't.", this.entryPage.hasUserInputFieldLabel());
    }

    @Test
    public void should_have_bank_logo() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have bank logo, but hasn't.", this.entryPage.hasBankLogo());
    }

}