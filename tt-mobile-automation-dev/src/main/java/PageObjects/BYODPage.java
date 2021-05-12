package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class BYODPage extends BasePage{
    private final static int SLEEP_TIME = 4;


    public BYODPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = TestElement.BYOD_CLOCK_IN_ELEMENT)
    private MobileElement byodClockInElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_TIME_CLOCK_ELEMENT)
    private MobileElement dashboardTimeClockElement;

    @AndroidFindBy(accessibility = TestElement.CLOCK_OUT_SIGN_OUT_ELEMENT)
    private MobileElement clockOutSignOutElement;

    @AndroidFindBy(id = TestElement.REMOVE_DEPARTMENT_LICENSE_ELEMENT)
    private MobileElement removeDepartmentLicenseElement;

    @AndroidFindBy(id = TestElement.REMOVE_LICENSE_OPTION_ELEMENT)
    private MobileElement removeLicenseOption;

    @AndroidFindBy(id = TestElement.BYOD_TO_EARLY_TO_CLOCKED_IN)
    private MobileElement tooearlylogin;

    public void byodClockIn() throws InterruptedException {
        System.out.println("User clockin when there's a shift assigned");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        byodClockInElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //tooearlylogin.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }
}
