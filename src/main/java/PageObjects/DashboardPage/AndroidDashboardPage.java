package PageObjects.DashboardPage;

import PageObjects.BasePage;
import Resource.TestElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AndroidDashboardPage extends BasePage implements DashboardPage {

    public AndroidDashboardPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_TIME_CLOCK_ELEMENT)
    private MobileElement dashboardTimeClockElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_CHANGE_POSITION_ELEMENT)
   // @iOSXCUITFindBy(accessibility = TestElement.DASHBOARD_CHANGE_POSITION_ELEMENT)
    private MobileElement dashboardChangePositionElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_CHECKPOINTS_ELEMENT)
    private MobileElement dashboardCheckpointsElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_REPORT_LOGS_ELEMENT)
    private MobileElement dashboardReportsLogsElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_MESSAGE_BOARD_ELEMENT)
    private MobileElement dashboardMessageBoardElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_LONE_WORKER_ELEMENT)
    private MobileElement dashboardLoneWorkerElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_POST_ESCALATION_ELEMENT)
    private MobileElement dashboardPostEscalationElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_VISITOR_LOG_ELEMENT)
    private MobileElement dashboardVisitorLogElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_ASSET_MANAGEMENT_ELEMENT)
    private MobileElement dashboardAssetManagementElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_EMERGENCY_CONTACTS_ELEMENT)
    private MobileElement dashboardEmergencyContactsElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_FLASHLIGHT_ELEMENT)
    private MobileElement dashboardFlashlightElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_CCTV_ELEMENT)
    private MobileElement dashboardCCTVElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_SCHEDULES_ELEMENT)
    private MobileElement dashboardSchedulesElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_WATCH_MODE_ELEMENT)
    private MobileElement dashboardWatchModeElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_PANIC_BUTTON_ELEMENT)
    private MobileElement dashboardPanicButtonElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_SETTINGS_ELEMENT)
    private MobileElement dashboardSettingsElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_DISPATCH_TASKS_ELEMENT)
    private MobileElement dashboardDispatchTasksElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_TEAM_ELEMENT)
    private MobileElement dashboardTeamElement;

    @AndroidFindBy(accessibility = TestElement.DASHBOARD_RUNSHEET_ELEMENT)
    private MobileElement dashboardRunsheetElement;

    @AndroidFindBy(xpath = TestElement.DASHBOARD_SITES_ELEMENT)
    private MobileElement dashboardSitesElement;


    public void dashboardReport () {

        dashboardReportsLogsElement.click();
    }
    public void dashboardCheckpoints () {

        dashboardCheckpointsElement.click();
    }

    public void dashboardVisitorLog() {

        dashboardVisitorLogElement.click();
    }

    public void dashboardSettings () {

        dashboardSettingsElement.click();
    }

    public void dashboardDispatchTasks () {

        dashboardDispatchTasksElement.click();
    }

    public void dashboardWatchMode() {

        dashboardWatchModeElement.click();
    }

    public void dashboardMessageBoard() {

        dashboardMessageBoardElement.click();
    }

    public void dashboardEmergencyContact() {

        dashboardEmergencyContactsElement.click();
    }

    public void setDashboardPostEscalation() {

        dashboardPostEscalationElement.click();
    }

    public void dashboardChangePosition() {

        dashboardChangePositionElement.click();
    }

    public void dashboardFlashlight() {

        dashboardFlashlightElement.click();
    }

    public void dashboardPanicButton() {

        dashboardPanicButtonElement.click();
    }

    public void dashboardTeam() {

        dashboardTeamElement.click();
    }

    public void dashboardSchedules() {

        dashboardSchedulesElement.click();
    }

    public void dashboardRunsheet() {

        dashboardRunsheetElement.click();
    }

    public void dashboardSites() {

        dashboardSitesElement.click();
    }
    public void dashboardTimeClock() {

        dashboardTimeClockElement.click();
    }
}
