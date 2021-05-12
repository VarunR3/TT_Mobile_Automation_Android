package Sites;

import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.SitesPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

public class Sites {
    private AppiumDriver<MobileElement> driver;

    private static int SLEEP_TIME = 4;

    private DashboardPage dashboardPage;
    private SitesPage sitesPage;
    private AndroidDashboardPage androidDashboardPage;

    public Sites(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
       // this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.sitesPage = new SitesPage(driver);
        this.androidDashboardPage = new AndroidDashboardPage(driver);
    }

    public void dashboardSites() throws InterruptedException {
        TimeUnit.SECONDS.sleep(SLEEP_TIME);
       // dashboardPage.dashboardSites();
        androidDashboardPage.dashboardSites();
    }

    public void signInToSite() throws InterruptedException {
        sitesPage.signInToSite();
    }

    public void verifyCurrentSiteBannerDisplays() throws InterruptedException {
        sitesPage.verifyCurrentSiteBannerDisplays();
    }

    public void navigateToSite() throws InterruptedException {
        sitesPage.navigateToSite();
//        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void viewSiteSchedule() throws InterruptedException {
        sitesPage.viewSiteSchedule();
//        for (int i = 0; i <= 1; i++) {
//            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        }
    }

    public void leaveSite() throws InterruptedException {
        sitesPage.leaveSite();
    }
}
