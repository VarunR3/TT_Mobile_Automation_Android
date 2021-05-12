package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SitesPage extends BasePage{
    private static int SLEEP_TIME = 4;
    private static String SITE_NAME = "Maxwell_Site1";

    public SitesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = TestElement.SITES_SEARCH_BAR_ELEMENT)
    private MobileElement searchBarElement;

    @AndroidFindBy(xpath = TestElement.SITES_SELECT_STIES_ELEMENT)
    private MobileElement selectSiteElement;

    @AndroidFindBy(xpath = TestElement.SITES_SIGN_IN_TO_SITE_ELEMENT)
    private MobileElement signInToSiteElement;

    @AndroidFindBy(xpath = TestElement.SITES_NAVIGATE_TO_SITE_ELEMENT)
    private MobileElement navigateToSiteElement;

    @AndroidFindBy(xpath = TestElement.SITES_VIEW_SITE_SCHEDULE_ELEMENT)
    private MobileElement viewSiteScheduleElement;

    @AndroidFindBy(id = TestElement.SITES_BTN_OK_ELEMENT)
    private MobileElement btnOKElement;

    @AndroidFindBy(id = TestElement.SITES_SITE_DESCRIPTION_ELEMENT)
    private MobileElement siteDescriptionElement;

    @AndroidFindBy(id = TestElement.SITES_LEAVE_SITE_MESSAGE_ELEMENT)
    private MobileElement leaveSiteMessageElement;

    @AndroidFindBy(id = TestElement.SITES_SITE_COUNTER_ELEMENT)
    private MobileElement siteCounterElement;

    @AndroidFindBy(id = TestElement.SITES_OPTION_OK_ELEMENT)
    private MobileElement optionOKElement;

    @AndroidFindBy(xpath = TestElement.SITES_DASHBOARD_SITES_ELEMENT)
    private MobileElement dashboardSitesElement;

    public void signInToSite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchBarElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
        try{
            searchBarElement.sendKeys(SITE_NAME);
            Thread.sleep(4000);

        }catch (Exception e){

            System.out.println(e.getMessage());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
            searchBarElement.sendKeys(SITE_NAME);
            Thread.sleep(4000);
        }
        //searchBarElement.sendKeys(SITE_NAME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // driver.hideKeyboard();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        signInToSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOKElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public boolean verifyCurrentSiteBannerDisplays() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        try{
            driver.findElementById("com.staffr.app:id/site_description");
            driver.findElementByXPath("//android.widget.TextView[@text='Click to leave site and return to zone']");
            driver.findElementById("com.staffr.app:id/site_counter");
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

    public void navigateToSite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //dashboardSitesElement.click();
        searchBarElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchBarElement.sendKeys(SITE_NAME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        navigateToSiteElement.click();
        Thread.sleep(20000);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void viewSiteSchedule() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewSiteScheduleElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void leaveSite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        leaveSiteMessageElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        optionOKElement.click();
    }
}
