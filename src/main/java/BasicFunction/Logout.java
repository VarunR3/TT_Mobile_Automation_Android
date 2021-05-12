package BasicFunction;


import PageObjects.LogoutPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Logout {
    private AppiumDriver<MobileElement> driver;

    private LogoutPage logoutPage;
    private Swipe swipe;

    public Logout(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.logoutPage = new LogoutPage(this.driver);
    }

    public void startBreak() throws InterruptedException {
        swipe.swipeToDown();
        logoutPage.startBreak();
    }

    public void cancel() throws InterruptedException {
        logoutPage.cancel();
    }

    public void clockOutSignIn() throws InterruptedException {
        logoutPage.clockOutSignIn();
    }

    public void clockOutSignOut() throws InterruptedException {
        logoutPage.clockOutSignOut();
    }
    public void removeSiteLicense() throws InterruptedException {
        logoutPage.removeSiteLicense();
    }
}
