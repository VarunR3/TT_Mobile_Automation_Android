package PageObjects.SetupPage;

import PageObjects.BasePage;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;

public class AndroidSetupPage extends BasePage implements SetupPage{

    public AndroidSetupPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @SuppressWarnings("unused")
    @AndroidFindBy(accessibility = TestElement.BASE_URL)
    private MobileElement baseUrlElement;

    @SuppressWarnings("unused")
    @AndroidFindBy(accessibility = TestElement.SETUP_CODE)
    private MobileElement setupCodeElement;

    @SuppressWarnings("unused")
    @AndroidFindBy(accessibility = TestElement.BTN_INSTALL)
    private MobileElement btnInstallElement;

    @SuppressWarnings("unused")
    @AndroidFindBy(accessibility = TestElement.OPT_YES_ELEMENT)
    private MobileElement optYESElement;

    @SuppressWarnings("unused")
    @AndroidFindBy(accessibility = TestElement.OPT_NO_ELEMENT)
    private MobileElement optNOElement;

    @SuppressWarnings("unused")
    @AndroidFindBy(id = TestElement.POPUP_MESSAGE_ELEMENT)
    private MobileElement popUpMessageElement;

    public void setBaseUrl(String baseUrl) {

        baseUrlElement.clear();
        baseUrlElement.click();
        baseUrlElement.clear();
        baseUrlElement.sendKeys(baseUrl);
    }

    public void setSetupCode(String setupCode) {

        setupCodeElement.clear();

        setupCodeElement.clear();
        setupCodeElement.sendKeys(setupCode);
        driver.hideKeyboard();
    }

    public void clickInstall() {
        btnInstallElement.click();
    }

    public void checkLicenseUsage() {
        try {
            if (popUpMessageElement.isDisplayed()) {
                optYESElement.click();
            } else {
                System.out.println("Installation Code is not used");
            }
        }
        //the window will go directly to the LoginPage
        catch (NoSuchElementException ignored) {
        }
    }
}
