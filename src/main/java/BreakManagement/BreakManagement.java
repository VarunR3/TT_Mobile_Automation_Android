package BreakManagement;

import PageObjects.BreakManagementPage;
import PageObjects.DashboardPage.AndroidDashboardPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BreakManagement {

    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    final static int SLEEP_TIME = 4;

    private BreakManagementPage breakManagementPage;

    private AndroidDashboardPage androidDashboardPage;

    public BreakManagement(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.breakManagementPage = new BreakManagementPage(driver);
        this.androidDashboardPage=new AndroidDashboardPage(driver);
    }

    public void startBreak() throws InterruptedException {

        breakManagementPage.startBreak();
    }

    public void clockOutSignOut() throws InterruptedException {
        breakManagementPage.clockOutSignOut();
    }
}
