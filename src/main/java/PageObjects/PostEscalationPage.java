package PageObjects;

import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class PostEscalationPage extends BasePage {
    private final static int SLEEP_TIME = 4;
    private final static String POST_ORDER_NAME= "Test Post Order";

    public PostEscalationPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.POST_ESCALATION_SEARCH_POST_ELEMENT)
    private MobileElement searchPostEscalationElement;

    @AndroidFindBy(id = TestElement.POST_ESCALATION_POST_ORDER_ELEMENT)
    private MobileElement postOrderElement;

    @AndroidFindBy(xpath = TestElement.POST_ESCALATION_BTN_ACKNOWLEDGE_ELEMENT)
    private MobileElement btnAcknowledgeElement;

    @AndroidFindBy(xpath = TestElement.POST_ESCALATION_BTN_UNACKNOWLEDGED_ELEMENT)
    private MobileElement btnUnacknowledgedElement;

    public void clickEscalationOrder() throws InterruptedException {
        System.out.println("Click Escalation Order ");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchPostEscalationElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchPostEscalationElement.sendKeys(POST_ORDER_NAME);
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.hideKeyboard();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        postOrderElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnAcknowledgeElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchPostEscalationElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        searchPostEscalationElement.sendKeys(POST_ORDER_NAME);
        driver.hideKeyboard();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        postOrderElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        btnUnacknowledgedElement.click();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        driver.navigate().back();
    }
}
