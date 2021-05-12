package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;


public class DispatchTasksPage extends BasePage {
    private final static int SLEEP_TIME = 4;
    private final static String ADD_COMMENTS = "QA Testing";
    private Swipe swipe;

    public DispatchTasksPage(AppiumDriver<MobileElement> driver, Swipe swipe) {
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(id = TestElement.MOBILE_DISPATCH_BTN_RELOAD_ELEMENT)
    private MobileElement btnReloadElement;

    @AndroidFindBy(id = TestElement.MOBILE_DISPATCH_SHOW_MORE_ELEMENT)
    private MobileElement showMoreElement;

    @AndroidFindBy(xpath = TestElement.SELECT_DISPATCH_TASK_ELEMENT)
    private MobileElement selectDispatchTasksElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_COMMENT_ELEMENT)
    private MobileElement btnCommentsElement;

    @AndroidFindBy(id = TestElement.MOBILE_DISPATCH_BTN_ADD_COMMENTS_ELEMENT)
    private MobileElement btnAddCommentElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_ADD_COMMENTS_ELEMENT)
    private MobileElement addCommentsElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_SEND_COMMENTS_ELEMENT)
    private MobileElement sendCommentsElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_INFO_ELEMENT)
    private MobileElement infoElement;

    @AndroidFindBy(id = TestElement.MOBILE_DISPATCH_BTN_NAVIGATE_ELEMENT)
    private MobileElement btnNavigateElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_REFUSE_ELEMENT)
    private MobileElement btnRefuseElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_ACCEPTED_PENDING_ELEMENT)
    private MobileElement btnAcceptedPendingElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_ON_THE_WAY_EDIT_ELEMENT)
    private MobileElement btnOnTheWayEditElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_ON_THE_WAY_ELEMENT)
    private MobileElement btnOnTheWayElement;

    @AndroidFindBy(id = TestElement.MOBILE_DISPATCH_BTN_FILL_OUT_REPORT_ELEMENT)
    private MobileElement btnFillOutReportElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_SEND_ELEMENT)
    private MobileElement btnSendElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_ARRIVED_ON_SITE_ELEMENT)
    private MobileElement btnArrivedOnSiteElement;

    @AndroidFindBy(xpath = TestElement.MOBILE_DISPATCH_BTN_ALL_CLEAR_ELEMENT)
    private MobileElement btnAllClearElement;

    public void viewDispatchTasks() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnReloadElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        showMoreElement.click();
        int i;
        for (i= 0; i<=2; i++) {
            showMoreElement.click();
        }
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectDispatchTasksElement.click();
    }

    public void addComments() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnCommentsElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnAddCommentElement.click();
        btnAddCommentElement.sendKeys(ADD_COMMENTS);
        sendCommentsElement.click();
        infoElement.click();
    }

    public void siteLocationNavigate() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnNavigateElement.click();
        Thread.sleep(20000);
        driver.navigate().back();
        driver.navigate().back();
    }

    public void dispatchTaskStatus() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        btnAcceptedPendingElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnSendElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnOnTheWayElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnSendElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnArrivedOnSiteElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnSendElement.click();
    }

    public void fillOutReport() throws  InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnFillOutReportElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void allClear() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnAllClearElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnSendElement.click();
        Thread.sleep(20000);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
    }
}
