package verfueger.entry;

import core.BasicTest;
import org.junit.Test;
import pages.Pages;
import pages.VerfuegerInputPage;

import static junit.framework.TestCase.assertTrue;

public class GeorgeVerfuegerInputPageTest extends BasicTest {

    private VerfuegerInputPage entryPage;

    @Override
    protected void tearDownHook() {
        // do nothing
    }

    @Override
    protected void setupHook() {
        // open Verfüger entry page for every test
        //TODO: Encapsulate URL into external variable
        this.browser.goTo("https://login.fat2.sparkasse.at/sts/oauth/authorize?response_type=token&client_id=georgeclient");
        this.entryPage = Pages.VerfuegerInputPage(this.browser);
    }

    @Test
    public void should_have_product_logo() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have product logo, but hasn't.", this.entryPage.hasProductLogo());
    }

    @Test
    public void should_have_product_text() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have product text but hasn't.", this.entryPage.hasProductText());
    }

    @Test
    public void should_have_product_title() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have product title but hasn't.", this.entryPage.hasProductText());
    }

    @Test
    public void should_have_terms_and_conditions_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have termsn and conditions link but hasn't.", this.entryPage.hasTermsAndConditionsLink());
    }

    @Test
    public void should_have_imprint_and_privacy_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have imprint and privacy link but hasn't.", this.entryPage.hasTermsAndConditionsLink());
    }

    @Test
    public void should_have_contact_and_services_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have contact and services link, but hasn't.", this.entryPage.hasContactsAndServicesLink());
    }

    @Test
    public void should_have_ssl_certificate_link() {
        //TODO: encapsulate the question "does this element exist" into a helper or dedicated class
        assertTrue("Should have ssl certificate link, but hasn't.", this.entryPage.hasSSLCertificateLink());
    }

}