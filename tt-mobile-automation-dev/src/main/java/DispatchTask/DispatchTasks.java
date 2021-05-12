package DispatchTask;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.DispatchTasksPage;
import PageObjects.ReportCreatePage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class DispatchTasks {
    final static int SLEEP_TIME = 4;
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    private Swipe swipe;

    private DashboardPage dashboardPage;
    private DispatchTasksPage dispatchTasksPage;
    private ReportCreatePage reportCreatePage;
    private AndroidDashboardPage androidDashboardPage;

    public DispatchTasks(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe =  new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.dispatchTasksPage = new DispatchTasksPage(driver,swipe);
        this.reportCreatePage = new ReportCreatePage(driver,swipe);
        this.androidDashboardPage = new AndroidDashboardPage(driver);
    }

    public void dashboardDispatchTask() throws InterruptedException {
        System.out.println("Dispatch Task Testing");
        //dashboardPage.dashboardDispatchTasks();
        androidDashboardPage.dashboardDispatchTasks();
        dispatchTasksPage.viewDispatchTasks();
    }

    public void addComments() throws InterruptedException {
        System.out.println("Comment Section for the Dispatch Tasks");
        dispatchTasksPage.addComments();
    }
    public void siteLocationNavigate() throws InterruptedException {
        System.out.println("Navigate Site Location on Google Map");
        dispatchTasksPage.siteLocationNavigate();

    }

    public void dispatchTaskStatus() throws InterruptedException {
        System.out.println("Dispatch Task Status");
        dispatchTasksPage.dispatchTaskStatus();
    }

    public void fillOutReport() throws InterruptedException {
        System.out.println("Fill Out Report for Dispatch Tasks");
        dispatchTasksPage.fillOutReport();
        reportCreatePage.reportTextBox();
        reportCreatePage.reportPicture();

        reportCreatePage.listIncidentBox();
        reportCreatePage.drawVehicle();
        reportCreatePage.drawSection();
        reportCreatePage.reportSignature();
        reportCreatePage.selectTime();
        reportCreatePage.sendReport();
    }

    public void allClear() throws InterruptedException {
        System.out.println("All Clear, Report Completed");
        dispatchTasksPage.allClear();
//        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
//        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

}
