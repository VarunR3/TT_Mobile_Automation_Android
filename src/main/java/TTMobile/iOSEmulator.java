package TTMobile;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class iOSEmulator extends Emulator{
    final static String APP = "/Users/varunrajkanchumarthi/Downloads/TrackTik.app";

    final static String SERVER_URL = "http://localhost:4723/wd/hub";
    final static int TIME_SLEEP = 4;
    final static String DEVICE_NAME = "iPhone 11";
    final static String UDID = "EA540C45-2B3A-4395-A83A-C0DC245811A2";
    final static String PLATFORM_NAME = "ios";
    final static String PLATFORM_VERSION = "14.4";
    final static String APP_PACKAGE = "com.tracktik.guardtour";
    final static String AUTOMATION_NAME = "IOS_XCUI_TEST";
        @BeforeTest

        @Override
        public void setup() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("autoAcceptAlerts", "true");
            capabilities.setCapability("databaseEnabled", "true");
            capabilities.setCapability("noRest", "false");
            capabilities.setCapability("full-reset", "false");
            capabilities.setCapability("deviceName", DEVICE_NAME);
            capabilities.setCapability("udid", UDID);
            capabilities.setCapability("platformName", PLATFORM_NAME);
            capabilities.setCapability("platformVersion", PLATFORM_VERSION);
            capabilities.setCapability("appPackage",APP_PACKAGE);
            capabilities.setCapability(MobileCapabilityType.APP, APP);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
           // capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
            driver = new IOSDriver(
                    new URL(SERVER_URL),
                    capabilities);
           // platformName = PLATFORM_NAME;
            super.setup();
        }

//    @AfterTest()
//    public void uninstallApp() {
//        driver.removeApp(APP_PACKAGE);
//    }
}
