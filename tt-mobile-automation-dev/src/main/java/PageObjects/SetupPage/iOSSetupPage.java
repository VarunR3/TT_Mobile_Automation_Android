package PageObjects.SetupPage;

import PageObjects.BasePage;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSSetupPage extends BasePage implements SetupPage{
    public iOSSetupPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = TestElement.BASE_URL)
    private MobileElement baseUrlElement;

    @iOSXCUITFindBy(accessibility = TestElement.SETUP_CODE)
    private MobileElement setupCodeElement;

    @iOSXCUITFindBy(accessibility = TestElement.BTN_INSTALL)
    private MobileElement btnInstallElement;

    @Override
    public void setBaseUrl(String baseUrl) {

        baseUrlElement.clear();
        baseUrlElement.click();
        baseUrlElement.clear();
        baseUrlElement.sendKeys(baseUrl);
    }

    @Override
    public void setSetupCode(String setupCode) {

        setupCodeElement.clear();
        setupCodeElement.clear();
        setupCodeElement.sendKeys(setupCode);
        driver.hideKeyboard();
    }

    @Override
    public void clickInstall() {

    }

    @Override
    public void checkLicenseUsage() {

    }
}
