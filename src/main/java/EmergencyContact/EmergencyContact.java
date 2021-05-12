package EmergencyContact;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.EmergencyContactPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class EmergencyContact {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    private int SLEEP_TIME = 4;

    Swipe swipe;

    private DashboardPage dashboardPage;
    private EmergencyContactPage emergencyContactPage;
    private AndroidDashboardPage androidDashboardPage;

    public EmergencyContact(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.emergencyContactPage = new EmergencyContactPage(driver);
        this.androidDashboardPage = new AndroidDashboardPage(driver);

    }

    public void dashboardEmergencyContact() throws InterruptedException {
        System.out.println("Call Emergency Contact");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // swipe.swipeToUp();
        //dashboardPage.dashboardEmergencyContact();
        androidDashboardPage.dashboardEmergencyContact();
    }

    public void clickEmergencyContact() {
        System.out.println("Click on Emergency Contact");
        emergencyContactPage.clickEmergencyContact();
        int i;
        for (i= 0; i<=3; i++) {
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }

}
