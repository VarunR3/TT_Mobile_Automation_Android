package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckpointPage extends BasePage {
    final static int SLEEP_TIME = 4;
    public CheckpointPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    // View Checkpoints
    @AndroidFindBy(xpath = TestElement.START_A_TOUR_ELEMENT)
    private MobileElement startATourElement;

    @AndroidFindBy(xpath = TestElement.SELECT_TOUR_ELEMENT)
    private MobileElement selectTourElement;

    @AndroidFindBy(accessibility = TestElement.TOUR_SHOW_MORE_ELEMENT)
    private MobileElement showMoreElement;

    @AndroidFindBy(accessibility = TestElement.TOUR_SHOW_LESS_ELEMENT)
    private MobileElement showLessElement;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT1_ELEMENT)
    private MobileElement checkpoint1Element;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT2_ELEMENT)
    private MobileElement checkpoint2Element;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT3_ELEMENT)
    private MobileElement checkpoint3Element;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT4_ELEMENT)
    private MobileElement checkpoint4Element;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT5_ELEMENT)
    private MobileElement checkpoint5Element;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT_GPS_ELEMENT)
    private MobileElement checkpointGPSElement;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT_CHOOSE_REASON_ELEMENT)
    private MobileElement chooseReasonElement;

    @AndroidFindBy(xpath = TestElement.CHECKPOINT_WITH_REPORT_ELEMENT)
    private MobileElement checkpointsWithReportElement;

    @AndroidFindBy(xpath = TestElement.FINISH_TOUR_ELEMENT)
    private MobileElement finishTourElement;

    public void viewCheckpoints() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startATourElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);//
       selectTourElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);//
//        driver.closeApp();
//        TimeUnit.SECONDS.sleep(SLEEP_TIME);
//        driver.runAppInBackground(Duration.ofSeconds(5));
        //showMoreElement.click();
        //showLessElement.click();
        checkpoint1Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpoint2Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpoint3Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpoint4Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpoint5Element.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpointGPSElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        chooseReasonElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        checkpointsWithReportElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        finishTourElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void checkpointsWithReport() {
        checkpointsWithReportElement.click();
    }

    public void finishTour() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        finishTourElement.click();
    }
}


