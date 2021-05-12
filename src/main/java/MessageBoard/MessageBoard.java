package MessageBoard;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.MessageBoardPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class MessageBoard {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    private int SLEEP_TIME = 5;

    Swipe swipe;

    private DashboardPage dashboardPage;
    private MessageBoardPage messageBoardPage;
    private AndroidDashboardPage androidDashboardPage; //

    public MessageBoard(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.messageBoardPage = new MessageBoardPage(driver, swipe);

        this.androidDashboardPage=new AndroidDashboardPage(driver);//
    }

    public void dashboardMessageBoard() throws InterruptedException {
        System.out.println("Message Board Feature");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
        //dashboardPage.dashboardMessageBoard();
        androidDashboardPage.dashboardMessageBoard();
    }

    public void postNewMessage() throws InterruptedException {
        System.out.println("Post a New Message ");
        messageBoardPage.postNewMessage();
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void newMessage() throws InterruptedException {
        System.out.println("Select New Message");
        messageBoardPage.newMessage();
       // ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
