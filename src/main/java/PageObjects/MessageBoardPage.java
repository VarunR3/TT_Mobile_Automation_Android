package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class MessageBoardPage extends BasePage {

    private AndroidDriver<MobileElement> androidDriver;
    final static int SLEEP_TIME = 4;
    final static String COMMENTS = "QA Automation Test";
    final static String MESSAGE_NAME = "Announcement";
    private Swipe swipe;

    public MessageBoardPage(AppiumDriver<MobileElement> driver, Swipe swipe){
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(xpath = TestElement.MESSAGE_BOARD_POST_NEW_MESSAGE_ELEMENT)
    private MobileElement postNewMessageElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_CATEGORY_ELEMENT)
    private MobileElement categoryElement;

    @AndroidFindBy(xpath = TestElement.MESSAGE_BOARD_ANNOUNCEMENT_OPTION_ELEMENT)
    private MobileElement announcementOptionElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_COMMENT_BOX_ELEMENT)
    private MobileElement commentBoxElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_INCREASE_MONTH_ELEMENT)
    private MobileElement increaseMonthElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_DECREASE_MONTH_ELEMENT)
    private MobileElement decreaseMonthElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_INCREASE_DAY_ELEMENT)
    private MobileElement increaseDayElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_DECREASE_DAY_ELEMENT)
    private MobileElement decreaseDayElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_INCREASE_YEAR_ELEMENT)
    private MobileElement increaseYearElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_DECREASE_YEAR_ELEMENT)
    private MobileElement decreaseYearElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_PICTURE_ELEMENT)
    private MobileElement pictureElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_TAKE_PHOTO_ELEMENT)
    private MobileElement takePhotoElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_PHOTO_DONE_ELEMENT)
    private MobileElement photoDoneElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_BTN_SEND_ELEMENT)
    private MobileElement btnSendElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_MESSAGE_BOARD_ELEMENT)
    private MobileElement dashboardMessageBoardElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_NEW_MESSAGE_ELEMENT)
    private MobileElement newMessageElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_SEARCH_BAR_ELEMENT)
    private MobileElement searchBarElement;

    @AndroidFindBy(xpath = TestElement.MESSAGE_BOARD_SELECT_NEW_MESSAGE_ELEMENT)
    private MobileElement selectNewMessageElement;

    @AndroidFindBy(xpath = TestElement.MESSAGE_SEARCH_01)//
    private MobileElement selectTop1Message;

    @AndroidFindBy(xpath = TestElement.MESSAGE_BOARD_UNACKNOWLEDGED_MESSAGE_ELEMENT)
    private MobileElement unacknowledgedMessageElement;

    @AndroidFindBy(xpath = TestElement.MESSAGE_BOARD_ACKNOWLEDGE_ARCHIVE_MESSAGE_ELEMENT)
    private MobileElement acknowledgedArchiveMessageElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_ACKNOWLEDGE_MESSAGE_ELEMENT)
    private MobileElement  acknowledgeMessageElement;

    @AndroidFindBy(accessibility = TestElement.MESSAGE_BOARD_ARCHIVE_MESSAGE_ELEMENT)
    private MobileElement archiveMessageElement;

    public void postNewMessage() throws InterruptedException {
        postNewMessageElement.click();
        categoryElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        announcementOptionElement.click();
        commentBoxElement.click();
        commentBoxElement.sendKeys(COMMENTS);
        driver.hideKeyboard();
//        decreaseMonthElement.click();
//        decreaseDayElement.click();
//        pictureElement.click();
//        takePhotoElement.click();
//        photoDoneElement.click();
//        TimeUnit.SECONDS.sleep(SLEEP_TIME);
//        swipe.swipeToUp();
        btnSendElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void newMessage() throws InterruptedException {
        //dashboardMessageBoardElement.click();
        newMessageElement.click();
//        searchBarElement.click();
//        searchBarElement.sendKeys(MESSAGE_NAME);
        driver.hideKeyboard();
        //selectNewMessageElement.click();
        selectTop1Message.click();

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        unacknowledgedMessageElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //selectNewMessageElement.click();
        selectTop1Message.click();

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        acknowledgedArchiveMessageElement.click();

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();

        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }
}

