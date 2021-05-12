package GuardReport;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.ReportBrowsePage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class ReportBrowse {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;
    final static int SLEEP_TIME = 4;

    private Swipe swipe;
    private DashboardPage dashboardPage;
    private ReportBrowsePage reportBrowsePage;
    private AndroidDashboardPage androidDashboardPage;

    public ReportBrowse(AppiumDriver<MobileElement> driver){
       this.driver = driver;
       this.swipe = new Swipe(this.driver);
       this.dashboardPage = DashboardPageFactory.createPage(driver);
       this.reportBrowsePage = new ReportBrowsePage(driver, swipe);
       this.androidDashboardPage=new AndroidDashboardPage(driver);
    }

    public void reportClick()  {
        //dashboardPage.dashboardReport();
        androidDashboardPage.dashboardReport();

    }

    public void viewMySiteReports() throws InterruptedException {
        reportBrowsePage.viewMySiteReport();
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void editMySiteReportsTextBox() throws InterruptedException {
        reportBrowsePage.editMySiteReportsTextBox();
    }

    public void editMySiteReportsPictures() throws InterruptedException {
        reportBrowsePage.editMySiteReportPictures();
    }

    public void editSignature() throws InterruptedException {
        reportBrowsePage.editSignature();
    }

    public void editCheckbox() throws InterruptedException {
        reportBrowsePage.editCheckbox();
    }

    public void editListIncidentBox() throws InterruptedException {
        reportBrowsePage.editListIncidentBox();
    }
    public void editDrawSection() throws InterruptedException {
        reportBrowsePage.editDrawSection();

    }

    public void editSelectTime() {
        reportBrowsePage.editSelectTime();
    }

    public void sendNewReport() throws InterruptedException {
        reportBrowsePage.sendNewReport();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }
}
