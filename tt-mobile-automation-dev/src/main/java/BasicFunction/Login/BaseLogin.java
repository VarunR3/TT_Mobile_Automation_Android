package BasicFunction.Login;

import PageObjects.*;
import PageObjects.SetupPage.SetupPage;
import PageObjects.SetupPage.SetupPageFactory;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseLogin  {
    private final static String BASE_URL = "https://smoke.staffr.net";
    private final static String USERNAME = "MQiu";
    private final static String PASSWORD = "Tracktik2020!!!!";
    private final static int SLEEP_TIME = 2;

    protected abstract String getAndroidInstallationCode();
    protected abstract String getIOSInstallationCode();

    private SetupPage setupPage;
    private LoginPage loginPage;
    private String installationCode;


    public BaseLogin(AppiumDriver<MobileElement> driver){
        this.setupPage = SetupPageFactory.createPage(driver);
        this.loginPage = new LoginPage(driver);
        if (driver instanceof AndroidDriver) {
            this.installationCode = getAndroidInstallationCode();
        }
        else {
            this.installationCode = getIOSInstallationCode();
        }
    }

    public void guardLogin() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

        setupPage.setBaseUrl(BASE_URL);
        setupPage.setSetupCode(installationCode);
        setupPage.clickInstall();
        setupPage.checkLicenseUsage();
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickSubmit();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }
}
