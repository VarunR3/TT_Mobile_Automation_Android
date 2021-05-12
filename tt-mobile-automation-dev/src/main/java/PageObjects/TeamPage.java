package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TeamPage extends BasePage{
    final static int SLEEP_TIME = 4;
    final static String MEMBER_NAME = "Maxwell Qiu";
    private Swipe swipe;

    public TeamPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(id = TestElement.TEAM_SEARCH_BAR_ELEMENT)
    private MobileElement searchBarElement;

    @AndroidFindBy(xpath = TestElement.TEAM_SELECT_MEMBER_ELEMENT)
    private MobileElement selectMemberElement;

    @AndroidFindBy(id = TestElement.TEAM_CALL_MEMBER_ELEMENT)
    private MobileElement callMemberElement;


    public void callMember() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchBarElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        boolean b= false;

        while(b==false) {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
            try {
                searchBarElement.sendKeys(MEMBER_NAME);
                Thread.sleep(4000);
                b = true;
                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());

                Thread.sleep(4000);
            }
        }
        //searchBarElement.sendKeys(MEMBER_NAME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.hideKeyboard();
        selectMemberElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        callMemberElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }
}
