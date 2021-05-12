package Flashlight;

import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

// Flashlight only could be tested on the RealDevice
public class Flashlight {
    private AppiumDriver<MobileElement> driver;
    private Swipe swipe;

    private DashboardPage dashboardPage;

    public Flashlight(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
    }

    public void dashboardFlashlight() {
        System.out.println("Turn ON/OFF the Flash");
        swipe.swipeToUp();
        dashboardPage.dashboardFlashlight();
        swipe.swipeToUp();
        dashboardPage.dashboardFlashlight();
    }
}
