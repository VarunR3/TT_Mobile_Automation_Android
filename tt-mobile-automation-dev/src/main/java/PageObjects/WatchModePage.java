package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class WatchModePage extends BasePage{
    private final static int SLEEP_TIME= 4;
    private final static int WATCH_MODE_TIME = 150;

    public WatchModePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.WATCH_MODE_START_REAR_ELEMENT)
    private MobileElement startRearElement;

    @AndroidFindBy(accessibility = TestElement.WATCH_MODE_START_FRONT_ELEMENT)
    private MobileElement startFrontElement;

    @AndroidFindBy(accessibility = TestElement.WATCH_MODE_START_WITH_FLASH_ELEMENT)
    private MobileElement startWithFlashElement;

    @AndroidFindBy(xpath = TestElement.WATCH_MODE_STOP_RECORDING_ELEMENT)
    private MobileElement stopRecordingElement;

    public void startRear() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startRearElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        stopRecordingElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void startFront() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startFrontElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        stopRecordingElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }

    public void startWithFlash() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        startWithFlashElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        stopRecordingElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
    }
}

