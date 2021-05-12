package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ReportBrowsePage extends BasePage {
    private final static int SLEEP_TIME = 4;
    private final static String REPORT_NAME = "Ma";
    private final static String TEXT_BOX = "QA Modify the Report";
    private final static String COMMENT_BOX = "QA Modify the Report";
    private final static String NUMBER = "222222";
    private Swipe swipe;

    public ReportBrowsePage(AppiumDriver<MobileElement> driver, Swipe swipe) {
        super(driver);
        this.swipe = swipe;
    }

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_ELEMENT)
    private MobileElement browseReportElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_VIEW_MY_SITE_REPORT_ELEMENT)
    private MobileElement viewMySiteReportElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_SEARCH_REPORT_ELEMENT)
    private MobileElement searchReportElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_SELECT_VIEW_REPORT_LIST_ELEMENT)
    private MobileElement selectViewReportListElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_CHOOSE_OPTION_VIEW_ELEMENT)
    private MobileElement chooseOptionViewElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_SELECT_EDIT_REPORT_LIST_ELEMENT)
    private MobileElement selectEditReportListElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_CHOOSE_OPTION_EDIT_ELEMENT)
    private MobileElement chooseOptionEditElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_EDIT_TEXT_BOX_ELEMENT)
    private MobileElement editTextBoxElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_EDIT_COMMENT_BOX_ELEMENT)
    private MobileElement editCommentBoxElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_EDIT_NUMBER_ELEMENT)
    private MobileElement editNumberElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_EDIT_PICTURE_ELEMENT)
    private MobileElement editPictureElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_TAKE_PHOTO_ELEMENT)
    private MobileElement takePhotoElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_OK_PHOTO_ELEMENT)
    private MobileElement oKbtn;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_PHOTO_DONE_ELEMENT)
    private MobileElement photoDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_GALLERY_PICTURE_ELEMENT)
    private MobileElement galleryPictureElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_SELECT_PICTURE_ELEMENT)
    private MobileElement selectPictureElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_SIGNATURE_SECTION_ELEMENT)
    private MobileElement signatureSectionElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_SIGN_CLEAR_ELEMENT)
    private MobileElement signClearElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_SIGN_DONE_ELEMENT)
    private MobileElement signDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_EDIT_CHECKBOX_ELEMENT)
    private MobileElement editCheckboxElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_LIST_INCIDENT_ELEMENT)
    private MobileElement listIncidentElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_SELECT_LIST_INCIDENT_ELEMENT)
    private MobileElement selectListIncidentElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_UNSECURED_TYPE_ELEMENT)
    private MobileElement unsecuredTypeElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_CHOOSE_ONE_ELEMENT)
    private MobileElement chooseOneElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_LIST_PICKER_ELEMENT)
    private MobileElement listPickerElement;

    @AndroidFindBy(xpath = TestElement.REPORT_BROWSE_CHOOSE_ONE2_ELEMENT)
    private MobileElement chooseOne2Element;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DRAW_VEHICLE_ELEMENT)
    private MobileElement drawVehicleElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_VEHICLE_CLEAR_ELEMENT)
    private MobileElement drawClearElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_VEHICLE_DONE_ELEMENT)
    private MobileElement drawDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DRAW_INJURY_ELEMENT)
    private MobileElement drawInjuryElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_INJURY_CLEAR_ELEMENT)
    private MobileElement drawInjuryClearElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_INJURY_ELEMENT_DONE)
    private MobileElement drawInjuryDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DRAW_TRAILER_ELEMENT)
    private MobileElement drawTrailerElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_TRAILER_CLEAR_ELEMENT)
    private MobileElement drawTrailerClearElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_TRAILER_DONE_ELEMENT)
    private MobileElement drawTrailerDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DRAW_GOLF_CART_ELEMENT)
    private MobileElement drawGolfCartElement;

    @AndroidFindBy(id = TestElement.REPORT_BROWSE_DRAW_GOLF_CART_CLEAR_ELEMENT)
    private MobileElement drawGolfCartClearElement;

    @AndroidFindBy(id =TestElement.REPORT_BROWSE_DRAW_GOLF_CART_DONE_ELEMENT)
    private MobileElement drawGolfCartDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_INCREASE_HOUR_ELEMENT)
    private MobileElement increaseHourElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DECREASE_HOUR_ELEMENT)
    private MobileElement decreaseHourElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_INCREASE_MONTH_ELEMENT)
    private MobileElement increaseMonthElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DECREASE_MINUTE_ELEMENT)
    private MobileElement decreaseMinuteElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_DECREASE_DAY_ELEMENT)
    private MobileElement decreaseDayElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_INCREASE_YEAR_ELEMENT)
    private MobileElement increaseYearElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_BROWSE_BUTTON_SEND_ELEMENT)
    private MobileElement buttonSendElement;

    public void viewMySiteReport() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        browseReportElement.click();
        System.out.println("User verify the report");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        viewMySiteReportElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectViewReportListElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseOptionViewElement.click();
        swipe.swipeToUp();
        swipe.swipeToUp();
        swipe.swipeToUp();
    }

    public void editMySiteReportsTextBox() throws InterruptedException{
        System.out.println("Edit My Site Report");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectViewReportListElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectEditReportListElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //chooseOptionEditElement.click();
        System.out.println("Edit My Site Report--- Textbox");
        Actions A = new Actions(driver);

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        editTextBoxElement.click();
        editTextBoxElement.clear();
        editTextBoxElement.sendKeys(TEXT_BOX);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        editCommentBoxElement.clear();
        editCommentBoxElement.click();
        editCommentBoxElement.sendKeys(COMMENT_BOX);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        editNumberElement.click();
        editNumberElement.clear();
        editNumberElement.sendKeys(NUMBER);
    }

    public void editMySiteReportPictures() throws InterruptedException {
        System.out.println("Edit My Site Report -- Pictures");

        driver.hideKeyboard();
        Actions A = new Actions(driver);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        editPictureElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        takePhotoElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        oKbtn.click();

        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        galleryPictureElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectPictureElement.click();
    }

    public void editSignature() throws InterruptedException {
        System.out.println("Edit My Site Report -- Signature");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        signatureSectionElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        signClearElement.click();
        swipe.swipeToLeft();
        signDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }

    public void editCheckbox() throws InterruptedException {
        System.out.println("Edit My Site Report -- Checkbox");
        Actions A = new Actions(driver);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        editCheckboxElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        editCheckboxElement.click();
    }

    public void editListIncidentBox() throws InterruptedException {
        System.out.println("Edit My Site Report -- List Incident Box");
        Actions A = new Actions(driver);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        listIncidentElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectListIncidentElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        unsecuredTypeElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseOneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        listPickerElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseOne2Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void editDrawSection() throws InterruptedException {
        System.out.println("Edit My Site Report -- Draw Section");
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        drawVehicleElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        drawClearElement.click();
        swipe.swipeToUp();
        drawDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        drawInjuryElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        drawInjuryClearElement.click();
        swipe.swipeToUp();
        drawInjuryDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        drawTrailerElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        drawTrailerClearElement.click();
        swipe.swipeToUp();
        drawTrailerDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // swipe.swipeToUp();
        drawGolfCartElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        drawGolfCartClearElement.click();
        swipe.swipeToUp();
        drawGolfCartDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void editSelectTime() {
        System.out.println("Edit My Site Report -- Select Time & Date");
        increaseHourElement.click();
        decreaseMinuteElement.click();
        decreaseMinuteElement.click();
        swipe.swipeToUp();
        increaseMonthElement.click();
        increaseMonthElement.click();
        decreaseDayElement.click();
        increaseYearElement.click();

    }
    public void sendNewReport() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        buttonSendElement.click();
        Thread.sleep(20000);
        System.out.println("The New Report is sent By Maxwell Qiu ");
        Thread.sleep(10000);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }


}
