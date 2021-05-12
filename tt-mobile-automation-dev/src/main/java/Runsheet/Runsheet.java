package Runsheet;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.ReportCreatePage;
import PageObjects.RunsheetPage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class Runsheet {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private final static int SLEEP_TIME =4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private RunsheetPage runsheetPage;
    private ReportCreatePage reportCreatePage;
    private AndroidDashboardPage androidDashboardPage;

    public Runsheet(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);

        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.runsheetPage = new RunsheetPage(driver,swipe);
        this.reportCreatePage = new ReportCreatePage(driver, swipe);
        this.androidDashboardPage=new AndroidDashboardPage(driver);
    }

    public void runsheetDashboard() throws InterruptedException {
        System.out.println("Guard App Runsheet");
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // dashboardPage.dashboardRunsheet();
        androidDashboardPage.dashboardRunsheet();
    }

    public void selectRunsheet() throws InterruptedException {
        runsheetPage.selectRunsheet();
    }

    public void startRunsheet() throws InterruptedException {
        runsheetPage.startRunsheet();
    }

    public void verifyRunsheetElementDisplays() throws InterruptedException {
        runsheetPage.verifyRunsheetElementDisplays();
    }

    public void runsheetOnRoute() throws InterruptedException {
        runsheetPage.runsheetOnRoute();
    }

    public void navigateToSite() throws InterruptedException {
        runsheetPage.navigateToSite();

    }

    public void postponeLater() throws InterruptedException {
        runsheetPage.postponeLater();
    }

    public void requestReassignment() throws InterruptedException {
        runsheetPage.requestReassignment();
    }

    public void arriveOnSite() throws InterruptedException {
        runsheetPage.arriveOnSite();
    }

    public void viewSiteInstructions() throws InterruptedException {
        runsheetPage.viewSiteInstructions();
    }

    public void viewSitePostOrders() throws InterruptedException {
        runsheetPage.viewSitePostOrders();

    }

    public void finishJob() throws InterruptedException {
        runsheetPage.finishJob();
        reportCreatePage.reportTextBox();
        reportCreatePage.reportPicture();

        reportCreatePage.listIncidentBox();
        reportCreatePage.drawVehicle();
        reportCreatePage.drawSection();
        reportCreatePage.reportSignature();
        reportCreatePage.selectTime();
        reportCreatePage.sendReport();

    }

    public void optimize() throws InterruptedException {
        runsheetPage.optimize();
    }

    public void finish() throws InterruptedException {
        runsheetPage.finish();
    }
}
