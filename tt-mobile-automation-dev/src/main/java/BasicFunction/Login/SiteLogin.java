package BasicFunction.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SiteLogin extends BaseLogin{

    private final static String ANDROID_INSTALLATION_CODE = "575LFCE";
    private final static String IOS_INSTALLATION_CODE = "914L72B";

    @Override
    protected String getAndroidInstallationCode() {
        return ANDROID_INSTALLATION_CODE;
    }

    @Override
    protected String getIOSInstallationCode() {
        return IOS_INSTALLATION_CODE;
    }

    public SiteLogin(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
