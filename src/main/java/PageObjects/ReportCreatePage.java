package PageObjects;

import Resource.Swipe;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import javafx.scene.input.KeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ReportCreatePage extends BasePage{
    final static int SLEEP_TIME = 4;
    private AndroidDriver<MobileElement> androidDriver;
    final static String REPORT_NAME = "Max Custom Report(all fields)";
    final static String TEXT_BOX = "QA Test";
    final static String COMMENT_BOX = "Mobile Automation Testing";
    final static String NUMBER = "111111";
    Swipe swipe;

    public ReportCreatePage(AppiumDriver<MobileElement> driver, Swipe swipe) {
        super(driver);
        this.swipe = swipe;
    }


    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_ELEMENT)
    private MobileElement createReportElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_SEARCH_REPORT_ELEMENT)
    private MobileElement searchReportElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_CUSTOM_REPORT_ELEMENT)
    private MobileElement customReportElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_TEXT_BOX_ELEMENT)
    private MobileElement textBoxElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_COMMENT_BOX_ELEMENT)
    private MobileElement commentBoxElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_NUMBER_ELEMENT)
    private MobileElement numberElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_PICTURE_ELEMENT)
    private MobileElement pictureElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_TAKE_PHOTO_ELEMENT)
    private MobileElement takePhotoElement;


    @AndroidFindBy(id = TestElement.REPORT_CREATE_OK_PHOTO_ELEMENT)
    private MobileElement oKbtn;


    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_PHOTO_DONE_ELEMENT)

    private MobileElement doneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_GALLERY_PICTURE_ELEMENT)
    private MobileElement galleryPictureElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_SELECT_PICTURE_ELEMENT)
    private MobileElement selectPictureElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_SIGNATURE_SECTION_ELEMENT)
    private MobileElement signatureSectionElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_SIGN_CLEAR_ELEMENT)
    private MobileElement signClearElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_SIGN_DONE_ELEMENT)
    private MobileElement signDoneElement;

    // listIncident
    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_CHECKBOX_ELEMENT)
    private MobileElement checkboxElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_LIST_INCIDENT_ELEMENT)
    private MobileElement listIncidentElement;

    @AndroidFindBy( xpath= TestElement.REPORT_CREATE_UNSECURED_DOOR_ELEMENT)
    private MobileElement unsecuredDoorElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_UNSECURED_TYPE_ELEMENT)
    private MobileElement unsecuredTypeElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_CHOOSE_TYPE_ELEMENT)
    private MobileElement chooseTypeElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_LIST_PICKER_ELEMENT)
    private MobileElement listPickerElement;

    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_SELECT_POSITION_ELEMENT)
    private MobileElement selectPositionElement;

    // drawVehicle
    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DRAW_VEHICLE_ELEMENT)
    private MobileElement drawVehicleElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_VEHICLE_CLEAR_ELEMENT)
    private MobileElement drawVehicleClearElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_VEHICLE_DONE_ELEMENT)
    private MobileElement drawVehicleDoneElement;

    // drawSection
    @AndroidFindBy(xpath = TestElement.REPORT_CREATE_DRAW_INJURY_ELEMENT)
    private MobileElement drawInjuryElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_INJURY_CLEAR_ELEMENT)
    private MobileElement drawInjuryClearElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_INJURY_DONE_ELEMENT)
    private MobileElement drawInjuryDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DRAW_TRAILER_ELEMENT)
    private MobileElement drawTrailerElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_TRAILER_CLEAR_ELEMENT)
    private MobileElement drawTrailerClearElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_TRAILER_DONE_ELEMENT)
    private MobileElement drawTrailerDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DRAW_GOLF_CART_ELEMENT)
    private MobileElement drawGolfCartElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_GOLF_CART_CLEAR_ELEMENT)
    private MobileElement drawGolfCartClearElement;

    @AndroidFindBy(id = TestElement.REPORT_CREATE_DRAW_GOLF_CART_DONE_ELEMENT)
    private MobileElement drawGolfCartDoneElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_INCREASE_HOUR_ELEMENT)
    private MobileElement increaseHourElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DECREASE_HOUR_ELEMENT)
    private MobileElement decreaseHourElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_INCREASE_MINUTE_ELEMENT)
    private MobileElement increaseMinuteElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DECREASE_MINUTE_ELEMENT)
    private MobileElement decreaseMinuteElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_SET_PM_ELEMENT)
    private MobileElement SetPMElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_SET_AM_ELEMENT)
    private MobileElement setAMElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_INCREASE_YEAR_ELEMENT)
    private MobileElement increaseYearElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DECREASE_YEAR_ELEMENT)
    private MobileElement decreaseYearElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_INCREASE_MONTH_ELEMENT)
    private MobileElement increaseMonthElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DECREASE_MONTH_ELEMENT)
    private MobileElement decreaseMonthElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_INCREASE_DAY_ELEMENT)
    private MobileElement increaseDayElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_DECREASE_DAY_ELEMENT)
    private MobileElement decreaseDayElement;

    @AndroidFindBy(accessibility = TestElement.REPORT_CREATE_BUTTON_SEND_ELEMENT)
    private MobileElement buttonSendElement;

    public void reportCreate() throws InterruptedException {



        System.out.print("Create a Custom Report");
        createReportElement.click();
        searchReportElement.sendKeys(REPORT_NAME);

        customReportElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void reportTextBox() {
        Actions A = new Actions(driver);
        System.out.println("Start to create a custom report");
        textBoxElement.click();
        textBoxElement.sendKeys(TEXT_BOX);
        driver.hideKeyboard();
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        commentBoxElement.click();
        commentBoxElement.sendKeys(COMMENT_BOX);
        driver.hideKeyboard();
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        numberElement.click();
        numberElement.sendKeys(NUMBER);
        driver.hideKeyboard();
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
    }

    public void reportPicture() throws InterruptedException {
        Actions A = new Actions(driver);
        pictureElement.click();
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
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        checkboxElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }

    public void reportSignature() throws InterruptedException {

        swipe.swipeToUp();
        signatureSectionElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        signClearElement.click();
        swipe.swipeToLeft();
        signDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //swipe.swipeToUp();



    }

    public void listIncidentBox() throws InterruptedException {
        Actions A = new Actions(driver);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        listIncidentElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        unsecuredDoorElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        unsecuredTypeElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseTypeElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();
        A.sendKeys(Keys.ARROW_DOWN);
        A.build().perform();

        listPickerElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        selectPositionElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void drawVehicle() throws InterruptedException {

        swipe.swipeToUp();
        drawVehicleElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        drawVehicleClearElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        drawVehicleDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void drawSection() throws InterruptedException {
        Actions A = new Actions(driver);

        drawInjuryElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

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

        drawGolfCartElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        swipe.swipeToDown();
        drawGolfCartClearElement.click();
        swipe.swipeToUp();
        drawGolfCartDoneElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);

    }

    public void selectTime() {
        Actions A = new Actions(driver);
        swipe.swipeToUp();
        increaseHourElement.click();
        decreaseMinuteElement.click();
        decreaseMinuteElement.click();

        increaseMonthElement.click();
        increaseMonthElement.click();
        decreaseDayElement.click();
        increaseYearElement.click();
    }

    public void sendReport() {
        swipe.swipeToUp();
        System.out.println("Send the Report...");
        buttonSendElement.click();
        System.out.println("The Report is sent By Maxwell Qiu ");
    }
}
