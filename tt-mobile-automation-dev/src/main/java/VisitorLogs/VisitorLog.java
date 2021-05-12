package VisitorLogs;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.VisitorLogPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class VisitorLog {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    final static int SLEEP_TIME = 4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private VisitorLogPage visitorLogPage;

    private AndroidDashboardPage androidDashboardPage;//

    public VisitorLog(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.visitorLogPage = new VisitorLogPage(driver);

        this.androidDashboardPage=new AndroidDashboardPage(driver);//
    }

    public void visitorLogDashboard() throws InterruptedException {
        System.out.println("Visitor Log");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //dashboardPage.dashboardVisitorLog();
        androidDashboardPage.dashboardVisitorLog();
    }

    public void logInVisitor() throws InterruptedException {
        visitorLogPage.logInVisitor();
    }

    public void viewCurrentVisitor() throws InterruptedException {
        visitorLogPage.viewCurrentVisitor();
       // ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void searchVisitorCheckIn() throws InterruptedException {
        visitorLogPage.searchVisitorCheckIn();
        //((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void tappingCameraButton() throws InterruptedException {
        visitorLogPage.tappingCameraButton();
    }

    public void tappingCameraButtonEmulator() throws InterruptedException {
        visitorLogPage.tappingCameraButtonEmulator();
    }

    public void searchVisitors() throws InterruptedException {
        visitorLogPage.searchVisitor();
    }

    public void reloadSettings() throws  InterruptedException {
        visitorLogPage.reloadSettings();
    }
}
