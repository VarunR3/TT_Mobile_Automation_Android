package PageObjects.TimeClockPage;

import PageObjects.BasePage;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;

public class AndroidTimeClockPage extends BasePage implements TimeClockPage {

    public AndroidTimeClockPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(accessibility = TestElement.CLOCK_IN_ELEMENT)
    private MobileElement clockInElement;

    @AndroidFindBy(id = TestElement.LOGIN_POPUP_WINDOWS_ELEMENT)
    private MobileElement loginPopWindowsElement;

    @AndroidFindBy(accessibility = TestElement.MENU_ON_ELEMENT)
    private MobileElement menuONElement;

    @AndroidFindBy(accessibility = TestElement.MENU_STANDBY_ELEMENT)
    private MobileElement menuStandByElement;

    @AndroidFindBy(accessibility = TestElement.MENU_OFF_ELEMENT)
    private MobileElement menuOFFElement;

    public void clickClockIn(){
        try {
            if(menuONElement.isDisplayed()){
                System.out.println("User has already clocked-in");
            }
            else{
                clockInElement.click();
            }
        }catch (NoSuchElementException e) {
            clockInElement.click();
        }
    }

    @Override
    public void clockIn() {

    }
}
