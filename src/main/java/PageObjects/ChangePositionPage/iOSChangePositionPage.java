package PageObjects.ChangePositionPage;

import PageObjects.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class iOSChangePositionPage extends BasePage implements ChangePositionPage {

    public iOSChangePositionPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public void changePosition() throws InterruptedException {

        String searchBarSelector = "**/XCUIElementTypeSearchField";
        MobileElement searchBar = driver.findElement(MobileBy.iOSClassChain(searchBarSelector));
        searchBar.click();
        searchBar.sendKeys(POSITION_NAME);
        driver.hideKeyboard();
        String selector = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]";
        driver.findElement(MobileBy.iOSClassChain(selector)).click();
    }
}
