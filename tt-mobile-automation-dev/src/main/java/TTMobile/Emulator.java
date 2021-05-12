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
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
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

    @Test(priority = 0, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void login() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // geoFencingSetup.setLocation();
        appPermission.appPermission();
        siteLogin.guardLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 1, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void clockIn() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clockIn.clockIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2,groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void Positions() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        changePosition.position();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        changePosition.changePosition();
        Thread.sleep(10000);
    }

    @Test(priority = 3, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void startTour() throws InterruptedException {

        homePage();
        System.out.println("Checkpoints Test...");
        androidDashboardPage.dashboardCheckpoints();

        startTour.checkpointsDashboard();

        //startTour.viewCheckPoints();

        Thread.sleep(10000);
    }

    @Test(priority = 4, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void createReport() throws InterruptedException {
        //homePagecheck();
        System.out.println("Create & Submit the Custom Report");

        reportCreate.reportClick();
        reportCreate.reportCreate();
        reportCreate.reportTextBox();
        reportCreate.reportPicture();
        reportCreate.listIncidentBox();
        reportCreate.drawVehicle();
        reportCreate.drawSection();
        reportCreate.reportSignature();
        reportCreate.selectTime();
        reportCreate.sendReport();
        Thread.sleep(10000);
    }

    @Test(priority = 5, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void browseReport() throws InterruptedException {
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
    }

    @Test(priority = 6, groups = {TestDevice.REAL_DEVICE})
    public void mobileDispatch() throws InterruptedException {
        homePage();
        System.out.println("Mobile Dispatch Test...");
        dispatchTasks.dashboardDispatchTask();
        dispatchTasks.siteLocationNavigate();
        dispatchTasks.dispatchTaskStatus();
        dispatchTasks.fillOutReport();
        dispatchTasks.allClear();
    }

    @Test(priority = 7, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void messageBoard() throws InterruptedException {

        homePage();
        messageBoard.dashboardMessageBoard();
        messageBoard.postNewMessage();
        messageBoard.dashboardMessageBoard();
       messageBoard.newMessage();
    }

    @Test(priority = 8, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void postEscalation() throws InterruptedException {
        homePage();
        postEscalation.dashboardPostEscalation();
        postEscalation.checkPostEscalation();
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

    @Test(priority = 12, groups = {TestDevice.REAL_DEVICE})
    public void watchMode() throws InterruptedException {
        watchMode.watchModeDashboard();
        watchMode.startRear();
        watchMode.startFront();
        //On the Emulator it doesn't have the Flash Option
    }

    @Test(priority = 13, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void panicButton() throws InterruptedException {
        homePage();
        panicButton.panicButtonDashboard();
        panicButton.clickPanicButton();
        panicButton.allowPanicButtonProcess();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
    }

    @Test(priority = 14, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void appSettings() throws InterruptedException {
        System.out.println("App Settings...");
        homePage();
        appSettings.reloadSettings();
        appSettings.synchronizedStatus();
        appSettings.systemDiagnostics();
        appSettings.barcodeScanner();
    }

    @Test(priority = 15, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void logout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        System.out.println("The Guard Logout...");

        logout.startBreak();
        logout.cancel();
        logout.clockOutSignOut();
        logout.removeSiteLicense();
    }

    @Test(priority = 16, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void zoneLogin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // geoFencingSetup.setLocation();
        appPermission.appPermission();
        zone.guardLogin();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
        clockIn.clockIn();
        TimeUnit.SECONDS.sleep(TIME_SLEEP);
    }

    @Test(priority = 17, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
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

    @Test(priority = 18, groups = {TestDevice.REAL_DEVICE})
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

    @Test(priority = 19, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void zoneLogout() throws InterruptedException {
        homePage();
        logout.clockOutSignOut();
        logout.removeSiteLicense();
    }

    @Test(priority = 20, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void departmentLogin() throws InterruptedException {
        //appPermission.appPermission();
        department.guardLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 21, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void BYOD() throws InterruptedException {
        byod.byodClockIn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test(priority = 22, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
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


}
