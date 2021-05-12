package GeoFencing;

import PageObjects.LoginPage;
import PageObjects.SetupPage.SetupPage;
import PageObjects.SetupPage.SetupPageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class GeoFencing {
    private AndroidDriver<MobileElement> driver;
    private final static int SLEEP_TIME = 2;

    private LoginPage loginPage;
    private SetupPage setupPage;

    public GeoFencing(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.setupPage = SetupPageFactory.createPage(driver);
        this.loginPage = new LoginPage(driver);

    }
    public void loginWithinGeoFencing() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

}
