package PageObjects;

import PageObjects.DashboardPage.AndroidDashboardPage;
import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class SettingPage extends BasePage {
    private final static int SLEEP_TIME = 4;
    private final static String OLD_PASSWORD = "Tracktik2020!!!!";
    private final static String NEW_PASSWORD = "Tracktik2020!!!!";
    private final static String USERNAME = "MQiu";
    private Swipe swipe;
    private AndroidDashboardPage androidDashboardPage;

    public SettingPage(AppiumDriver<MobileElement> driver, Swipe swipe) {
        super(driver);
        this.swipe = swipe;
        this.androidDashboardPage=new AndroidDashboardPage(driver);
    }


    @AndroidFindBy(accessibility = TestElement.SETTING_DASHBOARD_ELEMENT)
    private MobileElement dashboardSettingsElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_CHANGE_PIN_ELEMENT)
    private MobileElement changePINElement;

    @AndroidFindBy(id = TestElement.SETTING_PIN_NUMBER_ELEMENT)
    private MobileElement pinNumberElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_CHANGE_PASSWORD_ELEMENT)
    private MobileElement changePasswordElement;

    @AndroidFindBy(id = TestElement.SETTING_OLD_PASSWORD_ELEMENT)
    private MobileElement oldPasswordElement;

    @AndroidFindBy(id = TestElement.SETTING_NEW_PASSWORD_ELEMENT)
    private MobileElement newPasswordElement;

    @AndroidFindBy(id = TestElement.SETTING_CONFIRMED_NEW_PASSWORD_ELEMENT)
    private MobileElement confirmedNewPasswordElement;

    @AndroidFindBy(id = TestElement.SETTING_BUTTON_SAVE_ELEMENT)
    private MobileElement buttonSaveElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_DASHBOARD_TIME_CLOCK_ELEMENT)
    private MobileElement dashboardTimeClockElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_SIGN_OUT_ELEMENT)
    private MobileElement signOutElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_USERNAME_ELEMENT)
    private MobileElement usernameElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_PASSWORD_ELEMENT)
    private MobileElement passwordElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_SIGN_IN_ELEMENT)
    private MobileElement signInElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_CLOCK_IN_ELEMENT)
    private MobileElement clockInElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_RELOAD_SETTING_ELEMENT)
    private MobileElement reloadSettingsElement;

    @AndroidFindBy(id = TestElement.SETTING_POPUP_WINDOWS_ELEMENT)
    private MobileElement popupWindowsElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_CLOCK_OUT_SIGN_IN_ELEMENT)
    private MobileElement clockOutSignInElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_SYNCHRONIZATION_ELEMENT)
    private MobileElement synchronizationElement;

    @AndroidFindBy(id = TestElement.SETTING_RELOAD_ELEMENT)
    private MobileElement reloadElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_SYSTEM_DIAGNOSTICS_ELEMENT)
    private MobileElement systemDiagnosticsElement;

    @AndroidFindBy(accessibility = TestElement.SETTING_BARCODE_SCANNER_ELEMENT)
    private MobileElement barcodeScannerElement;

    @AndroidFindBy(id = TestElement.SETTING_CHECK_BOX_ELEMENT)
    private MobileElement checkBoxElement;

    @AndroidFindBy(id = TestElement.SETTING_BTN_OK_ELEMENT)
    private MobileElement btnOKElement;

    public void changePIN()  {
        System.out.println("Change PIN");
        changePINElement.click();
        int i;
        for (i= 0; i<=7; i++) {
            pinNumberElement.click();
        }
    }

    public void changePassword() throws InterruptedException {
        System.out.println("Change Password");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        dashboardSettingsElement.click();
        changePasswordElement.click();
        oldPasswordElement.sendKeys(OLD_PASSWORD);
        newPasswordElement.sendKeys(NEW_PASSWORD);
        confirmedNewPasswordElement.sendKeys(NEW_PASSWORD);
        buttonSaveElement.click();
        btnOKElement.click();
        driver.hideKeyboard();
    }

    public void reloadSettings() throws InterruptedException {
        System.out.println("Reload Phone Settings");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        //dashboardSettingsElement.click();
        androidDashboardPage.dashboardSettings();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        reloadSettingsElement.click();
        System.out.println("A message will pop up");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        popupWindowsElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        clockOutSignInElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // dashboardSettingsElement.click();
        androidDashboardPage.dashboardSettings();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        reloadSettingsElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void synchronizationStatus() throws InterruptedException {
        System.out.println("Synchronized Status");
        dashboardTimeClockElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        clockInElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //dashboardSettingsElement.click();
        androidDashboardPage.dashboardSettings();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        synchronizationElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        reloadElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void systemDiagnostics() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // dashboardSettingsElement.click();
        androidDashboardPage.dashboardSettings();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        systemDiagnosticsElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
    }

    public void barcodeScanner() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        dashboardSettingsElement.click();
        barcodeScannerElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        int i;
        for (i= 0; i<=1; i++) {
            checkBoxElement.click();
        }
    }
}
