package PanicButton;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.PanicButtonPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class PanicButton {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private final static int SLEEP_TIME = 4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private PanicButtonPage panicButtonPage;

    private AndroidDashboardPage androidDashboardPage;

    public PanicButton(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.panicButtonPage = new PanicButtonPage(driver);

        this.androidDashboardPage= new AndroidDashboardPage(driver);
    }

    public void panicButtonDashboard() throws InterruptedException{
        System.out.println("Guard App Panic Button");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
       // dashboardPage.dashboardPanicButton();
        androidDashboardPage.dashboardPanicButton();
    }

    public void clickPanicButton() {
        System.out.println("Click Panic Button");
        panicButtonPage.cancelPanicButtonAction();
    }

    public void allowPanicButtonProcess() throws InterruptedException {
        System.out.println("Allow Panic Button Process");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardPage.dashboardPanicButton();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        panicButtonPage.allowPanicButtonProcess();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        int i;
        for (i= 0; i<=3; i++) {
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
            TimeUnit.SECONDS.sleep(SLEEP_TIME);
        }
    }
}
