package BasicFunction.Login;

import PageObjects.LoginPage;
import PageObjects.SetupPage.SetupPage;
import PageObjects.SetupPage.SetupPageFactory;
import PageObjects.TimeClockPage.TimeClockPage;
import PageObjects.TimeClockPage.TimeClockPageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class DepartmentLogin extends BaseLogin{

    private final static String ANDROID_INSTALLATION_CODE = "D865LE0A";
    private final static String IOS_INSTALLATION_CODE = "916L487";

    @Override
    protected String getAndroidInstallationCode() {
        return ANDROID_INSTALLATION_CODE;
    }

    @Override
    protected String getIOSInstallationCode() {
        return IOS_INSTALLATION_CODE;
    }

    public DepartmentLogin(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
