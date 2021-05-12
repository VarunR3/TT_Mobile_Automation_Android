package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class EmergencyContactPage extends BasePage {
    final static int SLEEP_TIME =4;
    Swipe swipe;
    public EmergencyContactPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(xpath = TestElement.EMERGENCY_CONTACT_ELEMENT)
    private MobileElement emergencyContactElement;

    public void clickEmergencyContact() {
        emergencyContactElement.click();

    }
}
