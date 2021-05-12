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
import PanicButton.PanicButton;
import PostEscalation.PostEscalation;
import Resource.GeoFencingSetup;
import Resource.ImportPicture;
import Resource.TestDevice;
import Runsheet.Runsheet;
import Schedules.Schedules;
import Setting.AppSettings;
import Sites.Sites;
import Team.Team;
import VisitorLogs.VisitorLog;
import WatchMode.WatchMode;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RealDevice {

    final static String APP = "/Users/varunrajkanchumarthi/Downloads/TrackTik.ipa";

    final static String SERVER_URL_ANDROID = "http://127.0.0.1:4723/wd/hub";
    final static int TIME_SLEEP = 4;
    final static String DEVICE_NAME = "Varzphone";
    final static String UDID = "b518c2f8db25542ba899b02136bb0fa053eaf8cd";
    final static String PLATFORM_NAME = "IOS";
    final static String PLATFORM_VERSION = "14.4.2";
    final static String APP_PACKAGE = "com.staffr.app";
    final static String APP_ACTIVITY = "com.staffr.app.GuardTrackerActivity";

    AppPermission appPermission;
    SiteLogin siteLogin;
    clockIn clockIn;
    ReportCreate reportCreate;
    ReportBrowse reportBrowse;
    Logout logout;
    StartTour startTour;
    AppSettings appSettings;
    VisitorLog visitorLog;
    DispatchTasks dispatchTasks;
    WatchMode watchMode;
    ImportPicture importPicture;
    GeoFencingSetup geoFencingSetup;
    MessageBoard messageBoard;
    DepartmentLogin department;
    BYOD byod;
    EmergencyContact emergencyContact;
    Flashlight flashlight;
    PanicButton panicButton;
    PostEscalation postEscalation;
    ChangePosition changePosition;
    Team team;
    Schedules schedules;
    ZoneLogin zone;
    Sites sites;
    Runsheet runsheet;
    BreakManagement breakManagement;

    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    @BeforeTest()
    public void setup() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //capabilities.setCapability("autoGrantPermissions", "false" );
       // capabilities.setCapability("databaseEnabled", "true");
       // capabilities.setCapability("noRest", "false");
        //capabilities.setCapability("full-reset", "false");
        capabilities.setCapability("deviceName", DEVICE_NAME);
        capabilities.setCapability("udid", UDID);
        capabilities.setCapability("platformName", PLATFORM_NAME);
        capabilities.setCapability("platformVersion", PLATFORM_VERSION);
        //capabilities.setCapability("appPackage",APP_PACKAGE);
        //capabilities.setCapability("appActivity", APP_ACTIVITY);
        capabilities.setCapability("app", APP);
        if (PLATFORM_NAME.equals("IOS")) {
            driver = new IOSDriver<MobileElement>(
                    new URL(SERVER_URL_ANDROID),
                    capabilities);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        appPermission = new AppPermission(driver);
        siteLogin = new SiteLogin(driver);
        clockIn = new clockIn(driver);
        reportCreate = new ReportCreate(driver);
        reportBrowse = new ReportBrowse(driver);
        logout = new Logout(driver);
        startTour = new StartTour(driver);
        visitorLog = new VisitorLog(driver);
        appSettings = new AppSettings(driver);
        dispatchTasks = new DispatchTasks(driver);
        watchMode = new WatchMode(driver);
        importPicture = new ImportPicture(driver,PLATFORM_NAME);
        geoFencingSetup = new GeoFencingSetup(driver);
        messageBoard = new MessageBoard(driver);
        department = new DepartmentLogin(driver);
        byod = new BYOD(driver);
        emergencyContact = new EmergencyContact(driver);
        flashlight = new Flashlight(driver);
        panicButton = new PanicButton(driver);
        postEscalation = new PostEscalation(driver);
        changePosition = new ChangePosition(driver);
        team = new Team(driver);
        schedules = new Schedules(driver);
        zone = new ZoneLogin(driver);
        sites = new Sites(driver);
        runsheet = new Runsheet(driver);
        breakManagement = new BreakManagement(driver);

        importPicture.importPictureLocally();
        geoFencingSetup.setLocation();
    }

    @AfterTest()
    public void uninstallApp() {
        driver.removeApp(APP_PACKAGE);
    }


    @Test(priority = 0, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void login() throws InterruptedException {
        geoFencingSetup.setLocation();
        appPermission.appPermission();
        siteLogin.guardLogin();
    }

    @Test(priority = 1, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void clockIn() {
        clockIn.clockIn();
    }

    @Test(priority = 1, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void changePosition() throws InterruptedException {
        //changePosition.dashboardChangePosition();
        //changePosition.changePosition();
    }

    @Test(priority = 2, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void startTour() throws InterruptedException {
        System.out.println("Checkpoints Test...");
        startTour.checkpointsDashboard();
        startTour.viewCheckPoints();
        startTour.checkpointsWithReport();
        startTour.finishTour();
    }

    @Test(priority = 3, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void createReport() throws InterruptedException {
        System.out.println("Create & Submit the Custom Report");
        reportCreate.reportClick();
        reportCreate.reportCreate();
        reportCreate.reportTextBox();
        reportCreate.reportPicture();
        reportCreate.reportSignature();
        reportCreate.listIncidentBox();
        reportCreate.drawVehicle();
        reportCreate.drawSection();
        reportCreate.selectTime();
        reportCreate.sendReport();
    }

    @Test(priority = 4, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void browseReport() throws InterruptedException {
        System.out.println("Browse & Verify the Custom Report");
        reportBrowse.reportClick();
        reportBrowse.viewMySiteReports();
        reportBrowse.editMySiteReportsTextBox();
        reportBrowse.editMySiteReportsPictures();
        reportBrowse.editSignature();
        reportBrowse.editCheckbox();
        reportBrowse.editListIncidentBox();
        reportBrowse.editDrawSection();
        reportBrowse.editSelectTime();
        reportBrowse.sendNewReport();
    }

    @Test(priority = 4, groups = {TestDevice.REAL_DEVICE})
    public void mobileDispatch() throws InterruptedException {
        System.out.println("Mobile Dispatch Test...");
        dispatchTasks.dashboardDispatchTask();
        dispatchTasks.siteLocationNavigate();
        dispatchTasks.dispatchTaskStatus();
        dispatchTasks.fillOutReport();
        dispatchTasks.allClear();
    }

    @Test(priority = 5, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void messageBoard() throws InterruptedException {
        messageBoard.dashboardMessageBoard();
        messageBoard.postNewMessage();
        messageBoard.newMessage();
    }

    @Test(priority = 6, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void postEscalation() throws InterruptedException {
        postEscalation.dashboardPostEscalation();
        postEscalation.checkPostEscalation();
    }

    @Test(priority = 7, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void visitorLog() throws InterruptedException {
        System.out.println("Visitor Log Test...");
        visitorLog.visitorLogDashboard();
        visitorLog.logInVisitor();
        visitorLog.viewCurrentVisitor();
        visitorLog.searchVisitorCheckIn();
        visitorLog.tappingCameraButton();
        visitorLog.searchVisitors();
        visitorLog.reloadSettings();
    }

    @Test(priority = 8, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void team() throws InterruptedException {
        team.dashboardTeam();
        team.callTeamMember();
    }


    @Test(priority = 9, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void emergencyContact() throws InterruptedException {
        emergencyContact.dashboardEmergencyContact();
        emergencyContact.clickEmergencyContact();
    }

    @Test(priority = 10, groups = {TestDevice.REAL_DEVICE})
    public void flashlight() throws InterruptedException {
        flashlight.dashboardFlashlight();
    }

    @Test(priority = 11, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void schedule() throws Exception {
        schedules.schedulesDashboard();
        schedules.searchSchedules();
        schedules.verifySchedule();
    }

    @Test(priority = 12, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void watchMode() throws InterruptedException {
        watchMode.watchModeDashboard();
        watchMode.startRear();
        watchMode.startFront();
        watchMode.startWithFlash();
    }

    @Test(priority = 13, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void panicButton() throws InterruptedException {
        panicButton.panicButtonDashboard();
        panicButton.clickPanicButton();
        panicButton.allowPanicButtonProcess();
    }

    @Test(priority = 14, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void appSettings() throws InterruptedException {
        System.out.println("App Settings...");
        appSettings.settingDashboard();
        appSettings.changePIN();
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
        zone.guardLogin();
    }

    @Test(priority = 17, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void sites() throws InterruptedException {
        sites.dashboardSites();
        sites.signInToSite();
        sites.verifyCurrentSiteBannerDisplays();
        sites.navigateToSite();
        sites.viewSiteSchedule();
        sites.leaveSite();

    }
    @Test(priority = 18, groups = {TestDevice.REAL_DEVICE})
    public void runsheet() throws InterruptedException {
        runsheet.runsheetDashboard();
        runsheet.selectRunsheet();
        runsheet.startRunsheet();
        runsheet.verifyRunsheetElementDisplays();
        runsheet.runsheetOnRoute();
        runsheet.navigateToSite();
        runsheet.postponeLater();
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
        logout.clockOutSignOut();
        logout.removeSiteLicense();
    }

    @Test(priority = 20, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void departmentLogin() throws InterruptedException {
       department.guardLogin();
    }

    @Test(priority = 21, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void BYOD() throws InterruptedException {
        byod.byodClockIn();
    }

    @Test(priority = 22, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void breakManagement() throws InterruptedException {
        breakManagement.startBreak();
        breakManagement.clockOutSignOut();
    }

    @Test(priority = 23, groups = {TestDevice.REAL_DEVICE, TestDevice.EMULATOR})
    public void geoFencing() throws InterruptedException {
        geoFencingSetup.setOutRangeLocation();
        siteLogin.guardLogin();
        logout.clockOutSignIn();
        logout.removeSiteLicense();
    }


}

