package PageObjects.ChangePositionPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChangePositionPageFactory {

    public static ChangePositionPage createPage(AppiumDriver<MobileElement> driver) {

        if (driver instanceof AndroidDriver) {
            return new AndroidChangePositionPage(driver);
        } else {
            return new iOSChangePositionPage(driver);
        }
    }
}
