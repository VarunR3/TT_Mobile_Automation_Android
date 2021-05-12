package PageObjects.TimeClockPage;

import PageObjects.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class iOSTimeClockPage extends BasePage implements TimeClockPage {

    static final int CLOCK_IN_INDEX = 1;
    static final int SIGN_OUT_INDEX = 2;
    static final int CANCEL_INDEX = 3;

    public iOSTimeClockPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void setTimeClockIndex(int index) {

        String timeClockSelector = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + index + "]";
        driver.findElement(MobileBy.iOSClassChain(timeClockSelector));
    }

    @Override
    public void clockIn() {
        setTimeClockIndex(CLOCK_IN_INDEX);
    }
}
