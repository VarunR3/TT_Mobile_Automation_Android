package WatchMode;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.WatchModePage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class WatchMode {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private final static int SLEEP_TIME = 4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private WatchModePage watchModePage;

    private AndroidDashboardPage androidDashboardPage;

    public WatchMode(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.watchModePage = new WatchModePage(driver);

        this.androidDashboardPage = new AndroidDashboardPage(driver);
    }

    public void watchModeDashboard() throws InterruptedException {
        System.out.println("Guard App Watch Mode");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
       // dashboardPage.dashboardWatchMode();
        androidDashboardPage.dashboardWatchMode();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void startRear() throws InterruptedException {
        System.out.println("Start Rear On Watch Mode");

        watchModePage.startRear();
    }

    public void startFront() throws InterruptedException {
        System.out.println("Start Front Camera on Watch Mode");
        watchModePage.startFront();
        driver.navigate().back();
    }

    public void startWithFlash() throws InterruptedException {
        System.out.println("Start Camera with Flash");
        watchModePage.startWithFlash();
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
