package GuardReport;



import PageObjects.DashboardPage.AndroidDashboardPage;
import PageObjects.DashboardPage.DashboardPage;
import PageObjects.DashboardPage.DashboardPageFactory;
import PageObjects.ReportCreatePage;
import Resource.Swipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ReportCreate {
    private AppiumDriver<MobileElement> driver;
    Swipe swipe;

    private DashboardPage dashboardPage;
    private AndroidDashboardPage androidDashboardPage;
    private ReportCreatePage reportCreatePage;

    public ReportCreate(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        this.swipe = new Swipe(this.driver);
       // this.dashboardPage = DashboardPageFactory.createPage(driver);
        this.androidDashboardPage=new AndroidDashboardPage(driver);
        this.reportCreatePage = new ReportCreatePage(driver, swipe);
    }

    public void reportClick() {
        System.out.print("Entered in to Reports & Logs Tab");
        //dashboardPage.dashboardReport();
        androidDashboardPage.dashboardReport();
    }
    public void reportCreate() throws InterruptedException {
        reportCreatePage.reportCreate();
    }
    public void reportTextBox() {
        System.out.println("Start to create a custom report");
        reportCreatePage.reportTextBox();
    }
    public void reportPicture() throws InterruptedException {
        reportCreatePage.reportPicture();
    }
    public void reportSignature() throws InterruptedException {
        reportCreatePage.reportSignature();
    }
    public void listIncidentBox() throws InterruptedException {
        reportCreatePage.listIncidentBox();
    }
    public void drawVehicle() throws InterruptedException {
        reportCreatePage.drawVehicle();
    }

    public void drawSection() throws InterruptedException {
        reportCreatePage.drawSection();
    }
    public void selectTime() {
        reportCreatePage.selectTime();
    }
    public void sendReport() {
        reportCreatePage.sendReport();
    }

}
