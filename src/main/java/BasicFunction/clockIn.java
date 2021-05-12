package BasicFunction;

import PageObjects.PermissionAccessPage;
import PageObjects.TimeClockPage.AndroidTimeClockPage;
import PageObjects.TimeClockPage.TimeClockPage;
import PageObjects.TimeClockPage.TimeClockPageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class clockIn {

   // private int SLEEP_TIME = 2;
    //private AppiumDriver<MobileElement> driver;

    //private TimeClockPage timeClockPage;

    private AndroidTimeClockPage androidTimeClockPage;

    public clockIn(AppiumDriver<MobileElement> driver) {
       // this.driver = driver;
        //this.timeClockPage = TimeClockPageFactory.createPage(driver);
        this.androidTimeClockPage = new AndroidTimeClockPage(driver);

    }

    public void clockIn() {
       // timeClockPage.clockIn();
        androidTimeClockPage.clickClockIn();

    }
}
