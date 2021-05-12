package PostEscalation;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.PostEscalationPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PostEscalation {

    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private DashboardPage dashboardPage;
    private PostEscalationPage postEscalationPage;
    private AndroidDashboardPage androidDashboardPage;

    public PostEscalation(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.postEscalationPage = new PostEscalationPage(driver);
        this.androidDashboardPage = new AndroidDashboardPage(driver);
    }

    public void dashboardPostEscalation() {
        System.out.println("Post Escalation Feature");
        //dashboardPage.setDashboardPostEscalation();
        androidDashboardPage.setDashboardPostEscalation();
    }

    public void checkPostEscalation() throws InterruptedException {
        System.out.println("Check Post Escalation");
        postEscalationPage.clickEscalationOrder();
        //((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
        //((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
