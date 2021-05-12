package Setting;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.SettingPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class AppSettings {
    private AppiumDriver<MobileElement> driver;

    final static int SLEEP_TIME = 4;
    final static String OLD_PASSWORD = "Busy@pple53";
    final static String NEW_PASSWORD = "Pa$$w0rd";
    final static String USERNAME = "MQiu";

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private SettingPage settingsPage;
    private AndroidDashboardPage androidDashboardPage;

    public AppSettings(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        this.swipe = new Swipe(this.driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.settingsPage = new SettingPage(driver, swipe);
        this.androidDashboardPage=new AndroidDashboardPage(driver);
    }

    public void settingDashboard() throws InterruptedException {
        System.out.println("App Settings");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //dashboardPage.dashboardSettings();
        androidDashboardPage.dashboardSettings();

    }

    public void changePIN() {
        settingsPage.changePIN();

    }

    public void changePassword() throws InterruptedException {
        settingsPage.changePassword();
        ((AndroidDriver)driver).pressKey(new KeyEvent((AndroidKey.BACK)));
    }

    public void reloadSettings() throws InterruptedException {
        settingsPage.reloadSettings();
    }

    public void synchronizedStatus() throws InterruptedException {
        settingsPage.synchronizationStatus();
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void systemDiagnostics() throws InterruptedException {
        settingsPage.systemDiagnostics();
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void barcodeScanner() throws InterruptedException {
        settingsPage.barcodeScanner();
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
        swipe.swipeToDown();
    }
}
