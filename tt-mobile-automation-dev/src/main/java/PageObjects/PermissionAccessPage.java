package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PermissionAccessPage extends BasePage {

    public PermissionAccessPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = TestElement.PERMISSION_ACCESS_ALLOW_BTN_ELEMENT)
    private MobileElement permissionAllowBtnElement;

    @AndroidFindBy(id = TestElement.PERMISSION_ACCESS_ALLOW_FOB_ELEMENT)
    private MobileElement permissionAllowFobElement;



    public void permissionAccess() {
        permissionAllowBtnElement.click();
        permissionAllowBtnElement.click();
//        permissionAllowFobElement.click();
//        permissionAllowFobElement.click();
        permissionAllowFobElement.click();
        permissionAllowBtnElement.click();
        permissionAllowBtnElement.click();
    }
}
