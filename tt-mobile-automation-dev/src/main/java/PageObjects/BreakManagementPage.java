package PageObjects;


import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class BreakManagementPage extends BasePage {

    private static int SLEEP_TIME =4;

    public BreakManagementPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_TIME_CLOCK_ELEMENT)
    private MobileElement dashboardTimeClockElement;

    @AndroidFindBy(xpath = TestElement.START_BREAK_ELEMENT)
    private MobileElement startBreakElement;

    @AndroidFindBy(id = TestElement.SESSION_BREAK_INFO_ELEMENT)
    private MobileElement sessionBreakInfoBarElement;

    @AndroidFindBy(accessibility = TestElement.BTN_CANCEL_ELEMENT)
    private MobileElement btnCancelElement;

    @AndroidFindBy(accessibility = TestElement.END_BREAK_ELEMENT)
    private MobileElement endBreakElement;

    @AndroidFindBy(accessibility = TestElement.CLOCK_OUT_SIGN_OUT_ELEMENT)
    private MobileElement clockOutSignOutElement;

    @AndroidFindBy(id = TestElement.REMOVE_DEPARTMENT_LICENSE_ELEMENT)
    private MobileElement removeDepartmentLicenseElement;

    @AndroidFindBy(id = TestElement.REMOVE_LICENSE_OPTION_ELEMENT)
    private MobileElement removeLicenseOptionElement;

    public void startBreak() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startBreakElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        sessionBreakInfoBarElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnCancelElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        sessionBreakInfoBarElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        endBreakElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void clockOutSignOut() throws InterruptedException {
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        clockOutSignOutElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        removeDepartmentLicenseElement.click();
        int i;
        for (i=0; i<=1; i++) {
            removeDepartmentLicenseElement.click();
        }
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        removeLicenseOptionElement.click();
    }
}
