package PageObjects.ChangePositionPage;

import PageObjects.BasePage;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AndroidChangePositionPage extends BasePage implements ChangePositionPage {
    private static int SLEEP_TIME = 10;

    public AndroidChangePositionPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.POSITION_SEARCH_BAR_ELEMENT)
    private MobileElement searchBarElement;

    @AndroidFindBy(xpath = TestElement.SELECT_POSITION_ELEMENT)
    private MobileElement selectPositionElement;

//    @AndroidFindBy(xpath = TestElement.POSITION_BTN_CANCEL_ELEMENT)
//    private MobileElement btnCancelElement;

    @AndroidFindBy(xpath = TestElement.POSITION_BTN_OK_ELEMENT)
    private MobileElement btnOKElement;

    public void changePosition() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchBarElement.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean b= false;

        while(b==false) {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
            try {
                searchBarElement.sendKeys(POSITION_NAME);
                Thread.sleep(4000);
                b = true;
                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());

                Thread.sleep(4000);
            }
        }


        driver.hideKeyboard();
        selectPositionElement.click();
        //btnCancelElement.click();
       // selectPositionElement.click();
        btnOKElement.click();
    }
}
