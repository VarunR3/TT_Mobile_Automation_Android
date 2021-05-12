package BasicFunction.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ZoneLogin extends BaseLogin {

    private final static String ANDROID_INSTALLATION_CODE = "736LC36";
    private final static String IOS_INSTALLATION_CODE = "915L34D";

    @Override
    protected String getAndroidInstallationCode() {
        return ANDROID_INSTALLATION_CODE;
    }

    @Override
    protected String getIOSInstallationCode() {
        return IOS_INSTALLATION_CODE;
    }

    public ZoneLogin(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
