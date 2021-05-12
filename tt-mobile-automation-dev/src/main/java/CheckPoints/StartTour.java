package CheckPoints;


import PageObjects.CheckpointPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.ReportCreatePage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class StartTour {
    private AppiumDriver<MobileElement> driver;
    Swipe swipe;

    private DashboardPage dashboardPage;
    private CheckpointPage checkpointPage;
    private ReportCreatePage reportCreatePage;

    public StartTour(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.swipe = new Swipe(driver);
        this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.checkpointPage = new CheckpointPage(driver);
        this.reportCreatePage = new ReportCreatePage(driver, swipe);
    }

    public void checkpointsDashboard() throws InterruptedException {
        System.out.println("View Checkpoints");
        //dashboardPage.dashboardCheckpoints();
        checkpointPage.viewCheckpoints();
    }

    public void viewCheckPoints() throws InterruptedException{
        checkpointPage.viewCheckpoints();
    }

    public void checkpointsWithReport() throws InterruptedException {
        System.out.println("CheckPoint With Report");
        checkpointPage.checkpointsWithReport();
        reportCreatePage.reportTextBox();
        reportCreatePage.reportPicture();
        reportCreatePage.reportSignature();
        reportCreatePage.listIncidentBox();
        reportCreatePage.drawVehicle();
        reportCreatePage.drawSection();
        reportCreatePage.selectTime();
        reportCreatePage.sendReport();
    }

    public void finishTour() throws InterruptedException {
        System.out.println("Finish The Tour");
        checkpointPage.finishTour();
    }
}

