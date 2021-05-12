package TTMobile;

import BYOD.BYOD;
import BasicFunction.*;
import BasicFunction.Login.BaseLogin;
import BasicFunction.Login.DepartmentLogin;
import BasicFunction.Login.SiteLogin;
import BasicFunction.Login.ZoneLogin;
import BreakManagement.BreakManagement;
import ChangePosition.ChangePosition;
import CheckPoints.StartTour;
import DispatchTask.DispatchTasks;
import EmergencyContact.EmergencyContact;
import Flashlight.Flashlight;
import GuardReport.ReportBrowse;
import GuardReport.ReportCreate;
import MessageBoard.MessageBoard;
import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.SitesPage;
import PanicButton.PanicButton;
import PostEscalation.PostEscalation;
import Resource.GeoFencingSetup;
import Resource.ImportPicture;
import Resource.TestDevice;
import Runsheet.Runsheet;
import Schedules.Schedules;
import Setting.AppSettings;
import Resource.Swipe;
import Sites.Sites;
import Team.Team;
import VisitorLogs.VisitorLog;
import WatchMode.WatchMode;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Emulator {
    final static int TIME_SLEEP = 4;

    AppPermission appPermission;
    AndroidDashboardPage androidDashboardPage;//
    SiteLogin siteLogin;
    clockIn clockIn;
    ChangePosition changePosition;
    ReportCreate reportCreate;
    ReportBrowse reportBrowse;
    Logout logout;
    StartTour startTour;
    AppSettings appSettings;
    VisitorLog visitorLog;
    DispatchTasks dispatchTasks;
    ImportPicture importPicture;
    WatchMode watchMode;
    GeoFencingSetup geoFencingSetup;
    MessageBoard messageBoard;
    DepartmentLogin department;
    EmergencyContact emergencyContact;
    Flashlight flashlight;
    PostEscalation postEscalation;
    Team team;
    Schedules schedules;
    BYOD byod;
    ZoneLogin zone;
    Runsheet runsheet;
    BreakManagement breakManagement;
    PanicButton panicButton;
    Sites sites;
    SitesPage sitesPage;


    protected AppiumDriver<MobileElement> driver;
    protected String platformName;
    Swipe swipe;

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    public void setup() throws Exception {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        androidDashboardPage = new AndroidDashboardPage(driver);

        siteLogin = new SiteLogin(driver);
        clockIn = new clockIn(driver);
        appPermission = new AppPermission(driver);
        changePosition = new ChangePosition(driver);
        reportCreate = new ReportCreate(driver);
        reportBrowse = new ReportBrowse(driver);
        logout = new Logout(driver);
        startTour = new StartTour(driver);
        visitorLog = new VisitorLog(driver);
        appSettings = new AppSettings(driver);
        dispatchTasks = new DispatchTasks(driver);
        importPicture = new ImportPicture(driver,platformName);
        watchMode = new WatchMode(driver);
        geoFencingSetup = new GeoFencingSetup(driver);
        messageBoard = new MessageBoard(driver);
        department = new DepartmentLogin(driver);
        emergencyContact = new EmergencyContact(driver);
        flashlight = new Flashlight(driver);
        panicButton = new PanicButton(driver);
        postEscalation = new PostEscalation(driver);
        team = new Team(driver);
        schedules = new Schedules(driver);
        byod = new BYOD(driver);
        runsheet = new Runsheet(driver);
        zone = new ZoneLogin(driver);
        sitesPage=new SitesPage(driver);
        breakManagement=new BreakManagement(driver);

        swipe=new Swipe(driver);

        
//        importPicture.importPictureLocally();
//        geoFencingSetup.setLocation();
//        System.out.println("Wait to dismiss any system location dialogs");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            wait.until(ExpectedConditions.alertIsPresent());
//            driver.switchTo().alert().accept();
//        } catch (Exception e) {
//            System.err.println("   no alert visible after 10 sec.");
//        }
    }

    public void  homePage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.closeApp();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        swipe.swipeToUp();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        driver.findElementByAccessibilityId("TrackTik").click();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
    }

    @BeforeTest
    public void setExtent()
    {
        htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Android Functional Test");
        htmlReporter.config().setTheme(Theme.DARK);

        extent=new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
//    @AfterTest
//    public void endReport()
//    {
//        extent.flush();
//    }


    @Test(priority = 0, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void login() throws InterruptedException {

        test=extent.createTest("Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        test.createNode("appPermission");
        appPermission.appPermission();
        test.createNode("guardLogin");
        siteLogin.guardLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        extent.flush();
    }

    @Test(priority = 1, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void clockIn() {

        test=extent.createTest("ClockIn");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        test.createNode("clockIn");
        clockIn.clockIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        extent.flush();
    }

    @Test(priority = 2,groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void Positions() throws InterruptedException {

        test=extent.createTest("Positions");


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        changePosition.position();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        changePosition.changePosition();
        Thread.sleep(10000);
        extent.flush();
    }

    @Test(priority = 3, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void startTour() throws InterruptedException {

        test=extent.createTest("startTour");

        homePage();
        System.out.println("Checkpoints Test...");
        androidDashboardPage.dashboardCheckpoints();

        startTour.checkpointsDashboard();



        Thread.sleep(10000);
        extent.flush();
    }

    @Test(priority = 4, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void createReport() throws InterruptedException {
        test=extent.createTest("createReport");
        homePage();
        System.out.println("Create & Submit the Custom Report");

        reportCreate.reportClick();
        reportCreate.reportCreate();

        reportCreate.reportTextBox();
        test.createNode("reportTextBox");
        reportCreate.reportPicture();
        test.createNode("reportPicture");
        reportCreate.listIncidentBox();
        test.createNode("listIncidentBox");
        reportCreate.drawVehicle();
        test.createNode("drawVehicle");
        reportCreate.drawSection();
        test.createNode("drawSection");
        reportCreate.reportSignature();
        test.createNode("reportSignature");
        reportCreate.selectTime();
        test.createNode("selectTime");
        reportCreate.sendReport();
        test.createNode("sendReport");
        Thread.sleep(10000);
        extent.flush();
    }

    @Test(priority = 5, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void browseReport() throws InterruptedException {
        test=extent.createTest("browseReport");
        homePage();
        System.out.println("Browse & Verify the Custom Report");
        reportBrowse.reportClick();
        reportBrowse.viewMySiteReports();
        reportBrowse.editMySiteReportsTextBox();
        reportBrowse.editMySiteReportsPictures();

        reportBrowse.editCheckbox();
        reportBrowse.editListIncidentBox();
        reportBrowse.editDrawSection();
        reportBrowse.editSignature();
        reportBrowse.editSelectTime();
        reportBrowse.sendNewReport();
        extent.flush();
    }

    @Test(priority = 6, groups = {TestDevice.REAL_DEVICE})
    public void mobileDispatch() throws InterruptedException {
        test=extent.createTest("mobileDispatch");
        homePage();
        System.out.println("Mobile Dispatch Test...");
        dispatchTasks.dashboardDispatchTask();
        dispatchTasks.siteLocationNavigate();
        dispatchTasks.dispatchTaskStatus();
        dispatchTasks.fillOutReport();
        dispatchTasks.allClear();
        extent.flush();
    }

    @Test(priority = 7, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void messageBoard() throws InterruptedException {

        test=extent.createTest("messageBoard");

        homePage();
        messageBoard.dashboardMessageBoard();
        messageBoard.postNewMessage();
        messageBoard.dashboardMessageBoard();
       messageBoard.newMessage();
        extent.flush();
    }

    @Test(priority = 8, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void postEscalation() throws InterruptedException {
        test=extent.createTest("postEscalation");
        homePage();
        postEscalation.dashboardPostEscalation();
        postEscalation.checkPostEscalation();
        extent.flush();
    }

    @Test(priority = 9, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void visitorLog() throws InterruptedException {
        homePage();
        System.out.println("Visitor Log Test...");
        visitorLog.visitorLogDashboard();
        visitorLog.logInVisitor();
        visitorLog.viewCurrentVisitor();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        visitorLog.searchVisitorCheckIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test(priority = 10, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void team() throws InterruptedException {
        homePage();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        team.dashboardTeam();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        team.callTeamMember();
    }

    @Test(priority = 11, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void emergencyContact() throws InterruptedException {
        homePage();
        emergencyContact.dashboardEmergencyContact();
        emergencyContact.clickEmergencyContact();
    }

    @Test(enabled = false, groups = {TestDevice.REAL_DEVICE})
    public void flashlight()  {
        flashlight.dashboardFlashlight();
    }

    @Test(priority = 12, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void schedule() throws Exception {
        homePage();
        schedules.schedulesDashboard();
        schedules.searchSchedules();
        schedules.verifySchedule();
    }

    @Test(priority = 13, groups = {TestDevice.REAL_DEVICE})
    public void watchMode() throws InterruptedException {
        watchMode.watchModeDashboard();
        watchMode.startRear();
        watchMode.startFront();
        //On the Emulator it doesn't have the Flash Option
    }

    @Test(priority = 14, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void panicButton() throws InterruptedException {
        homePage();
        panicButton.panicButtonDashboard();
        panicButton.clickPanicButton();
        panicButton.allowPanicButtonProcess();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
    }

    @Test(priority = 15, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void appSettings() throws InterruptedException {
        System.out.println("App Settings...");
        homePage();
        appSettings.reloadSettings();
        appSettings.synchronizedStatus();
        appSettings.systemDiagnostics();
        appSettings.barcodeScanner();
    }

    @Test(priority = 16, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void logout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        System.out.println("The Guard Logout...");

        logout.startBreak();
        logout.cancel();
        logout.clockOutSignOut();
        logout.removeSiteLicense();
    }

    @Test(priority = 17, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void zoneLogin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // geoFencingSetup.setLocation();
        //appPermission.appPermission();
        zone.guardLogin();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        clockIn.clockIn();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
    }

    @Test(priority = 18, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void sites() throws InterruptedException {
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        androidDashboardPage.dashboardSites();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        sitesPage.signInToSite();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        androidDashboardPage.dashboardSites();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        sitesPage.navigateToSite();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        androidDashboardPage.dashboardSites();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
         sitesPage.viewSiteSchedule();
        sitesPage.leaveSite();
    }

    @Test(priority = 19, groups = {TestDevice.REAL_DEVICE})
    public void runsheet() throws InterruptedException {
        runsheet.runsheetDashboard();
        runsheet.selectRunsheet();
        runsheet.startRunsheet();
        runsheet.verifyRunsheetElementDisplays();
        runsheet.navigateToSite();
        //runsheet.postponeLater();
        runsheet.requestReassignment();
        runsheet.arriveOnSite();
        runsheet.viewSiteInstructions();
        runsheet.viewSitePostOrders();
        runsheet.finishJob();
        runsheet.optimize();
        runsheet.finish();
    }

    @Test(priority = 20, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void zoneLogout() throws InterruptedException {
        homePage();
        logout.clockOutSignOut();
        logout.removeSiteLicense();
    }

    @Test(priority = 21, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void departmentLogin() throws InterruptedException {
        //appPermission.appPermission();
        department.guardLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 22, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void BYOD() throws InterruptedException {
        byod.byodClockIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test(priority = 23, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void breakManagement() throws InterruptedException {

        breakManagement.startBreak();
        breakManagement.clockOutSignOut();
    }


    @Test(enabled = false, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void geoFencing() throws InterruptedException {
        geoFencingSetup.setOutRangeLocation();
        siteLogin.guardLogin();
        logout.clockOutSignIn();
        logout.removeSiteLicense();
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
            test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report

            String screenshotPath = getScreenshot(driver, result.getName());
           // test.addScreenCaptureFromPath(screenshotPath);
            //test.log(Status.FAIL, "ScreenshotBelow: "+test.addScreenCaptureFromPath(screenshotPath));
            test.fail(screenshotPath, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());




        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
        }
        else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
        }



    }

    public static String getScreenshot(AppiumDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // after execution, you could see a folder "FailedTestsScreenshots" under src folder
        String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);

        return destination;

    }


}
