package Team;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Team {
    private AppiumDriver<MobileElement> driver;
    private AndroidDriver<MobileElement> androidDriver;

    private DashboardPage dashboardPage;
    private TeamPage teamPage;
    private AndroidDashboardPage androidDashboardPage; //

    public Team(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.teamPage = new TeamPage(driver);
        this.androidDashboardPage = new AndroidDashboardPage(driver);
    }

    public void dashboardTeam() {
        System.out.println("Guard App Team");
        androidDashboardPage.dashboardTeam();
    }

    public void callTeamMember() throws InterruptedException {
        System.out.println("Search Team Member");
        teamPage.callMember();
        for (int i = 0; i <= 3; i++) {
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }
}
