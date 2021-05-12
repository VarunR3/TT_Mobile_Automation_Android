package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class PanicButtonPage extends BasePage{
    private final static int PANIC_BUTTON_WAIT_TIME = 5;

    public PanicButtonPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.PANIC_BUTTON_BTN_CANCEL_ELEMENT)
    private MobileElement btnCancelElement;

    @AndroidFindBy(id = TestElement.PANIC_BUTTON_BTN_MESSAGE_OK_ELEMENT)
    private MobileElement btnMessageOKElement;

    @AndroidFindBy(accessibility = TestElement.PANIC_BUTTON_BTN_CALL_ELEMENT)
    private MobileElement btnCallElement;

    public void cancelPanicButtonAction() {
        btnCancelElement.click();
    }

    public void allowPanicButtonProcess() throws InterruptedException {
        TimeUnit.SECONDS.sleep(PANIC_BUTTON_WAIT_TIME);
        btnMessageOKElement.click();
        btnCallElement.click();
    }
}
