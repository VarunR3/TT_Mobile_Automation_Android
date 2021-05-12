package TTMobile;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class AndroidEmulator extends Emulator{
    final static String APP = "/Users/varunrajkanchumarthi/Downloads/guardTracker-5.12.5-tracktik-release.apk";

    final static String SERVER_URL_ANDROID = "http://localhost:4723/wd/hub";
    final static int TIME_SLEEP = 4;
    final static String DEVICE_NAME = "Android SDK built for x86";
    final static String UDID = "emulator-5554";
    final static String PLATFORM_NAME = "Android";
    final static String PLATFORM_VERSION = "10";
    final static String APP_PACKAGE = "com.staffr.app";
    final static String APP_ACTIVITY = "com.staffr.app.GuardTrackerActivity";
    @BeforeTest

    @Override
    public void setup() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("autoGrantPermissions", "false");
            capabilities.setCapability("databaseEnabled", "true");
            capabilities.setCapability("noRest", "false");
            capabilities.setCapability("full-reset", "false");
            capabilities.setCapability("deviceName", DEVICE_NAME);
            capabilities.setCapability("udid", UDID);
            capabilities.setCapability("platformName", PLATFORM_NAME);
            capabilities.setCapability("platformVersion", PLATFORM_VERSION);
            capabilities.setCapability("appPackage",APP_PACKAGE);
            capabilities.setCapability("appActivity", APP_ACTIVITY);
            capabilities.setCapability("app", APP);
            driver = new AndroidDriver(
                    new URL(SERVER_URL_ANDROID),
                    capabilities);
            platformName = PLATFORM_NAME;
            super.setup();
        }

   // @AfterTest()
    //public void uninstallApp() {
       // driver.removeApp(APP_PACKAGE);
   // }
}
