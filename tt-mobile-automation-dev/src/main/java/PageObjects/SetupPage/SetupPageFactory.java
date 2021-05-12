package PageObjects.SetupPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetupPageFactory {

    public static SetupPage createPage(AppiumDriver<MobileElement> driver) {

        if (driver instanceof AndroidDriver) {
            return new AndroidSetupPage(driver);
        }else {
            return new iOSSetupPage(driver);
        }
    }
}
