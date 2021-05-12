package Schedules;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.SchedulesPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class Schedules {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private final static int SLEEP_TIME = 4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private SchedulesPage schedulesPage;
    private AndroidDashboardPage androidDashboardPage;

    public Schedules(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.schedulesPage = new SchedulesPage(driver);
        this.androidDashboardPage=new AndroidDashboardPage(driver);
    }

    public void schedulesDashboard() throws InterruptedException {
        System.out.println("Guard App Schedules Option");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        androidDashboardPage.dashboardSchedules();
    }

    public void searchSchedules() throws Exception {
        schedulesPage.searchSchedules();
    }

    public void verifySchedule() throws InterruptedException {
        schedulesPage.verifyScheduleExit();
        //androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
