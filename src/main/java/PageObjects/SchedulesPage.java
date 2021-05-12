package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SchedulesPage extends BasePage{
    final static String SCHEDULE_USER = "Max";
    final static int SLEEP_TIME = 4;

    public SchedulesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = TestElement.SCHEDULES_SCHEDULE_USER_SEARCH_ELEMENT)
    private MobileElement scheduleUserSearchElement;

    @AndroidFindBy(xpath = TestElement.SCHEDULES_SEARCH_CLEAR_ELEMENT)
    private MobileElement searchClearElement;

    @AndroidFindBy(xpath = TestElement.SCHEDULES_SCHEDULE_ELEMENT)
    private MobileElement scheduleElement;

    @AndroidFindBy(xpath = TestElement.SCHEDULES_SEARCH_USER)
    private MobileElement scheduleuser;

    public void searchSchedules() throws Exception {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchClearElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        scheduleUserSearchElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("m");
        actions.keyUp(Keys.SHIFT);
        actions.build().perform();

        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("a");
        actions.keyUp(Keys.SHIFT);
        actions.build().perform();

        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("x");
        actions.keyUp(Keys.SHIFT);
        actions.build().perform();


//
//        try{
//            scheduleUserSearchElement.sendKeys("Maxwell Qiu");
//            Thread.sleep(5000);
//            scheduleuser.click();
//
//        }catch (Exception e){
//
//            System.out.println(e.getMessage());
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.MenuItem/android.view.View")));
//            scheduleuser.click();
//            Thread.sleep(4000);
//        }
       // scheduleUserSearchElement.sendKeys("Maxwell Qiu");
        //scheduleUserSearchElement.clear();

        //scheduleUserSearchElement.sendKeys("Maxwell Qiu");
       Thread.sleep(4000);
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // driver.hideKeyboard();
        scheduleuser.click();
    }

    public void verifyScheduleExit() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        try {
            //boolean b = driver.findElementByXPath("//android.view.View[@text='Maxwell Qiu @ Maxwell_Department']").isDisplayed();

            boolean b = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.GridView/android.view.View[1]/android.view.View/android.view.View[1]").isDisplayed();

            //boolean b=driver.findElementByImage("android.view.View/android.widget.Image").isDisplayed();

            //*[contains(text(),'Maxwell')]

            if (b == true) {
                System.out.println("Schedule exits");

                driver.navigate().back();
                driver.navigate().back();
            } else {
                System.out.println("schedule doesn't exit");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
