package pages;

import actions.EnterUserAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerfuegerInputPage {

    @FindBy(xpath = "/html/head/title")
    private WebElement pageTitle;
    @FindBy(className = "commontext")
    private WebElement commonText;
    @FindBy(id = "submitButton")
    private WebElement submitButton;
    @FindBy(className = "flipicon")
    private WebElement infoBadge;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/a[1]")
    private WebElement forgotPasswordLink;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/a[2]")
    private WebElement otpLoginLink;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/a[3]")
    private WebElement changePwLink;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/a[4]")
    private WebElement sidActivationCodeLink;
    @FindBy(xpath = "/html/body/div[1]/div[1]/a[2]")
    private WebElement languageFlag;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/h1")
    private WebElement loginTitle;
    @FindBy(id = "user")
    private WebElement userInputField;
    @FindBy(className = "icon")
    private WebElement userInputFieldImage;
    @FindBy(className = "label")
    private WebElement userInputFieldLabel;
    @FindBy(className = "logo")
    private WebElement bankLogo;
    @FindBy(className = "production")
    private WebElement productLogo;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/p")
    private WebElement productText;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div/a[1]")
    private WebElement termsAndConditionLink;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div/a[2]")
    private WebElement contactAndSercvicesLink;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div/a[3]")
    private WebElement sslCertificateLink;

    public String getTitle() {
        return this.pageTitle.getAttribute("innerHTML");
    }

    public String getCommonText() {
        return "";
    }

    public boolean hasCommonText() {
        return !this.commonText.getAttribute("innerHTML").isEmpty();
    }

    public boolean hasSubmitBtnText() {
        return !this.submitButton.getAttribute("value").isEmpty();
    }

    public String getSubmitBtnText() {
        return this.submitButton.getAttribute("value");
    }

    public boolean hasInfoBadge() {
        return infoBadge != null;
    }

    public boolean hasPasswordForgottenLink() {
        return this.forgotPasswordLink != null;
    }

    public boolean hasCardTanOtpInfoLink() {
        return this.otpLoginLink != null;
    }

    public boolean hasChangePasswordLink() {
        return this.changePwLink != null;
    }

    public boolean hasSidActivationCodeLink() {
        return this.sidActivationCodeLink != null;
    }

    public boolean hasLanguageFlag() {
        return this.languageFlag != null;
    }

    public boolean hasLoginTitle() {
        return this.loginTitle != null;
    }

    public boolean hasUserInputField() {
        return this.userInputField != null;
    }

    public boolean hasUserInputFieldImage() {
        return this.userInputFieldImage != null; 
    }

    public boolean hasUserInputFieldLabel() {
        return this.userInputFieldLabel != null;
    }

    public boolean hasBankLogo() {
        return this.bankLogo != null;
    }

    public boolean hasProductLogo() {
        return this.productLogo != null;
    }

    public boolean hasProductText() {
        return this.productText != null;
    }

    public boolean hasTermsAndConditionsLink() {
        return this.termsAndConditionLink != null;
    }

    public boolean hasContactsAndServicesLink() {
        return this.contactAndSercvicesLink != null;
    }

    public boolean hasSSLCertificateLink() {
        return this.sslCertificateLink != null;
    }

    public EnterUserAction startLogin() {
        return new EnterUserAction(this);
    }

    public VerfuegerInputPage enterUserNumber(String userNumber) {
        this.userInputField.sendKeys(userNumber);
        return this;
    }

    //TODO: Should return a password input page ... however, the browser is not known to the page. Perhaps it makes
    //TODO: sense to externalize the browser as a Singleton (static)
    public VerfuegerInputPage fetchVerfuegerInfo() {
        this.submitButton.click();
        return this;
    }
}
