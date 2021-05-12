package PageObjects.TimeClockPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TimeClockPageFactory {

    public static TimeClockPage createPage(AppiumDriver<MobileElement> driver) {

        if (driver instanceof AndroidDriver) {
            return new AndroidTimeClockPage(driver);
        } else {
            return new iOSTimeClockPage(driver);
        }
    }
}
