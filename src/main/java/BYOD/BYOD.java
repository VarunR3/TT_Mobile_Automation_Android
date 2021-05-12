package BYOD;

import PageObjects.BYODPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BYOD {
    private AppiumDriver<MobileElement> driver;

    private BYODPage byodPage;

    public BYOD(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.byodPage = new BYODPage(driver);
    }

    public void byodClockIn() throws InterruptedException {
        byodPage.byodClockIn();
    }
}
