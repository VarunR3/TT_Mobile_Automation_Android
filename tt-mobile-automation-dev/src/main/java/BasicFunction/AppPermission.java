package BasicFunction;

import PageObjects.PermissionAccessPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class AppPermission {
    private int SLEEP_TIME = 2;

    private PermissionAccessPage permissionAccessPage;

    public AppPermission(AppiumDriver<MobileElement> driver) {
        this.permissionAccessPage = new PermissionAccessPage(driver);
    }

    public void appPermission() throws InterruptedException{
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        permissionAccessPage.permissionAccess();
    }
}
