package PageObjects;


import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.INPUT_USERNAME)
    @iOSXCUITFindBy(accessibility = TestElement.INPUT_USERNAME)
    private MobileElement inputUsernameElement;

    @AndroidFindBy(accessibility = TestElement.INPUT_PASSWORD)
    @iOSXCUITFindBy(accessibility = TestElement.INPUT_PASSWORD)
    private MobileElement inputPasswordElement;

    @AndroidFindBy(accessibility = TestElement.BTN_SUBMIT)
    @iOSXCUITFindBy(accessibility = TestElement.BTN_SUBMIT)
    private MobileElement btnSubmitElement;

    public void setUsername(String username){
        inputUsernameElement.click();
        inputUsernameElement.sendKeys(username);
    }

    public void setPassword(String password){
        inputPasswordElement.click();
        inputPasswordElement.sendKeys(password);
        driver.hideKeyboard();
    }

    public void clickSubmit(){
        btnSubmitElement.click();
    }
}