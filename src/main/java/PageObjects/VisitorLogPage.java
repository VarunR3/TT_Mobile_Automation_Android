package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VisitorLogPage extends BasePage {


    private final static int SLEEP_TIME = 4;
    private final static String FIRST_NAME = "Maxwell";
    private final static String LAST_NAME = "Qiu";
    private final static String HOST_NAME = "Montreal";

    private Swipe swipe;



    public VisitorLogPage(AppiumDriver<MobileElement> driver) {

        super(driver);


    }



    private String getFullName(){
        return FIRST_NAME + " " + LAST_NAME;
    }

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_DASHBOARD_ELEMENT)
    private MobileElement dashboardVisitorLogElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_LOGIN_A_VISITOR_ELEMENT)
    private MobileElement logInAVisitorElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_SELECT_VISITOR_ELEMENT)
    private MobileElement selectVisitorElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_FIRST_NAME_ELEMENT)
    private MobileElement firstNameElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_LAST_NAME_ELEMENT)
    private MobileElement lastNameElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_SELECT_HOST_ELEMENT)
    private MobileElement selectHostElement;

    @AndroidFindBy(className = TestElement.VISITOR_SELECT_HOST_FROM_LIST_ELEMENT)
    private MobileElement selectHostFromListElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_SEND_BUTTON_ELEMENT)
    private MobileElement sendButtonElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_VIEW_CURRENT_VISITORS_ELEMENT)
    private MobileElement viewCurrentVisitorsElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_SCAN_DRIVER_LICENSE_ELEMENT)
    private MobileElement scanDriverLicenseElement;

    @AndroidFindBy(id = TestElement.VISITOR_LOG_BUTTON_BACK_ELEMENT)
    private MobileElement buttonBackElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_RELOAD_SETTINGS_ELEMENT)
    private MobileElement reloadSettingsElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_SEARCH_VISITORS_ELEMENT)
    private MobileElement searchVisitorsElement;

    @AndroidFindBy(id = TestElement.VISITOR_LOG_SEARCH_VISITOR_SEARCH_BAR_ELEMENT)
    private MobileElement searchVisitorSearchBarElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_SELECT_VISITOR_LIST_ELEMENT)
    private MobileElement selectVisitorListElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_VIEW_PROFILE_OPTION_ELEMENT)
    private MobileElement viewProfileOptionElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_HISTORY_TAB_ELEMENT)
    private MobileElement historyTabElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_ACTIONS_BUTTON_ELEMENT)
    private MobileElement actionsButtonElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_CHECKOUT_ELEMENT)
    private MobileElement checkOutElement;

    @AndroidFindBy(id = TestElement.VISITOR_LOG_CURRENT_VISITOR_SEARCH_ELEMENT)
    private MobileElement currentVisitorSearchElement;

    @AndroidFindBy(id = TestElement.VISITOR_LOG_SELECT_CURRENT_VISITOR_ELEMENT)
    private MobileElement selectCurrentVisitorElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_CHECKOUT_VISITOR_ELEMENT)
    private MobileElement checkoutVisitorElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_BUTTON_OK_ELEMENT)
    private MobileElement buttonOKElement;

    @AndroidFindBy(accessibility = TestElement.VISITOR_LOG_VISITOR_CHECK_IN_ELEMENT)
    private MobileElement visitorCheckInElement;

    @AndroidFindBy(xpath = TestElement.VISITOR_LOG_VISITOR_TYPE_ELEMENT)
    private MobileElement visitorTypeElement;

    @AndroidFindBy(id = TestElement.VISITOR_LOG_BTN_OK_WARNING_ELEMENT)
    private MobileElement btnOKWarningElement;


    public void logInVisitor() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("Log-in a Visitor");
      //  TimeUnit.SECONDS.sleep(SLEEP_TIME);
        logInAVisitorElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectVisitorElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        firstNameElement.click();
        firstNameElement.sendKeys(FIRST_NAME);
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        lastNameElement.click();
        lastNameElement.sendKeys(LAST_NAME);
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectHostElement.click();
        selectHostElement.sendKeys(HOST_NAME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.hideKeyboard();
        sendButtonElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }

    public void viewCurrentVisitor() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("View Current Visitor");
        dashboardVisitorLogElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewCurrentVisitorsElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        WebDriverWait wait = new WebDriverWait(driver, 10);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
        try{
            currentVisitorSearchElement.click();
            Thread.sleep(4000);

        }catch (Exception e){

            System.out.println(e.getMessage());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
            currentVisitorSearchElement.click();
            Thread.sleep(4000);
        }

        boolean b= false;

        while(b==false) {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
            try {
                currentVisitorSearchElement.sendKeys("Maxwell Qiu");
                Thread.sleep(4000);
                b = true;
                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());

                Thread.sleep(4000);
            }
        }

        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // currentVisitorSearchElement.sendKeys("Maxwell Qiu");
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectCurrentVisitorElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkoutVisitorElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        buttonOKElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.hideKeyboard();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void searchVisitor() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("Search Visitors");
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardVisitorLogElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchVisitorsElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchVisitorSearchBarElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchVisitorSearchBarElement.sendKeys("Maxwell Qiu");
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectVisitorListElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewProfileOptionElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        historyTabElement.click();
      //  TimeUnit.SECONDS.sleep(SLEEP_TIME);
        actionsButtonElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkOutElement.click();
    }

    public void searchVisitorCheckIn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("Search Visitors Check-In");
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardVisitorLogElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchVisitorsElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchVisitorSearchBarElement.click();
      //  TimeUnit.SECONDS.sleep(SLEEP_TIME);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        boolean b=false;
        while(b==false) {



            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.staffr.app:id/filter")));
                searchVisitorSearchBarElement.sendKeys("Maxwell Qiu");
                Thread.sleep(4000);
                b=true;
                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());
                Thread.sleep(4000);
            }

        }

       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectVisitorListElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        visitorCheckInElement.click();
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        visitorTypeElement.click();
        //TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectHostElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectHostElement.sendKeys(HOST_NAME);
       // TimeUnit.SECONDS.sleep(SLEEP_TIME);
        sendButtonElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.hideKeyboard();
    }

    public void tappingCameraButton() throws InterruptedException {
        System.out.println("Tapping on the Camera Button");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardVisitorLogElement.click();
        scanDriverLicenseElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        buttonBackElement.click();
    }

    public void tappingCameraButtonEmulator() throws InterruptedException {
        System.out.println("Tapping on the Camera Button");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardVisitorLogElement.click();
        btnOKWarningElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void reloadSettings() throws InterruptedException {
        System.out.println("Visitor Log Reload Settings");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        dashboardVisitorLogElement.click();
        reloadSettingsElement.click();
    }
}


