package PageObjects.DashboardPage;

import PageObjects.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class iOSDashboardPage extends BasePage implements DashboardPage {

    static final int REPORT_TILE_INDEX = 4;
    static final int CHECKPOINT_TILE_INDEX = 3;
    static final int VISITOR_LOG_TILE_INDEX = 10;
    static final int SETTING_TILE_INDEX = 17;
    static final int DISPATCH_TASK_TILE_INDEX = 5;
    static final int WATCH_MODE_TILE_INDEX = 16;
    static final int MESSAGE_BOARD_TILE_INDEX = 6;
    static final int EMERGENCY_CONTACT_TILE_INDEX = 13;
    static final int POST_ESCALATION_TILE_INDEX = 9;
    static final int CHANGE_POSITION_TILE_INDEX = 7;
    static final int PANIC_BUTTON_TILE_INDEX = 12;
    static final int TEAM_TILE_INDEX = 14;
    static final int TIME_CLOCK_TILE_INDEX = 2;
    static final int SCHEDULE_TILE_INDEX = 15;
    static final int RUN_SHEET_TILE_INDEX = 5;
    static final int SITE_TILE_INDEX = 3;

    public iOSDashboardPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void selectDashboardElementByIndex(int index) {

        String selector = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + index + "]";
        driver.findElement(MobileBy.iOSClassChain(selector)).click();
    }

    @Override
    public void dashboardReport() {

        selectDashboardElementByIndex(REPORT_TILE_INDEX);
    }

    @Override
    public void dashboardCheckpoints() {

        selectDashboardElementByIndex(CHECKPOINT_TILE_INDEX);
    }

    @Override
    public void dashboardVisitorLog() {

        selectDashboardElementByIndex(VISITOR_LOG_TILE_INDEX);
    }

    @Override
    public void dashboardSettings() {

        selectDashboardElementByIndex(SETTING_TILE_INDEX);
    }

    @Override
    public void dashboardDispatchTasks() {

        selectDashboardElementByIndex(DISPATCH_TASK_TILE_INDEX);
    }

    @Override
    public void dashboardWatchMode() {

        selectDashboardElementByIndex(WATCH_MODE_TILE_INDEX);
    }

    @Override
    public void dashboardMessageBoard() {

        selectDashboardElementByIndex(MESSAGE_BOARD_TILE_INDEX);
    }

    @Override
    public void dashboardEmergencyContact() {

        selectDashboardElementByIndex(EMERGENCY_CONTACT_TILE_INDEX);
    }

    @Override
    public void setDashboardPostEscalation() {

        selectDashboardElementByIndex(POST_ESCALATION_TILE_INDEX);
    }

    @Override
    public void dashboardChangePosition() {

        selectDashboardElementByIndex(CHANGE_POSITION_TILE_INDEX);
    }

    @Override
    public void dashboardFlashlight() {
        //TODO Unused by iOS. Determine if used on Android
    }

    @Override
    public void dashboardPanicButton() {
        selectDashboardElementByIndex(PANIC_BUTTON_TILE_INDEX);
    }

    @Override
    public void dashboardTeam() {
        selectDashboardElementByIndex(TEAM_TILE_INDEX);
    }

    @Override
    public void dashboardSchedules() {
        selectDashboardElementByIndex(SCHEDULE_TILE_INDEX);
    }

    @Override
    public void dashboardRunsheet() {
        selectDashboardElementByIndex(RUN_SHEET_TILE_INDEX);
    }

    @Override
    public void dashboardSites() {
        selectDashboardElementByIndex(SITE_TILE_INDEX);
    }

    @Override
    public void dashboardTimeClock() {
        selectDashboardElementByIndex(TIME_CLOCK_TILE_INDEX);
    }
}
