package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class LogoutPage extends BasePage{
    final static int SLEEP_TIME = 4;



    public LogoutPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = TestElement.DASHBOARD_TIME_CLOCK_ELEMENT)
    private MobileElement dashboardTimeClockElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_START_BREAK_ELEMENT)
    private MobileElement startBreakElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_END_BREAK_ELEMENT)
    private MobileElement endBreakElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_CANCEL_ELEMENT)
    private MobileElement cancelElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_CLOCK_OUT_SIGN_IN_ELEMENT)
    private MobileElement clockOutNSignedInElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_SIGN_OUT_ELEMENT)
    private MobileElement signOutElement;

    @AndroidFindBy(accessibility = TestElement.LOGOUT_CLOCK_OUT_SIGN_OUT_ELEMENT)
    private MobileElement clockOutNSignOutElement;

    @AndroidFindBy(id = TestElement.LOGOUT_SITE_LICENSE_ELEMENT)
    private MobileElement siteLicenseElement;

    @AndroidFindBy(id = TestElement.LOGOUT_REMOVE_LICENSE_OPTION)
    private MobileElement removeLicenseOption;

    public void startBreak() throws InterruptedException {
        System.out.println("The Guard Start a Break");

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startBreakElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        System.out.println("The Guard End the Break");
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        endBreakElement.click();
        System.out.println("The Guard completed the break");
    }

    public void cancel() throws InterruptedException {
        System.out.println("The Guard Cancel the Action");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        cancelElement.click();
    }

    public void clockOutSignIn() throws InterruptedException {
        System.out.println("The Guard Clock Out & Stay Signed In");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        clockOutNSignedInElement.click();
        dashboardTimeClockElement.click();
        signOutElement.click();
    }

    public void clockOutSignOut() throws InterruptedException {
        System.out.println("The Guard Clock Out & Sign Out");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        clockOutNSignOutElement.click();
    }

    public void removeSiteLicense() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        siteLicenseElement.click();
        int i;
        for (i=0; i<=1; i++) {
            siteLicenseElement.click();
        }
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        removeLicenseOption.click();
    }
}
