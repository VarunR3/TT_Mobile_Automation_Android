package ChangePosition;

import PageObjects.BasePage;
import PageObjects.ChangePositionPage.AndroidChangePositionPage;
import PageObjects.ChangePositionPage.ChangePositionPage;
import PageObjects.ChangePositionPage.ChangePositionPageFactory;
import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class ChangePosition  {
    private AppiumDriver<MobileElement> driver;

   // private DashboardPage dashboardPage;
    //private ChangePositionPage changePositionPage;


    private AndroidDashboardPage androidDashboardPage;
    private AndroidChangePositionPage androidChangePositionPage;

    public ChangePosition(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
       // this.dashboardPage = DashboardPageFactory.createPage(driver);
        //this.changePositionPage = ChangePositionPageFactory.createPage(driver);
        this.androidDashboardPage = new AndroidDashboardPage(driver);
        this.androidChangePositionPage=new AndroidChangePositionPage(driver);

    }


    public void position() {
        System.out.println("Entered in to Positions");
        //dashboardPage.dashboardChangePosition();
        androidDashboardPage.dashboardChangePosition();
    }

    public void changePosition() throws InterruptedException {
        androidChangePositionPage.changePosition();
    }
}
