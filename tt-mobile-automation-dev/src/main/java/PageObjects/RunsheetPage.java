package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class RunsheetPage extends BasePage{
    Swipe swipe;
    final static int SLEEP_TIME = 4;
    final static String RUNSHEET_NAME = "Maxwell_Site1";

    public RunsheetPage(AppiumDriver<MobileElement> driver, Swipe swipe) {
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(id = TestElement.RUNSHEET_SELECT_RUNSHEET_ELEMENT)
    private MobileElement selectRunsheetElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_SELECT_CURRENT_RUNSHEET_ELEMENT)
    private MobileElement selectCurrentRunsheetElement;

    @AndroidFindBy(id = TestElement.RUNSHEET_START_RUNSHEET_ELEMENT)
    private MobileElement startRunsheetElement;

    @AndroidFindBy(id = TestElement.RUNSHEET_BTN_RUNSHEET_RELOAD_ELEMENT)
    private MobileElement btnRunsheetReloadElement;

    @AndroidFindBy(id = TestElement.RUNSHEET_BTN_OK_ELEMENT)
    private MobileElement btnOKElement;

    @AndroidFindBy(accessibility = TestElement.RUNSHEET_SEARCH_BAR_ELEMENT)
    private MobileElement searchBarElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_ON_ROUTE_ELEMENT)
    private MobileElement onRouteElement;

    @AndroidFindBy(accessibility = TestElement.RUNSHEET_CHOOSE_RUNSHEET_ELEMENT)
    private MobileElement chooseRunsheetElement;

    @AndroidFindBy(accessibility = TestElement.RUNSHEET_NAVIGATE_TO_SITE_ELEMENT)
    private MobileElement navigateToSiteElement;

    @AndroidFindBy(id = TestElement.RUNSHEET_CURRENT_RUNSHEET_TASK_ELEMENT)
    private MobileElement currentRunsheetTaskElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_POSTPONE_LATER_ELEMENT)
    private MobileElement postponeLaterElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_BTN_YES_OPTION_ELEMENT)
    private MobileElement btnYesOptionElement;

    @AndroidFindBy(accessibility= TestElement.RUNSHEET_REQUEST_REASSIGNMENT_ELEMENT)
    private MobileElement requestReassignmentElement;

    @AndroidFindBy(accessibility = TestElement.RUNSHEET_ARRIVE_ON_SITE_ELEMENT)
    private MobileElement arriveOnSiteElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_VIEW_SITE_INSTRUCTION_ELEMENT)
    private MobileElement viewSiteInstructionElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_VIEW_SITE_POST_ORDERS_ELEMENT)
    private MobileElement viewSitePostOrdersElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_FINISH_JOB_ELEMENT)
    private MobileElement finishJobElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_BTN_OPTIMIZE_ELEMENT)
    private MobileElement btnOptimizeElement;

    @AndroidFindBy(xpath = TestElement.RUNSHEET_BTN_FINISH_ELEMENT)
    private MobileElement btnFinishElement;

    public void selectRunsheet() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

        MobileElement Rsheet = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\"Wednesday / 08:00 AM - 11:00 PM / Position_Test / Mobile Automation Runsheet1\"));"));
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        Rsheet.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOKElement.click();



    }

    public void startRunsheet() throws InterruptedException {
        //startRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnRunsheetReloadElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOKElement.click();
    }

    public boolean verifyRunsheetElementDisplays() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        try{
            driver.findElementById("com.staffr.app:id/header_section");
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean runsheetOnRoute() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
//        searchBarElement.click();
//        searchBarElement.sendKeys(RUNSHEET_NAME);
//        driver.hideKeyboard();
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        onRouteElement.click();
        try{
            driver.findElementByXPath("//android.widget.TextView[@text='Status: On Route']");
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

    public void navigateToSite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        navigateToSiteElement.click();
        Thread.sleep(20000);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
    }

    public void postponeLater() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        postponeLaterElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnYesOptionElement.click();
    }

    public void requestReassignment() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        requestReassignmentElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnYesOptionElement.click();
    }

    public void arriveOnSite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        arriveOnSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOKElement.click();
    }

    public void viewSiteInstructions() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewSiteInstructionElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOKElement.click();
    }

    public void viewSitePostOrders() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewSitePostOrdersElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();

    }

    public void finishJob() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseRunsheetElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        finishJobElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void optimize() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOptimizeElement.click();
        btnOKElement.click();
    }

    public void finish() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnFinishElement.click();
    }
}
