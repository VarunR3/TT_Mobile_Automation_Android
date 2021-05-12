package PageObjects.DashboardPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DashboardPageFactory {

    public static DashboardPage createPage(AppiumDriver<MobileElement> driver) {

        if (driver instanceof AndroidDriver) {
            return new AndroidDashboardPage(driver);
        } else {
            return new iOSDashboardPage(driver);
        }
    }
}
